//Վերցնում եք ամբողջ թվերի զանգված։ Մի ցիկլով գտնում եք տվյալ
// զանգվածի միջի մինիմում ու մաքսիմում թվերը։ Դիտարկում եք տարբեր
// corner case-եր նաև, որպեսզի վստահ լինեք, որ ճիշտա աշխատում։ Օրինակ
// եթե array-ի մեջ բոլոր թվերը նույնն են, ուրեմն ձեր մինիմումն ու մաքսիմումը
// պիտի համընկնեն։

import java.util.Scanner;

public class MinMaxFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array size
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        // Check for an empty array
        if (n <= 0) {
            System.out.println("The array is empty");
            System.exit(1);
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Set initial min and max values
        int min = arr[0];
        int max = arr[0];

        // One loop to find the min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Output results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

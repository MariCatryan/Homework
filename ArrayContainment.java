//Ենթադրենք ունենք 2 հատ զանգված տարբեր չափերով։ Ենթադրվումա, որ
//arr2.length < arr1.length ու arr2.lentgh > 1
//2 զանգվածների մեջ էլ չկրկնվող տարրեր են։ Էս պայմանը նախօրոք պետք չի վալիդացիա անել
//      Դուք պետքա ստուգեք, թե արդյոք 2-րդ զանգվածը պարունակվումա առաջինի մեջ թե չէ
//      ու տպեք համապատասխան հաղորդագրություն։
//      Օրինակ1:  Input -arr1 [5, 7, 8, 0, -2, 4]  arr2 [8, 0, -2],
//      output - true։ Օրինակ 2: Input - arr1 [9, 1, -3, 4, 7], arr2 [1, -3, 8, 7]:
//      Output - false

public class ArrayContainment {
    public static void main(String[] args) {
        int[] arr1 = {5, 7, 8, 0, -2, 4};
        int[] arr2 = {8, 1, -2};

        // Check if all elements of arr2 are in arr1
        boolean result = containsAllElements(arr1, arr2);

        // Print the result
        System.out.println(result);
    }

    // Method to check if all elements of the second array are in the first array
    public static boolean containsAllElements(int[] arr1, int[] arr2) {
        // Iterate through each element of the second array
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            // Iterate through the first array to find the element of the second array
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break; // Element found, exit the inner loop
                }
            }

            // If the element of the second array is not found in the first array, return false
            if (!found) {
                return false;
            }
        }

        // All elements of the second array are found in the first array
        return true;
    }
}


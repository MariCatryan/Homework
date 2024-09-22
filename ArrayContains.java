//Մի հատ էլ պարզ խնդիր. պիտի գրեք մեթոդ, որը կստանաս ամբողջ
//թվերի array ու ևս մեկ՝ array-ի տիպն ունեցող պարամետր։
//Ձեր մեթոդը պետքա վերադարձնի true, եթե էդ թիվը պարունակվումա
//array-ի մեջ, ու false, եթե չի պարունակվում։
public class ArrayContains {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int numberToFind = 6;

        boolean result = containsNumber(array, numberToFind);
        System.out.println("Does the array contain " + numberToFind + "? " + result);
    }

    public static boolean containsNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}


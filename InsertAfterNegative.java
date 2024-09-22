public class InsertAfterNegative {
    public static void main(String[] args) {
        int[] array = {4, 7, 9, -2, 1, -1};
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                for (int j = 0; j <= i; j++) {
                    newArray[j] = array[j];
                }
                newArray[i + 1] = i;

                for (int j = 0; j < newArray.length; j++) {
                    System.out.print(newArray[j] + " ");

                }

            }
        }
    }
}

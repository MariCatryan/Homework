//Գրեք մեթոդ, որը կընդունի ամբողջ թվերի զանգված։ Ձեր խնդիրնա
// գտնել մեթոդին փոխանցված array-ում դրական ու բացասական թվերի
// հարաբերակցությունը` positive / negative, ու վերադարձնել տվյալ
// double թիվը։ Եթե չլինեն բացասական թվեր, թող վերադարձնի -1։

public class PositiveNegativeRatio {
    public static void main(String[] args) {
        int[] array = {-3, -2, -5, -1, -4, 0, -3};
        double ratio = calculateRatio(array);
        System.out.println(ratio);
    }

    public static double calculateRatio(int[] array) {
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        if (negativeCount == 0) {
            return -1;
        }

        return (double) positiveCount / negativeCount;
    }
}


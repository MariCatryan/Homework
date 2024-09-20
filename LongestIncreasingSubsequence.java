//Գրել ծրագիր, որը կգտնի տվյալ զանգվածում ամենաերկար աճող հաջորդականության երկարությունը։
//Օրինակ1:  [3, 4, 5, 2, 7, 8, 9], output: 3, որովհետև ամենաերկար հաջորդականությունը 2,7,8,9-նա, որի երկարությունը 3-ա
//Օրինակ2: [5,9, -2, -3, 7], output: 1, որովհետև 5,9-ը ամենաերկար հաջորդականություննա։
//Էս երկարութոյունը մի շփոթեք array.lentgh-ի հետ ու ձեր մոտ թող սխալ տպավորություն
//չթողի, որտև սրա մեջ գոնե 2 անդամ պետք են որ հաջորդականությունը   երկարություն ունենա ընդհանրապես։

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] array = {-3, 4, 10, 15, 7, 2, 1};

        if (array.length < 2) {
            System.out.println("Not enough elements to find a sequence");
            System.exit(1);
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
        }


        System.out.println("Length of the longest increasing subsequence: " + maxLength);

        System.exit(0);
    }
}

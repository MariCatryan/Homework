//Ունեք սովորական String փոփոխական, որի մեջ անգլերեն տառերով տեքստա գրած
// պրոբելներով։։ Դուք պիտի գրեք մեթոդ, որը կստանաս տվյալ String-ը որպես պարամետր
// ու կվերադարձնի String-ում բառերի քանակը։
//Բառ համարվումա ցանկացած մինիմում >=1 տառ(եր)ի հաջորդականությունը
//Պրոբելների քանակը կարա լինի 1-ից ավել տեքստի մեջ ցանկացած 2 բառի արանքում
//Լուծումը ստուգում եք տարբեր տեսքի տեքստերի համար։  Ծրագիրը պիտի իտերացիա
//անի String-ի վրա, String-ի ստանդարտ մեթոդներից կարաք օգտագործեք իտերացիա
// անելու համար անհրաժեշտները՝ String-ի երկարությունը վերցնելու մեթոդն ու
// հերթական ինդեքսի տակ գտնվող տառը վերցնելու համար նախատեսված մեթոդը, ոչ ավելին։
public class WordCount {
    public static void main(String[] args) {
        String text = "This is an example text with multiple spaces.";
        int wordCount = countWords(text);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (Character.isLetter(currentChar)) {
                if (!inWord) {
                    inWord = true;
                    count++;
                }
            } else {
                inWord = false;
            }
        }

        return count;
    }
}

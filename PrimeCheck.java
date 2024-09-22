//Ունեք զանգված, որի մեջ կան տարբեր դրական ամբողջ թվեր. հեշտության
// համար array-ը ուղիղ հայտարարեք ու ինիցալիզացրեք կոդի մեջ։ Ձեզնից
// պահանջվումա գրել ծրագիր, որը կստուգի array-ի հերթական անդամի պարզ
// լինել-չլինելը ու կտպի համապատասխան հաղորդագրություն։ Յուրաքանչյուր անդամի
// պարզ լինել-չլինելը պետքա ստուգբի առանձին մեթոդով։ Նորից եմ շեշտում, յուրաքանչյուր
// թվի ստուգելը պետքա լինի առանձին մեթոդով, ոչ թե ամբողջ array-ինը։ Ձեր մեթոդը
// պետքա վերադարձնի սխալա թե ճիշտ, որ array-ի հերթական թիվը պարզա։

public class PrimeCheck {
    public static void main(String[] args) {
        int[] array = {2, 56, 31, 5, 9, 7, 24, 8};

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (isPrime(number)) {
                System.out.println(number + " is a prime number");
            }
            else {
                System.out.println(number + " is not a prime number");
            }
        }
    }

    public static boolean isPrime (int number) {
        if (number < 2 ) {
            System.out.println(number + "is not a prime number");
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }


        }
        return true;
    }

}

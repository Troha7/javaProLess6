package ua.hillelit.lms;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();

        checkSumSign(-10,1);

        printColor(10);

        compareNumbers(11,10);

        System.out.println(sumWithin(10,11));

        positiveOrNegative(10);

        System.out.println(negativeNum(-10));

        printString("Hello!",2);

        System.out.println(leapYear(2000));

    }

    public static boolean leapYear(int year){

        if(year % 4 != 0){
            return false;
        }
        else if(year % 100 != 0){
            return true;
        }
        else if (year % 400 != 0){
            return false;
        }
        else {
            return  true;
        }

    }

    public static void printString(String str, int num){

        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }

    }

    public static boolean negativeNum(int num){

        return num < 0;

    }

    public static void positiveOrNegative(int num){

        if(num >= 0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean sumWithin(int a, int b){
        int min = 10;
        int max = 20;

        int sum = (a + b);

        return sum >= min && sum <= max;
    }

    public static void compareNumbers(int a, int b){

        if(a >= b){
            System.out.println("a >= b");
        }
        else{
            System.out.println("a < b");
        }

    }

    public static void printColor(int value){

        if(value <= 0){
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }

    }

    public static void checkSumSign(int a, int b){

        if( (a + b) >= 0 ){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printThreeWords(){

        System.out.println("Orange\nBanana\nApple");

    }
}

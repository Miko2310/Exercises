public class FirstExercise {

    public static void greeting (String name) {

        System.out.println("გამარჯობა " + name + "!");

    }

    public static int sum(int a, int b) {

        return a + b;

    }

    public static boolean isEven(int number) {

        return number % 2 == 0;

    }

    public static int convertDoubleToInteger(double number) {

        return (int) number;
    }

    public static int findMaxNumber (int a, int b) {

        if (a > b) {
            return a;
        }
        else {
            return b;
        }

    }

    public static int getStringTextLenght(String text) {

        return text.length();
    }

    public static int multiply (int a, int b) {

        return a * b;
    }

    public static int multiply (int a, int b, int c) {

        return a * b * c;
    }

    public static void main(String[] args) {


        greeting("გიორგი");


        int total = sum(15, 25);
        System.out.println(total);


        System.out.println(isEven(256));


        int intValue = convertDoubleToInteger(94.80);
        System.out.println(intValue);


        System.out.println(findMaxNumber(153, 156));


        System.out.println(getStringTextLenght("გამარჯობა, მე ვარ გიორგი"));


        System.out.println(multiply(7, 18));
        System.out.println(multiply(8, 25, 10));

    }


}
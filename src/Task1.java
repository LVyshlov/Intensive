public class Task1 {
    public static void main(String[] args) {
        int a = 42;

        howOld(a);
    }

    public static int howOld(int num1) {
        int num2 = num1 % 10;

        if (num2 >= 2 && num2 <= 4) {
            System.out.printf("Вам %d года", num1);
        } else if (num2 == 1) {
            System.out.printf("Вам %d год", num1);

        } else {
            System.out.printf("Вам %d лет", num1);
        }
        return num1;
    }
}

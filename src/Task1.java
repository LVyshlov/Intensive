public class Task1 {
    public static void main(String[] args) {
        int a = 55;

        howOld(a);
    }

    public static int howOld(int num1) {

        if (num1 <= 4) {
            System.out.printf("Вам %d года", num1);
        }
        else {
            System.out.printf("Вам %d лет", num1);
        }
        return num1;
    }
}

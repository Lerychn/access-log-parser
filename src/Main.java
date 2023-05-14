import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();
        int result =number1+number2;
        System.out.println("Сумма чисел= " + result);
        result = number1 - number2;
        System.out.println("Разность чисел= " + result);
        result = number1*number2;
        System.out.println("Произведение чисел= " + result);
        double result1 = (double)number1/number2;
        System.out.println("Частное от чисел= " + result1);
    }
}

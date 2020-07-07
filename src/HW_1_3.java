import java.util.Scanner;

public class HW_1_3 {

    public static void main (String [] args) {

        System.out.println("Введите значение от 1 до 10");
        Scanner in = new Scanner (System.in);
        double j = in.nextDouble();

    for (int i = 1; i<=10; i++){
        System.out.println(i*j + " ");
        }
    }
}

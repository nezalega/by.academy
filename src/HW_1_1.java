import java.util.Scanner;

public class HW_1_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите возраст покупателя");
        double A = in.nextDouble();

        System.out.println("Введите сумму покупки");
        double B = in.nextDouble();

        if (B<100){
            System.out.println("Конечная сумма с учетом 5%-ой скидки: " + (B-B*0.05));
        }
        if (B>=100 & B<200){
            System.out.println("Конечная сумма с учетом 7%-ой скидки: " + (B-B*0.07));
        }
        if (B>=200 & B<300 & A<18){
            System.out.println("Конечная сумма с учетом 9%-ой скидки: " + (B-B*0.09));
        }
        if (B>=200 & B<300 & A>18) {
            System.out.println("Конечная сумма с учетом 16%-ой скидки: " + (B - B*0.16));
        }
        if (B>=300 & B<400){
            System.out.println("Конечная сумма с учетом 15%-ой скидки: " + (B-B*0.15));
        }
        if (B>=400){
            System.out.println("Конечная сумма с учетом 20%-ой скидки: " + (B-B*0.2));
        }
        }}

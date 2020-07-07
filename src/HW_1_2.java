import java.io.IOException;
import java.util.Scanner;

public class HW_1_2 {

    public static void main (String [] args) throws IOException {
        System.out.println ("Выберете тип данных: Int, Double, Float, Char или String");

        Scanner in = new Scanner (System.in);
        String Value = in.next();

        switch (Value){
            case "Int": {
                System.out.println("Введите число: ");
                int ValueInt = in.nextInt();
                System.out.println ("Остаток от деления на 2: " + ValueInt%2);
                break;
            }
            case "Double": {
                System.out.println("Введите число: ");
                double ValueDouble = in.nextDouble();
                System.out.printf ("70 процентов от " + ValueDouble +  " равно" + ", %.2f: " , ValueDouble * 0.7);
                break;
            }
            case "Float": {
                System.out.println("Введите число: ");
                float ValueFloat = in.nextFloat();
                System.out.printf("Квадрат " + ValueFloat + " равен" + ", %.2f: ", ValueFloat * ValueFloat);
                break;
            }
            case "Char": {
                System.out.println("Введите значение: ");
                int x = System.in.read();
                char c = (char) x;
                System.out.println("Код значения " + c + " равен " + x);
                break;
            }
                case "String": {
                    System.out.println("Введите число: ");
                    int ValueString = in.nextInt();
                    System.out.println("Hello " + ValueString);
                    break;
                }
            default: {
                System.out.println ("Unsupported type");
                break;
            }
        }
    }
}


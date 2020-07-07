public class HW_1_4 {


        public static void main(String[] args) {

            int a = 2;
            int b = 1;
            int c = 0;

            do {
                c++;
                b = b * a;
                System.out.println(c);
            } while (b <= 1000000);
        }}
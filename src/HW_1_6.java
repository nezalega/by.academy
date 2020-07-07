import java.util.Scanner;

public class HW_1_6 {

    public static void main(String[] args)
    {
        System.out.println("Введите первое слово:");
        Scanner in = new Scanner (System.in);
        String s1 = in.next();
        System.out.println("Введите второе слово:");
        String s2 = in.next();
        System.out.println(perm(s1,s2));
    }

    public static boolean perm(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] let = new int[256];
        char[] s_array = s1.toCharArray();
        for (char c : s_array) {
            let[c]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            int c = (int) s2.charAt(i);
            if (--let[c] < 0) {
                return false;
            }
        }
        return true;
    }
    }


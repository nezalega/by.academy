package Strings_Tasks;

public class Task_4_1 {

       public static void main(String... args) {
           String[] arr = { "Ввести", "слов", "консоли", "Найти", "слово", "котором", "aabb", "a", "aa", "aaa", "aabb",
                    "aaabbbccc", "число", "различных", "qw", "er", "ty" };
            int indexMinUnique = -1;
            int minUniqueChars = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {

                int currentUniqueCounter = 0;
                char[] cArr = new char[65538];
                for (char c : arr[i].toCharArray()) {
                    cArr[c]++;
                }
                for (char c : cArr) {
                    if (c > 0) {
                        currentUniqueCounter++;
                    }
                }
                if (currentUniqueCounter < minUniqueChars) {
                    minUniqueChars = currentUniqueCounter;
                    indexMinUnique = i;
                }

            }

            System.out.println(arr[indexMinUnique]);

        }
    }



package Strings_Tasks;


import static Strings_Tasks.All_Tasks_Strings.AllTasksStringsStarter.*;

public class All_Tasks_Strings_Main {

    static class AllTasksStringsStarter {
        public static void main(String[] args) {
            String[] sourceStrings = readInput();
            if (sourceStrings.length == 0) {
                System.out.println("Нет строк. Программа завершена.");
                System.exit(0);
            }

            Task_1 (sourceStrings);

            Task_2 (sourceStrings);

            Task_3(sourceStrings);

            String[] sourceWords = toStringArray(findWords(sourceStrings));
            Task_4(sourceWords);

            Task_5(sourceWords);

            Task_6(sourceWords);

            Task_7(sourceWords);

            Task_8(sourceStrings);

            int[] kSourceValues = toIntArray(sourceStrings);
            Task_10_11(kSourceValues, "(-10000, 0]", "(0, 5]", "(5, 10]",
                    "(10, 10000]");

            Task_10_11(kSourceValues, "(-10000, 5]", "[0, 10]", "[5, 15]",
                    "[10, 10000]");

            Task_12('→', '↓');

            Task_13(args);

            Task_14(sourceStrings);
        }
    }}
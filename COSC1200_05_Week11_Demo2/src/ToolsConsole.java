import java.util.Scanner;

public class ToolsConsole {
    static Scanner sc = new Scanner (System.in);

    public static String getString(String prompt) {
        outputMessage(prompt);
        String input  = sc.nextLine();
        return input;
    }

    public static int getInt(String prompt) {
        int inputNumber = -1;

        do {
            outputMessage(prompt);
            while (!sc.hasNextInt()) {
                outputMessage("That was not a number!");
                sc.next();
            }
            inputNumber = sc.nextInt();

        } while (inputNumber <= 0);

        return inputNumber;
    }

    public static int getInt(String prompt, int minValue, int maxValue) {
        int inputNumber;

        do {
            outputMessage(prompt);
            while (!sc.hasNextInt()) {
                outputMessage("That was not a number!");
                sc.next();
            }
            inputNumber = sc.nextInt();

        } while (inputNumber < minValue || inputNumber > maxValue);

        return inputNumber;
    }

    public static void outputMessage(String message) {
        System.out.println(message);
        // MessageBox.Show(message); // in C#
    }

}

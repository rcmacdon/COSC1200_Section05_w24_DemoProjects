import java.util.Scanner;

public class Tools {

    static Scanner sc = new Scanner(System.in);

    public static int getInt(String prompt, int minValue, int maxValue) {
        int inputNumber;

        do {
            ToolsConsole.outputMessage(prompt);
            while (!sc.hasNextInt()) {
                ToolsConsole.outputMessage("That was not a number!");
                sc.next();
            }
            inputNumber = sc.nextInt();

        } while (inputNumber < minValue || inputNumber > maxValue);

        return inputNumber;
    }


}

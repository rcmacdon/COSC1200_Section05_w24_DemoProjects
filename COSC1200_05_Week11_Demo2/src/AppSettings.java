import java.io.*;

public class AppSettings {

    private static final String filename = "D:/AppSettings.txt";

    public static class Values {

        public static int MIN_VALUE = 0;
        public static int MAX_VALUE = 100;

    }

    public static void loadSettings() {
        try {
            readFromFile(filename);
        } catch (IOException ioe) {
            ToolsConsole.outputMessage(ioe.getMessage());
        }
    }

    public static void saveSettings() {
        try {
            writeToFile(filename);
        } catch (IOException ioe) {
            ToolsConsole.outputMessage(ioe.getMessage());
        }
    }

    private static void readFromFile(String filename) throws IOException {
        // open stream/buffer
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        // read each line from memory and set setting
        String line = br.readLine();
        while (line != null) {
            String[] items = line.split(":");

            switch (items[0].toUpperCase()) {
                case "MIN_VALUE":
                    Values.MIN_VALUE = Integer.parseInt(items[1]);
                    break;
                case "MAX_VALUE":
                    Values.MAX_VALUE = Integer.parseInt(items[1]);
                    break;
            }
//                for (SETTINGS setting: SETTINGS.values()) {
//                    if (items[0].equalsIgnoreCase(setting.toString())) {
//                        ObjectByName().value =
//                    }
//                }
            line = br.readLine();
        }
    }

    private static void writeToFile(String filename) throws IOException {
        // open stream/buffer/print writer
        FileWriter fw = new FileWriter(filename);
        BufferedWriter bf = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bf);

        // write the settings to the memory
        out.println("MIN_VALUE:" + Values.MIN_VALUE);
        out.println("MAX_VALUE:" + Values.MAX_VALUE);

        // save and close the file buffer
        out.close();

    }

}

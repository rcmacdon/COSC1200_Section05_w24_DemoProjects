/* **********************************
File:       COSC1200 - 05 Week 11 Demo 2
Author:     Clint MacDonald
Date:       March 2024
Purpose:    More FileIO/AppSettings/Class Wrappers
************************************* */

public class Main {


    public static void main(String[] args) {

        AppSettings.loadSettings();

        ToolsConsole.outputMessage("min = " + AppSettings.Values.MIN_VALUE);
        ToolsConsole.outputMessage("max = " + AppSettings.Values.MAX_VALUE);

        AppSettings.Values.MIN_VALUE = ToolsConsole.getInt("Enter min value:", 0, 1000);
        AppSettings.Values.MAX_VALUE = ToolsConsole.getInt("Enter max value:", 0, 1000);

        AppSettings.saveSettings();

    }


}
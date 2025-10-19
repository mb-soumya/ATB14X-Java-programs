package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_automation
{
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        switch (browser)
        {
            case "chrome":
                System.out.println("starting the chrome");
                System.out.println(".....");
                System.out.println("tc1");
                System.out.println("tc2");
                break;
            case "firefox":
                System.out.println("starting firefox browser");
                //further code to start the browser
                //Webdriver driver= new firefoxbroswer(); selenium code
                break;
            case "edge":
                System.out.println("starting edge");
                break;
            default:
                System.out.println("no browsser");

        }
    }
}

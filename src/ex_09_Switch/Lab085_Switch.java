package ex_09_Switch;

import java.util.Scanner;

public class Lab085_Switch
{
        public static void main(String[] args) {
            {
                // And if user enters 1 to 7,
                // you will tell which day it is.

                // Logic Building Formula
                // Step 1 – Number one is using the Scanner class.
                // Step 2 – number two will be basically figuring out the expression and the day.
                // Step 3 – We will basically add step 3 as a rough logic.
                // Step 4 – is you will write the fix, the logic and optimize.
                // Step 5 – figure out the edge cases.

                // Step1
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the day to 1 to 7");

                if (scanner.hasNextInt()) {
                    int day = scanner.nextInt();
                    switch (day) {
                        case 1:
                            System.out.println("Mon");
                            break;
                        case 2:
                            System.out.println("tue");
                            break;
                        case 3:
                            System.out.println("wed");
                            break;
                        case 4:
                            System.out.println("thur");
                            break;
                        case 5:
                            System.out.println("fri");
                            break;
                        case 6:
                            System.out.println("sat");
                            break;
                        case 7:
                            System.out.println("sun");
                            break;
                        default:
                            System.out.println("please enter only 1 to 7 you fool");
                    }
                } else {
                    System.out.println("Enter int you FOOL!");
                }
            }
        }
    }





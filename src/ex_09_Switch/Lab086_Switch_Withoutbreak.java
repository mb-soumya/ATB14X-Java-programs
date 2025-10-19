package ex_09_Switch;

import java.util.Scanner;

public class Lab086_Switch_Withoutbreak
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Mon");

                case 2:
                    System.out.println("tue");

                case 3:
                    System.out.println("wed");

                case 4:
                    System.out.println("thur");

                case 5:
                    System.out.println("fri");

                case 6:
                    System.out.println("sat");

                case 7:
                    System.out.println("sun");

                default:
                    System.out.println("please enter only 1 to 7 you fool");
            }
        } else {
            System.out.println("Enter int you FOOL!");
        }
    }
    }


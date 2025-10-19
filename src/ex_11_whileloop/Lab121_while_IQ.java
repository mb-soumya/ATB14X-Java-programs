package ex_11_whileloop;

import java.util.Scanner;

public class Lab121_while_IQ
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter number");
        if(!scanner.hasNextInt())
        {
            System.out.println("you fool eneter interger");
        }
        else {
           int n= scanner.nextInt();
            int fact=1;
            if(n==0)
            {
                fact=1;
                System.out.println("fact=1");
            }


if (n <0 || n >Integer.MAX_VALUE)
{
    System.out.println("cant get factorial as out of bond!(int)");
}
 int i=1;
while(i<=n)
{
    fact=fact*i;
    i++;
}
            System.out.println(fact);
    }
}}

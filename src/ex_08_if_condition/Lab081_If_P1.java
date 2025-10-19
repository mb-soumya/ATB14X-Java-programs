package ex_08_if_condition;

public class Lab081_If_P1
{
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);
        if(age>25)
        {
            System.out.println("yes you can go to goa");
        }
        else {
            System.out.println("you cant go to goa");
        }
    }
}

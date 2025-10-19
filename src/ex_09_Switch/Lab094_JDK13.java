package ex_09_Switch;

public class Lab094_JDK13
{
    public static void main(String[] args) {
        //jdk>13
        int itemcode=005;
        switch(itemcode)
        {
            case 001 ,002,005:
                System.out.println("electronic gadget");
                break;
            case 004,006,007:
                System.out.println("this is mech");
                break;
            default:
                System.out.println("none");
        }
    }
}

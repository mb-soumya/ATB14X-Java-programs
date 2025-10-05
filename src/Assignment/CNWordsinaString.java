package Assignment;

public class CNWordsinaString
{
    public static void main(String[] args) {
        String s="count number of words in string";
        String [] s1=s.split(" ");
        int l =s1.length;

        for(int i=0; i<=l-1; i++)
        {
            System.out.println("the number of counts are :"+l);
            System.out.println("first letter of every word:"+ s1[i].charAt(0));
        }
    }
}

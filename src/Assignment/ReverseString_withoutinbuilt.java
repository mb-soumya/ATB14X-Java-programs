package Assignment;

public class ReverseString_withoutinbuilt
{
    public static void main(String[] args) {
       String s="soumya";
       int l=s.length();
       String rev="";
       for(int i=l-1; i>=0; i--)
       {
           rev= rev+s.charAt(i);
       }

        System.out.println(rev);


    }
}

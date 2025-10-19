package ex_10_Forloop;

public class Lab113_forloop_continue_evennumber
{
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {

           // if(i%2==0) for odd num
            if(i%2 !=0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}

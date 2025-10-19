package ex_10_Forloop;

public class Lab112_forloop_continue
{
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            //System.out.println(i);
            if(i==5)  // 5 will be skipped
            {
               continue;
            }
            System.out.println(i);
        }
    }
}

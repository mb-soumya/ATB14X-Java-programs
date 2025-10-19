package ex_10_Forloop;

public class Lab109_forloop_break
{
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {
            //System.out.println(i);// 0 to 5
            if(i==5)
            {
                break;
            }
            System.out.println(i);// 0 t0 4
        }
    }
}

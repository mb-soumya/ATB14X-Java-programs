package ex_10_Forloop;

public class Lab108_forloop_greaterthan_vs_equal {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) // 0 to 10 , 11 times run
        {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) // 1  to 10 , 10 times run
        {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) // 0 to 10 , 10 times run
        {
            System.out.println(i);
        }
    }
}

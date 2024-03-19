import java.util.Scanner;

public class factorial {
    public static void fact(int i, int factorial){
        if(i==2){
            System.out.println(factorial*i);
            return;
        }
        factorial *=i;
        fact(i-1, factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
        fact(i, 1);
    }
}

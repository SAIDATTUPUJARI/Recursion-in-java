public class fibonacci {
    public static void feb(int a, int b, int n){       
        if(n==0){
            return;
        }
        int c =a+b;
        System.out.println(c);
        feb(a+1, b+2, n-1);
    }
    public static void main(String[] args) {
        int a=0; int b=1;
        System.out.println(a);
        System.out.println(b);
        int n =7;
        feb(a, b, n-2);
    }
}

public class febbb {
    public static void printfeb(int a, int b, int n){
        for(int i=0; i<n-2; ++i){
            int c =a+b;
            a=b;
            b=c;
            System.out.print(c);
    }
    }
    public static void main(String[] args) {
        System.out.println(0);
        printfeb(0, 1, 7);
    }
}

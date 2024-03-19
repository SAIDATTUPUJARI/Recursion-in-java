public class sumofnnumbers {
    public static void sum(int n, int i, int sum){
        if(i==n){
            System.out.println(sum);
            return;
        }
        sum +=i;
        
        sum(n,i+1,sum);
    }
    public static void main(String[] args){
        sum(7,0, 0);
    }
}
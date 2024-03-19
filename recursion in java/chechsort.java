public class chechsort {
    public static boolean  check(int a[], int i){
        if(i==a.length-1){
            return true;
        }
        if(a[i]<a[i+1]){
            return check(a, i+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int a[]= {1,2,4,5,6,9,9};
        System.out.println(check(a, 0));
    }
}

public class reversenum {
    public static void printrev(String a, int i){
        if(i==0){
            System.out.print(a.charAt(i));
            return;
        }
        System.out.print(a.charAt(i));
        printrev(a, i-1);
    }
    public static void main(String[] args) {
        String a="sai";
        printrev(a, a.length()-1);
    }
}

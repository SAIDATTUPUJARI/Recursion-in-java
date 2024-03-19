public class findingindex {
    public static int first=-1;
    public static int last =-1;
    public static void printoccu(String a, int i, char element ){
        if(i==a.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current=a.charAt(i);
        if(current==element){
        if(first==-1){
            first=i;
        }
        else{
            last=i;
        }
    } 
      
        printoccu(a, i+1, element);
    }
    public static void main(String[] args) {
        String a="nahdfdaandjam";
        printoccu(a,0,'a');
    }
}

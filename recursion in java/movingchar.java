public class movingchar {
    public static void move(String a, int count,char ele, String b, int i){
        if(i==a.length()){
            for(int z=0;z<count;z++){
                b+=ele;
            }
            System.out.println(b);
            return;
        }
        if(a.charAt(i)==ele){
            count++;
            move(a, count, ele, b, i+1);
        }
        else{
            b+=a.charAt(i);
            move(a, count, ele, b, i+1);
        }
    }
   public static void main(String[] args) {
    String a="xabcxxd";
    String b="";
    char ele='x';
    move(a, 0, ele, b, 0);
}
}
public class towerofhanoi {
    public static void tower(int n, String sou, String help, String des){
        if(n==1){
            System.out.println("move "+sou+" from "+help+" to "+des);
            return;
        }
        tower(n-1, sou, des, help);
        System.out.println("move "+sou+" from "+des+" to "+help);
        tower(n-1, help, sou, des);
    }
    public static void main(String[] args) {
        tower(3, "S", "H", "D");
    }
}

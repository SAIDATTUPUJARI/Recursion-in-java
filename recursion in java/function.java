import java.util.*;

public class function {
public static void num(int n){
    if(n==10){
        return;
    }
    System.out.println(n);
    num(n+1);
}

public static void main(String[] args) {
    int n=5;
    num(n);
}
}
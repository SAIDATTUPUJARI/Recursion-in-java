import java.util.* ;
import java.io.*; 
public class duplicate {

    static int largestElement(int[] arr, int n) {
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n; j++){
                if(arr[i]>arr[j]){
                    int temp=0;
                    arr[i]=temp;
                    arr[j]=arr[i];
                    temp = arr[j];
                }
            }
        }
        return arr[n];
    }
}
    public static void main(String[] args) {
        largestElement([8,7,5,4,2], 5);f
    }

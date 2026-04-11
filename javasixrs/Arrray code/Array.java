import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];

        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // for (int i=0;i<n; i++){
        //     System.out.println(arr[i]);
        // }

        // sum of the element of the array 
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum=sum +arr[i];
            System.out.println(sum);
        }
    }
}

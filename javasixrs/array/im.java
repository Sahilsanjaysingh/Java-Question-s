
import java.util.*;

public class im {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int [n];
        // input array
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        // print reverse array 
        for (int i=n-1; i>=0; i--){
            System.out.print(arr[i]);
        }
         System.out.println();
        
         //sum or the element 
         int sum =0;
         for (int i=0; i<arr.length; i++){
            sum+=arr[i];
         }
         System.out.println(sum);

            //average of the element
            float avg = sum/n;
            System.out.println(avg);

            //maximun of Element 
            int max= arr[0];
            for (int i=1; i<n; i++){
                if (arr[i]>max)
                    max=arr[i];
            }
            System.out.println(max);
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
    }
}

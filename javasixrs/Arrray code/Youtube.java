
import java.util.*;

public class Youtube {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int [n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        //print the negative element of the array
        for (int i=0; i<n; i++){
            if (arr[i]<0)System.out.println(arr[i]+" ");
        }
        //print the sum of the elemtent of the array
        int sum =0; 
        for (int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);

        //print the product of the element of the array
        int product =1;
        for (int i=0; i<arr.length; i++){
            product=product*arr[i];
        }
        System.out.println(product);
        

        //print the max element of the array
       // int max = arr[0];// arry ka hi number ho
        int max=Integer.MIN_VALUE;// THIS WILL TEL YOU TEH MAX YALUE OF THE INTEGER ARRAY 
        for (int i=0; i<arr.length; i++){
            if (max<arr[i])
                max =arr[i];
        }
        System.out.println(max);


        String name[]= {"Sahil","Rahul","Priya"};
        for (int i=0;i<name.length; i++){
            System.out.println(name[i]);
        }
        int deep[] = Arrays.copyOf(arr, arr.length);
        deep[0]=100;
        System.out.println(deep[0]);

        //Search in Array
        int key=0;
        boolean flag= false;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==key ){
                System.out.println("Key found at index: " + i);
                // break;
                flag=true;
                break;
            
            }
        }
        if (flag){
            System.out.println("Key found in the array");
        }
        else{
            System.out.println("Key not found in the array");
        }

        // two sum
        int target=10;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i]+arr[j]==target){
                    System.out.println("Pair found at index: " + i + " and " + j);
                }
            }
        } 

        //Reverse an Array
         // for (int i=n-1; i>=0; i--){
         //     System.out.print(arr[i]+" ,");
         // }



        // reverse an array using two pointer
        // int left=0;
        // int right = n-1;
        // while (left<right){
        //     int temp= arr[left];
        //     arr[left]= arr[right];
        //     arr[right]=temp;
        //     left++;
        //     right--;
        // }
        // for (int i=0;i<n; i++){
        //     System.out.print(arr[i]+" ,");
        // }

        //Reverse anarray usning swap                                   

            for (int i=0; i<n/2; i++){
                int temp= arr[i];
                arr[i]= arr[n-1-i];
                arr[n-1-i]=temp;
            }
            for (int els : arr){
                System.out.print(els+" ,");
            }


    }
}

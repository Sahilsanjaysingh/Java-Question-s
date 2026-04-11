public class reverse {
    public static void main(String[] args) {
        int arr[] = {10, 20, 4, 45, 99};
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            temp[j]= arr[i];
            j++;            
        }
        for(int i=0; i<temp.length; i++){
System.out.print(temp [i ] +" ");
        }
    }
    
}


//the time Complexity of First loop O(n)
//the second loop Complexity loop O(n)
 //O(2n) 
 //Drop constants:  O(n)



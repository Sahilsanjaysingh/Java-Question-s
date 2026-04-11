public class secondLargest{
    static int largest = Integer.MIN_VALUE;
    static int secondLargest = Integer.MIN_VALUE;
    public static void findSecondLargest(int []arr, int index) {
        if(index==arr.length){
            return;
        }
         if (arr[index] > largest) {
            secondLargest = largest;
            largest = arr[index];
        } else if (arr[index] > secondLargest && arr[index] != largest) {
            secondLargest = arr[index];
        }

        // Recursive call
        findSecondLargest(arr, index + 1);
    }
    public static void main(String[] args){
        int arr[]={10,20,4,45,99};
        findSecondLargest(arr, 0);
        if(secondLargest== Integer.MIN_VALUE){
            System.out.println("No second largest element found.");
        }else{
            System.out.println("The second largest element is: " + secondLargest);
        }
    }

}
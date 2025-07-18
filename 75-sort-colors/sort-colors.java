class Solution {
    public static int partition(int arr[],int low,int high){
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;

    }
     public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }
    public void sortColors(int[] nums) {
        quicksort(nums,0,nums.length-1);

        
    }
}
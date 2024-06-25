public class jnu2_PeekLargerElement{
static int PeekLargestElement(int arr[])
{
    if(arr[0]>arr[1])
    {
        return 0;
    }
    if(arr[arr.length-1]>arr[arr.length-2])
    {
        return arr.length-1;
    }
    
    for(int i=1;i<arr.length-1;i++){
        if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
        {
            return i;
        }
    }
    return -1;
    
}
public static void main(String[] args) {
    // int arr[]={5,10,20,15};
    int arr[] = {10, 20, 15, 2, 23, 90, 67};
    System.out.println(arr[PeekLargestElement(arr)]);
}
}
//Time complexity : O(n)
//Space Complexity : O(1)
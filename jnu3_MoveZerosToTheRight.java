import java.util.ArrayList;
public class jnu3_MoveZerosToTheRight {
    // static int[] pushZerosToEnd(int arr[],int n)
    // {
       
        //     ArrayList<Integer> ls=new ArrayList<>();
            
        //     for(int i=0;i<n;i++)
        //     {
        //         if(arr[i]>0)
        //         {
        //             ls.add(arr[i]); 
        //         }
        //     }
        //     int j=0;
        //     while(j<ls.size())
        //     {
        //         arr[j]=ls.get(j);
        //         j++;
        //     }
        //     while(j<n)
        //     {
        //         arr[j]=0;
        //         j++;
        //     }
        //     return arr;
        static int[] pushZerosToEnd(int [] arr, int n) {
            ArrayList<Integer> ls=new ArrayList<>();
            
            for(int i=0;i<n;i++)
            {
                if(arr[i]>0)
                {
                    ls.add(arr[i]); 
                }
            }
            int j=0;
            while(j<ls.size())
            {
                arr[j]=ls.get(j);
                j++;
                
            }
            while(j<n)
            {
                arr[j]=0;
                j++;
            }
            return arr;
            
        }
        static void printArray(int arr[])
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+"|");
            }
        }
        public static void main(String[] args) {
            int arr[]={3, 5, 0, 0, 4};
            arr=pushZerosToEnd(arr, arr.length);
            printArray(arr);

        }
     }
       
    


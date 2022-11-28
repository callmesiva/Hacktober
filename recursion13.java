import java.lang.ref.Cleaner;

/**
 * recursion13
 */
public class recursion13 {
    public static void main(String[] args) {
       
      int arr[]  = {2,6,3,8};
      int index =0;

      int res[] = addOneToEverything(arr,index);

      for (int i : res) {
        System.out.println(i);
      }
    }

    private static int[] addOneToEverything(int[] arr, int index) {
         if(index!=arr.length){
            arr[index] +=1;
            addOneToEverything(arr, index+1);
         }
         return arr;
    }
}
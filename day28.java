import java.util.*;
public class Main {
    public static void main(String[] args) {
     
     int index =0;
     ArrayList<Integer> arr = new ArrayList<Integer>();
     Scanner sc = new Scanner(System.in);
     System.out.println("ArrayList Size : ");
     int n = sc.nextInt();
     System.out.println("Enter values : ");
     
     for(int i=0; i<n; i++)
     {
       int temp = sc.nextInt();
       arr.add(temp);
     }
    
     System.out.println(NegativePair(arr,index));
    }
    
    static boolean NegativePair(ArrayList<Integer> arr, int index)
    {
      
     if(arr.size()-1 == index)  return false;
     
     if(arr.get(index) == arr.get(index+1)*-1) return true;

     return NegativePair(arr,index+1);
    }
}
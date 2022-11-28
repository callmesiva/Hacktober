import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an Integer :");
      int n = sc.nextInt();
      Random num = new Random();

      int arr[][] = new int[n][n];
      int count =0;
      
      
      for(int i=0; i<arr.length; i++)
      {
        for(int j=0; j<arr.length; j++)
        {
          arr[i][j] = num.nextInt(5)+1;
          if(arr[i][j] == 5) count++;
          
          System.out.print(arr[i][j]+" ");
        }
        System.out.println("");
      }
      
      System.out.println("There are "+count+" five's in this array");
      
  
  
  }
}
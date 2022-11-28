import java.util.*;

public class Main {
    public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an Integer :");
      int n = sc.nextInt();
      char arr[][] = new char[n][n];
      
      // Creating a pattern & store into array
      for(int i=0; i<n; i++)
      {
      
       for(int j=0; j<n; j++)
        {
          if(i==0 || i==n-1 || j==0 || j==n-1 || j==i || j==(n-1)-i){
            arr[i][j]='#';
          }
          else{
            arr[i][j]=' ';
          }
        }
        
      }
     
     // Print an array
      for(int i=0; i<n; i++)
      {
       for(int j=0; j<n; j++)
        {
         System.out.print(arr[i][j]+" ");
        }
        System.out.println("");
      }
     
     
     
     
     
     
     
     
     
     
     
  }
}
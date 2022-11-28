
import java.util.*;
public class Main {
    public static void main(String[] args) {
      
      int n =6;
      int m =8;
      
      char arr[][] = new char[n][m];
      String str = "0M";
      Random r = new Random();
     
     //Creating a  2D array with 0's and M's and print that array 
      for(int i=0; i<arr.length; i++)
      {
        for(int j=0; j<arr[0].length; j++)
        {
          arr[i][j]= str.charAt(r.nextInt(str.length()));
          System.out.print(arr[i][j]+" ");
        }
        System.out.println("");
      }
  
      //Creating one newline 
      System.out.println("\n");
      
     // Count Adjacent M's and replace 0's with counted values and print that array     
      for(int i=0; i<arr.length; i++)
      {
       for(int j=0; j<arr[0].length; j++)
        {
          if(arr[i][j]=='0'){
          int count =0;
           for(int row = -1; row<=1; row++)
           {
             for(int col=-1; col<=1; col++)
             {
               int nrow = i+row;
               int ncol = j+col;
               if(nrow>=0 && ncol>=0 && nrow<n&& ncol<m){
                 if(arr[nrow][ncol] =='M') count++;
                }
              }
            }
            arr[i][j] =(char)(count+'0');
          }
          System.out.print(arr[i][j]+" ");
        }
       System.out.println("");
      }
  
   }
}
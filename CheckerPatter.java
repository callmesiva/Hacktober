import java.util.*;

public class Main {
    public static void main(String[] args) {
  
    
Scanner sc = new Scanner(System.in);
System.out.println("Enter an Integer :");
int n = sc.nextInt();
int arr[][] = new int[n][n];
boolean flag = true;
   
    // Creating a checkerPattern array
    for(int i=0; i<n; i++)
    {
      for(int j=0; j<n; j++)
      {
        if(flag==true)
        {
          arr[i][j] = 1;
          flag = false;
        }
        else if(flag == false)
        {
          arr[i][j] = 2;
          flag = true;
        }
      }
     if (n%2==0 && flag==true)  flag = false;
     else if (n%2==0 && flag==false) flag = true;
   }
  
   // Print the result array
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
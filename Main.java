import java.util.*;

public class Main {
    public static void main(String[] args) {
      

// Java Solution 

  String str = "abcdefghijklmnopqrstuvwxyz";
  List<Character> list=new ArrayList<Character>(); 
      
      int n =10;
      int width = ((n+(n-1))*2)-1;

      
      // list of a to z
      for(int i=0 ; i<str.length(); i++)
      {
        list.add(str.charAt(i));
      }
      
      // upper triangle
      int x=0;
      for(int j=1; j<n; j++)
      {
        
        for(int i=1; i<(width/2)-(x*2)+1; i++)
        {
          System.out.print("-");
        }
        
        for(int k= n-1; k>n-j; k--)
        {
          System.out.print(list.get(k)+"-");
        }
        
        for(int k= n-j; k<n; k++)
        {
          System.out.print(list.get(k));
          if(k==n-1) break;
          System.out.print("-");
        }
         
        for(int i=1; i<(width/2)-(x*2)+1; i++)
        {
          System.out.print("-");
        }
         x++;
         System.out.println("");
      }
      
      
      // center part
      for(int i=n-1; i>0;i--)
      {
        System.out.print(list.get(i)+"-");
      }
      
      for(int i=0; i<n; i++)
      {
        System.out.print(list.get(i));
        if(i==n-1) break;
        System.out.print("-");
      }
      
      System.out.println("");
   
      // lower triangle
      for(int j=n-1; j>0; j--)
      {
       
         for(int i=0; i<=(width/2)-(j*2)+1; i++)
         {
           System.out.print("-");
         }
       
         for(int k= n-1; k>n-j; k--)
         {
           System.out.print(list.get(k)+"-");
         }
      
         for(int k= n-j; k<n; k++)
         {
           System.out.print(list.get(k));
           if(k==n-1) break;
           System.out.print("-");
         }
    
         for(int i=0; i<=(width/2)-(j*2)+1; i++)
         {
          System.out.print("-");
         }
          System.out.println("");
       }




      
    }
}
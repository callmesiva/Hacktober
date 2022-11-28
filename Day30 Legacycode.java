import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      String str ="?ABCDEFGlqnhty~@#$%&*x/+=1234567890";
      Random r = new Random();
      Set<Integer> set1 = new HashSet<>();
      ArrayList<Integer> set2 = new ArrayList<>();
      
      int n =5;
      int count =0;
      char arr[][] = new char[n][n];
      
      while(set1.size()<(n*n)/2)
      { 
       if(n%2!=0)
       {
       int temp = r.nextInt(str.length());
       if(temp!=0)  set1.add(temp);
       }
       else{
         set1.add(r.nextInt(str.length()));
       }
      }
  
 
      set2.addAll(set1);
      Collections.shuffle(set2);
      if(n%2!=0)  set2.add(r.nextInt((n*n)/2),0);
     
      Iterator<Integer> temp1 = set1.iterator();
      Iterator<Integer> temp2 = set2.iterator();
      
      for(int i=0; i<n; i++)
      {
        for(int j=0; j<n; j++)
        { 
           count++;
           if(count>(n*n)/2){
             arr[i][j]=str.charAt(temp2.next());
             System.out.print(arr[i][j]+" ");
           }
           
           else{
             arr[i][j]= str.charAt(temp1.next());
             System.out.print(arr[i][j]+" ");
           }
        }
        System.out.println("");
      }

   }
}
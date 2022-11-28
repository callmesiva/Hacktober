import java.util.*;
public class day{
    public static void main(String[] args) {
        
      int index =0;
      ArrayList<Integer> l1 = new ArrayList<Integer>();
      l1.add(1);
      l1.add(1);
      l1.add(2);
      l1.add(3);
      l1.add(1);
     
      
      ArrayList<Integer> l2 = new ArrayList<Integer>();
      l2.add(1);
      l2.add(2);
      l2.add(3);
      l2.add(1);
      l2.add(1);
     
    
    
    
    for(int i=0; i<5; i++)
    {
      if(l2.contains(l1.get(i)))
      {
        int temp = (Integer) l1.get(i);
        l2.remove(Integer.valueOf(temp));
      }
      else{
        System.out.println(false);
      }
      
      System.out.println(l2);
    }
  
         
      }
  } 
  
  
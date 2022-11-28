import java.util.*;

public class day24 {

    public static void main(String[] args) {
      
      String str = "11001";
      String res = "";
      int index =0; 
      
      System.out.println(bitFlip(str,res,index));
    }
    
    static String bitFlip(String str, String res, int index )
    {
     
      if(str.length() == index)
      {
        
        return str;
      }
      
      char temp = (str.charAt(index) =='1')?'0':'1';
      
      str = String.valueOf(temp);
    
      return bitFlip(str,res,index+1);
      
    }
  }
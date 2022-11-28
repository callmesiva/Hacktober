
public class day22 {
    
  public static void main(String[] args) {
   
   String s = "111u";
   int index = 0;
   
   System.out.println(isBinary(s,index));


     
   }   
   
   static boolean isBinary(String s, int index)
   {
     
     if(s.length() == index )  return false;
     
     else if (s.charAt(index) == '0' ||  s.charAt(index) == '1')   return true;
     
     return isBinary(s,index+1);
   }
   
}
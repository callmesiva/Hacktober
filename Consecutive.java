


public class Main {
    public static void main(String[] args) {
    
    String str = "BOOK";
    int index = 0;
    
    System.out.print(hasConsecutiveRepeat(str,index));
      
    }   
    
    static boolean hasConsecutiveRepeat(String str, int index)
    {
      
      if(str.length()-1 == index)  return false;
      
      else if (str.charAt(index) == str.charAt(index+1))   return true;
      
      return hasConsecutiveRepeat(str,index+1);
    }
    
}
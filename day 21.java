
public class Main {
    public static void main(String[] args) {
    
    String s = "Hello";
    char ch = 'o';
    int index = 0;
    
    System.out.print(Contains(s,ch,index));
      
    }   
    
    static boolean Contains(String s, char ch, int index)
    {
      
      if(s.length() == index)  return false;
      
      else if (s.charAt(index) == ch)   return true;
      
      return Contains(s,ch,index+1);
    }
    
}
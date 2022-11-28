public class Main {
    public static void main(String[] args) {
     
     String s = "wafer";
     String t = "water";
     int index =0;
     int count =0;
     
     System.out.println(oneAway(s,t,index,count));
  }
  
  static boolean oneAway(String s, String t, int index,int count)
  {
         boolean flag = false;
         
         if(count ==1) flag = true;
         
         if(s.length() == t.length() && s.length() == index) return true;
         
         else if (s.length() != t.length()) return false;
        
         else if(s.charAt(index)!= t.charAt(index))
         {
            count++;
            if(flag) return false;
         }
        
        return oneAway(s,t,index+1,count);
  }
}
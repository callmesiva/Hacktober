import java.util.Scanner;

public class palindrome_12 {

    public static void main(String[] args) {
// O(log n) Solution

Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int i=0;
int j = str.length()-1;
Boolean flag = true;
         
while(i<=j)
 {
   if(str.charAt(i)==str.charAt(j)){
      flag = true;
     }
   else{
      flag = false;
      break;
     }
    i++;
    j--;
  }
System.out.println((flag)?true:false);
     
     


    
    }

}
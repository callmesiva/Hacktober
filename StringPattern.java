import java.util.Scanner;

public class StringPattern {

    public static void main(String[] args) {

        // int length = 5;
        // int i = 1;
        // int j = 0;
        // while (i <= length) {
        //     if (j < i) {
        //         System.out.print('*');
        //         j++;
        //     }
        //     else if (j == i) {
        //         System.out.println(" ");
        //         i++;
        //         j = 0;
        //     }
        // }

        Scanner a = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = a.nextLine();
        String res ="";
        int len = str.length();
              
        for(int i=0; i<len; i++){
          for(int j=0; j<=i; j++){
             res = res +str.charAt(j);
           }
           res = res +" ";
         }
        System.out.println(res);
      

    }
}
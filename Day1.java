public class Day1 {
    public static void main(String[] args) {

        int N = 447474;
        int count = 0;

        while (N > 0) {
            int LastDigit = N % 10;
            if (LastDigit == 4)
                count++;
            N = N / 10;
        }
        System.out.println(count);

    }
}
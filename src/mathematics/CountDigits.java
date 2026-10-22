package mathematics;

public class CountDigits {

    static void main() {
        IO.println(String.format("Hello and welcome!"));
        System.out.println(countDigits(9999));
    }

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}

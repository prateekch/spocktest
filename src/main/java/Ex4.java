import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String : ");
        String n = br.readLine();
        int lower = 0, upper = 0, digits = 0, special = 0;

        int[] x={0,0,0,0};
        x=count(n);
        System.out.println("Uppercase letters = " + x[2]);
        System.out.println("Lowercase letters = " + x[3]);
        System.out.println("Numerals = " + x[1]);
        System.out.println("Special Characters = " + x[0]);
    }

    static int[] count(String n) {
        char ch;
        int x[]={0,0,0,0};
        for (int i = 0; i < n.length(); i++) {
            ch = n.charAt(i);

            if ((ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64))
                x[0]++;

            if (ch >= 48 && ch <= 57)
                x[1]++;
            if (ch >= 65 && ch <= 90)
                x[2]++;
            if (ch >= 97 && ch <= 122)
                x[3]++;
        }
        return x;
    }
}

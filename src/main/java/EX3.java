import java.util.Scanner;

public class EX3{
    public static void main(String[] args) {
        System.out.println("ENTER THE STRING");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        int charCount = count(s);
        System.out.println("number of occurences of 'e' id ----"+charCount);
    }

    public static int count(String s){
        int x=s.length() - s.replaceAll("e","").length();
    return  x;
    }
}

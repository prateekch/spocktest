public class Ex2 {
    public static void main(String[] args) {
        String s = "HELLO";
        System.out.println("original String  \n" + s);
        String s1=replacestring(s);
        System.out.println("Replaced Strings \n" + s1);

    }
       public static String replacestring(String s){
        String s1 = s.replace("HEL", "ABC");
        return s1;
        }

}

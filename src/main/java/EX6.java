public class EX6 {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("ABCDEFGHIJKL");
        String str=s.toString();
        String s1=removestring(str);
        System.out.println("STRING REMOVED --" + s1);
    }
        static String removestring(String str){
        StringBuffer s=new StringBuffer(str);
        s.reverse();

  String str1=s.replace(4, 9, "").toString();
            return  str1;
    }
}

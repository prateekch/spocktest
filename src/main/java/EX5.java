public class EX5 {
    public static void main(String[] args) {
     int a= add(2, 5);
    double b=   add(2.335, 5.343);
    int c=     mult(2, 4);

    }

    public static int add(int a, int b) {
        int sum = a + b;

        return sum;
    }

    public static double add(double a, double b) {
        double sum= (a + b);
        return sum;
    }

    public static float mult(float d, float e) {
        float m= (d * e);
      return m;
    }

    public static int mult(int a, int b) {
      int m= (a * b);

        return m;
    }


}


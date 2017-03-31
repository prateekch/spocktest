import java.util.ArrayList;
import java.util.Iterator;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Float> arr = new ArrayList<>();
        arr.add(32.222f);
        arr.add(23.22f);
        arr.add(10.223f);
        arr.add(3.232f);
        arr.add(7.23f);
        float sum=calcsum(arr);
        System.out.println(sum);
    }

    public static float calcsum(ArrayList<Float> arr){
        float sum = 0.0f;

        Iterator itr = arr.iterator();
        while (itr.hasNext()) {
            sum = (float) itr.next() + sum;
        }
        return sum;
    }
}

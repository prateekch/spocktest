import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll

class Ex1Spec extends Specification {
    def demo

    void setup() {
        demo = new Ex1();
    }

    void calcsumtestpass() {
        given:
        ArrayList<Float> arr = new ArrayList<>();
        arr.add(1.0f);
        arr.add(2.0f);
        when:
        float result = demo.calcsum(arr);

        then:
        result == 3.0
    }

    @Ignore
    void calcsumtestfail() {
        given:
        ArrayList<Float> arr = new ArrayList<>();
        arr.add(1.0f);
        arr.add(2.0f);
        when:
        float result = demo.calcsum(arr);

        then:
        result == 4.0
    }

    @Unroll
    void calcsumtest() {
        expect:
        demo.calcsum(arr) == result;

        where:
        arr          | result
        [1.0f, 2.0f] | 3.0
        [2.0f, 2.0f] | 4.0
    }
}
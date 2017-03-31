import spock.lang.Specification
import spock.lang.Unroll


class Ex2Spec extends Specification {
    def ex2;

    void setup() {
        ex2 = new Ex2();
    }

    @Unroll
    void replaceStringtest() {
        expect:
        ex2.replacestring(str) == result;
        where:
        str     | result
        "HELLO" | "ABCLO"
        "HELLO" | "ABL"

    }

}

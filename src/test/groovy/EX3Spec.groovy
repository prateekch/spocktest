import spock.lang.Specification
import spock.lang.Unroll

class EX3Spec extends Specification{
    def ex3;
    void setup(){
        ex3=new EX3();
    }
    @Unroll
    void counttest(){
        expect:
          ex3.count(str) ==result;
        where:
        str | result
        "hello" | 1
        "example" |2

    }
}

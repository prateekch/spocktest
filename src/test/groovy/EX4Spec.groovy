import spock.lang.Specification
import spock.lang.Unroll

class EX4Spec extends Specification {
def ex4;
    void setup(){
      ex4=new Ex4();
}
    @Unroll
    void counttest(){
        expect:
        ex4.count(str)==result;

        where:
        str |result
      "Hello"|[0,0,1,4]
        "hello 123"|[1,3,0,5]
    }
}

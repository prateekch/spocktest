import spock.lang.Specification
import spock.lang.Unroll

class EX5Spec extends Specification{
    def ex6;
    void setup(){
        ex6=new EX5();

    }
    @Unroll
    void addtest(){
        expect:
        ex6.add(a,b)==result;
        where:
        a | b | result
        2 | 3 | 5   //pass
        3| 4 | 7    //pass
    }
    @Unroll
    void addtest2()
    {
        expect:
        ex6.add(c, d) == result;
        where:
        c   | d | result
        2.05d | 3.03d | 5.08   //pass
        3.03d | 4.03d | 7.06  //fail
    }
    @Unroll
    void multtest(){

        expect:
        ex6.mult(a, b) == result;
        where:
        a   | b | result
        2 | 3 | 6   //pass
        3 | 4 | 12  //pass
    }
    @Unroll
    void multtest2(){

        expect:
        ex6.mult(a, b) == result;
        where:
        a   | b | result
        2.03f | 3.0f | 6.09f   //pass
        3.033 | 4.08 | 12  //fail
    }


}

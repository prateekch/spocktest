import spock.lang.Specification

class EX6Spec extends Specification {
    def ex6
    void setup(){
        ex6=new EX6();
    }
    void removestringtest(){
        expect:
        ex6.removestring(s)==result
        where:
        s              | result
        "ABCDEFGHIJKL" | "LKJICBA"

    }

}

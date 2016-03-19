import spock.lang.Specification

class JavaClassSpec extends Specification {
    def "test plus"() {
        given:
            def javaClass = new JavaClass()
        expect:
            javaClass.plus(a, b) == c
        where:
            a   | b   || c
            1   | 2   || 3
            1   | 7   || 8
            1   | -2  || -1
            100 | 2   || 102
    }

}
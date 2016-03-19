import spock.lang.Specification


class GroovyClassSpec extends Specification {
    def "test minus"() {
        given:
            def groovyClass = new GroovyClass()
        expect:
            groovyClass.minus(a, b) == c
        where:
            a   | b   || c
            1   | 2   || -1
            1   | 7   || -6
            1   | -2  || 3
            100 | 2   || 98
    }

}
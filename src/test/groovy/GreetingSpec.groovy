import spock.lang.Specification

class GreetingSpec extends Specification {

    def "greeting have configurable prefix"() {
        expect: new Greeting("Hi").to("John") == "Hi John";
    }

}

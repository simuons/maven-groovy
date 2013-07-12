class Greeting {

    String prefix;

    Greeting(String prefix) {
        this.prefix = prefix
    }

    String to(String name) {
        prefix + " " + name
    }
}

package demograils

class Counter {
    String name
    Integer value = 0

    static constraints = {
        name blank: true, size: 20
    }
}

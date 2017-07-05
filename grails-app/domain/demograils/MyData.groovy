package demograils

class MyData {
    Integer id
    String data
    Date RecordCreatedDate = new Date()

    static constraints = {
    }

    static mapping = {
        version false
    }
}

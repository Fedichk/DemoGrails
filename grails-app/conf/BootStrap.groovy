import demograils.Counter
import demograils.MyData

class BootStrap {

    def init = { servletContext ->
        if (Counter.findByName("QN_ID") == null) {
            new Counter(name: "QN_ID").save()
        }
    }
    def destroy = {
    }
}

package Data_Storage;

public class Model {

    private String query;
    private Object controllerBD;
    private Parser parser;

    public Model() {

    }

    public Parser getParser() {
        return parser;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Object getControllerBD() {
        return controllerBD;
    }

    public void setControllerBD(Object controllerBD) {
        this.controllerBD = controllerBD;
    }
}

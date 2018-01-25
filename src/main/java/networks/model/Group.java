package networks.model;

public class Group {

    private String name;
    private String body;

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Group() {
    }

    public Group(String name, String body) {

        this.name = name;
        this.body = body;
    }
}

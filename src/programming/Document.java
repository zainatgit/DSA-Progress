package programming;

public class Document {

    private int id;
    private String type;

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", expDate='" + expDate + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    private String expDate;

    public Document(int id, String type, String expDate) {
        this.id = id;
        this.type = type;
        this.expDate = expDate;
    }

}

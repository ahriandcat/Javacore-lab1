import java.util.Arrays;

public class Library {
    private int id;
    private String name;
    private String [] type;
    private String publisher;
    private int year;

    public Library(int id, String name, String[] type, String publisher, int year) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.publisher = publisher;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + Arrays.toString(type) +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                '}';
    }
}

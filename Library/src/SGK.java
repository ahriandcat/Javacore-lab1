public class SGK extends Library {
    private int quantity;
    private int numOfPage;
    private String author;

    public SGK(int id, String name, String[] type, String publisher, int year, int quantity, int numOfPage, String author) {
        super(id, name, type, publisher, year);
        this.quantity = quantity;
        this.numOfPage = numOfPage;
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + " " + quantity + " "+ numOfPage+ " "+ author;
    }
}

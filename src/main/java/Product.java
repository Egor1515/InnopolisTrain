public class Product {

    private int id;
    private String author;
    private int pYear;

    public Product() {

    }
    public Product(int id, String author, int pYear) {
        this.id = id;
        this.author = author;
        this.pYear = pYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getpYear() {
        return pYear;
    }

    public void setpYear(int pYear) {
        this.pYear = pYear;
    }
}

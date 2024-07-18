

public class Book extends Product{


    private String author;

    public Book(){

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, double price, String author){

        super(name,price);

        this.author = author;

    }


    public double getDiscount() {
        return getPrice() - (getPrice() * 0.30);
    }

}

public class Movie extends Product {


    public String director;


    public Movie(){

    }


    public Movie(String name, double price, String director){


        super(name, price);

        this.director = director;

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public double getDiscount() {
        return getPrice() - (getPrice() * 0.20);
    }

}

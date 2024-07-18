public class Main {


    public static void main(String[] args) {



        // Task 1
        // Test Book with parameterized constructor
        Book book1 = new Book("The Lord of the Rings", 20.0, "J.R.R. Tolkien");
        System.out.println("Book: Name: " + book1.getName() + ", Price: " + book1.getPrice() + ", Author: " + book1.getAuthor() + ", Discount: " + book1.getDiscount());


        // Test Movie with parameterized constructor
        Movie movie1 = new Movie("The Godfather", 10.0, "Francis Ford Coppola");
        movie1.setDirector("Francis Ford Coppola");  // Set director for the movie1
        System.out.println("Movie: Name:  " + movie1.getName() + ", Price: " + movie1.getPrice() + ", Director: " + movie1.getDirector() + ", Discount: " + movie1.getDiscount());



        // Task 2

        // Create a MovablePoint object
        MovablePoint point = new MovablePoint(2, 5, 4, 6);

        // Print initial state
        System.out.println("Initial State: " + point);

        // Move the point (right, up)
        point.moveRight();
        point.moveUp();

        // Print state after movements
        System.out.println("State after moveRight and moveUp: " + point);

        // Change speed and move (left, down)
        point.setxSpeed(10);
        point.moveLeft();
        point.setySpeed(20);
        point.moveDown();

        // Print final state
        System.out.println("Final State: " + point);


    }
}
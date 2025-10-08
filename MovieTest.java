class Movie {

    private String title;
    private double rating;

    // Constructor 1 (validates rating)
    public Movie(String t, double r) {
        title = t;
        setRating(r);  // call setter for validation
    }

    // Constructor 2 (default rating)
    public Movie(String t) {
        title = t;
        rating = 5.0;
    }

    public void setRating(double r) {
        if (r >= 0 && r <= 10) {
            rating = r;
        } else {
            System.out.println("Invalid rating. Please enter a rating between 0 and 10.");
        }
    }

    public double getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }
}

public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", 8.8);
        Movie m2 = new Movie("Interstellar", 9.0);
        Movie m3 = new Movie("The Dark Knight");

        m1.setRating(11);   // invalid
        m2.setRating(9.5);  // valid

        System.out.println(m1.getTitle() + " has rating: " + m1.getRating());
        System.out.println(m2.getTitle() + " has rating: " + m2.getRating());
        System.out.println(m3.getTitle() + " has rating: " + m3.getRating());
    }
}

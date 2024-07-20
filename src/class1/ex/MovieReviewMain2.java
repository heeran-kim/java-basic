package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "inception";
        inception.review = "life is infinite";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "aboutTime";
        aboutTime.review = "life movie";

        MovieReview[] reviews = {inception, aboutTime};

        for (MovieReview r : reviews) {
            System.out.println("Title: " + r.title + ", Review: " + r.review);
        }
    }
}

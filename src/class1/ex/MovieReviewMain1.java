package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "inception";
        inception.review = "life is infinite";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "aboutTime";
        aboutTime.review = "life movie";

        System.out.println("Title: " + inception.title + ", Review: " + inception.review);
        System.out.println("Title: " + aboutTime.title + ", Review: " + aboutTime.review);
    }
}

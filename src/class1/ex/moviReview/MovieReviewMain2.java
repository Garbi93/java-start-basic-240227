package class1.ex.moviReview;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview hong = new MovieReview();
        hong.title = "홍길동전";
        hong.review = "감동적인 가족극";

        MovieReview ironMan = new MovieReview();
        ironMan.title = "아이언맨";
        ironMan.review = "한 남자의 지구 구하기";

        MovieReview[] movieReviews = new MovieReview[]{hong, ironMan};

        System.out.println("영화 리뷰 관리하기2");
        for (MovieReview movieReview : movieReviews) {
            System.out.println("제목 : " + movieReview.title + "\n리뷰 내용 : " + movieReview.review);
            System.out.println("=================");
        }
    }


}

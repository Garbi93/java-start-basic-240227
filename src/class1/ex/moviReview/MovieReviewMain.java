package class1.ex.moviReview;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview hong = new MovieReview();
        hong.title = "홍길동전";
        hong.review = "감동적인 가족극";

        MovieReview ironMan = new MovieReview();
        ironMan.title = "아이언맨";
        ironMan.review = "한 남자의 지구 구하기";

        System.out.println("제목 : " + hong.title + "\n리뷰 내용 : " + hong.review);
        System.out.println("제목 : " + ironMan.title + "\n리뷰 내용 : " + ironMan.review);

    }


}

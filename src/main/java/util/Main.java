package util;

import controller.ottservice.ContentController;

public class Main {
    public static void main(String[] args) {
        // ContentController 인스턴스 생성
        // 영화 Selenium & DB 저장
    	ContentController contentController = new ContentController();

        // Selenium 크롤링 메서드 실행
        contentController.crawlAndSaveMovies();
        //contentController.crawlAndSaveDramas();
        //contentController.crawlAndSaveAnimations();
    }
}
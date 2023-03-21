package chap_07;

public class BlackBox {
    String modelName; // 모델명, 인스턴스 변수
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상

    static boolean canAutoReport = false; // 자동 신고 기능, static 이 붙으면 클래스 변수, 모든 객체에 동일하게 적용됨
}

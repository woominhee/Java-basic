package chap_07.camera;

public class FactoryCam extends Camera { // 자식 클래스
    public FactoryCam() {
        // this.name = "공장 카메라";
        super("공장 카메라"); // super - 부모 클래스의 생성자 호출
    }

    public void recordVideo() {
        super.recordVideo(); // super - 부모 클래스의 recordVideo 를 실행
        detectFire();
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    } // 메소드 오버라이딩
}

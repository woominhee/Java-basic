package chap_07;

public class BlackBox {
    String modelName; // 모델명, 인스턴스 변수
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상

    int serialNumber; // 시리얼 번호
    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 ++ 연산을 통해서 값을 증가)

    static boolean canAutoReport = false; // 자동 신고 기능, static 이 붙으면 클래스 변수, 모든 객체에 동일하게 적용됨

    BlackBox() { // 객체가 생성될 때 자동으로 호출됨
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 기본 생성자 호출, 위의 BlackBox() 를 함께 실행하고 싶을 때 사용
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        }
        else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10;
    }

    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() { // 인스턴스 메소드
        record(true, true, 5); // 메소드 안에 메소드 (메소드 오버로딩)
    }

    static void callServiceCenter() { // 클래스 메소드
        System.out.println("서비스 센터(1588-oooo) 로 연결합니다.");
        // static 메소드 안에서 static 으로 선언한 변수는 사용 가능, 인스턴스 변수는 사용 불가능
        // modelName = "test"; // 불가능
        // canAutoReport = false; // 가능
    }

    void appendModelName(String modelName) {
        this.modelName += modelName; // 변수 이름이 같을 때 this 사용
    }

    // Getter & Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}

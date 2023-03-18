package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;  // 문자열 변수 name 선언
        name = "미니";  // "미니" 라는 값을 가지게 됨
        // String name = "미니"
        int hour = 15;  // 정수형 변수

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;  // 실수형 변수
        char grade = 'A';  // 한 글자인 문자 변수
        name = "강백호";  // name 값 업데이트

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;  // 불리언 변수
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14;  // float 보다 정밀
        float f = 3.14F;  // 뒤에 F를 붙여서 float 자료형 이라는 것을 나타냄
        System.out.println(d);
        System.out.println(f);

        long l = 10000000000L;  // int형의 범위를 벗어나므로 long을 씀
        System.out.println(l);
    }
}

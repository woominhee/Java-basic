package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
        return getPower(number, 2); // 어떤 메소드에서 다른 메소드 사용 가능
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유
        // 코드의 중복 사용을 없애기 위해 (메소드를 불러와서 숫자만 입력하면 됨)

        // 2의 2승을 구하기
        System.out.println(getPower(2, 2)); // 2 * 2 = 4

        // 3의 3승을 구하기
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27

        // 4의 2승을 구하기
        System.out.println(getPower(4, 2)); // 4 * 4 = 16
    }
}

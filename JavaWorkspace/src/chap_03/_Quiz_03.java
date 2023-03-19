package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";
        System.out.println(id.substring(0, 8)); // 방법 1
        System.out.println(id.substring(0, id.indexOf("-") + 2)); // 방법 2
    }
}

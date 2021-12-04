package Hongongjava;

public class KoreanExample {

    public static void main(String[] args) {

        //
        // 메인메소드에서 코리언 클래스 객체를 사용해서 객체를 만들거야.
        // 코리안 클래스에서 객체 매개변수를 제한해 놨음.
        // Korean(String n, String s) <- 이 양식으로 매개변수 n, s 선언함
        // 위 양식에 맞춰서 작성해야해.
        // korean 클래스 필드에 저장한 name과 ssn에 객체가 각각 저장되어
        // 객체가 만들어질 거야

        Korean k1 = new Korean("노자바", "01009523-1236523");
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);
        Korean k2 = new Korean("문자바", "01009524-1236524");
        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);




    }

}

package HongongjaFinal;

public class Person {

    // 필드 값
    final String nation = "Korean";
    final String ssn;
    String name;
    // 이 두 가지 변수를 상수로 만들거라면? 맨 앞에 final을 붙여줘
    // 대신 초기화를 해줘야 완성됨, final String nation; 이렇게 쓸수는 없어.

    // 생성자 값
    // 객체마다 다른 값을 가진 파이널 필드는 생성자에서 상수 값을 줌.
    // 생성자를 안써주면 필드 값에서 에러남
    Person(String ssn, String name) { // 두 개의 매개변수 받는 생성자로 생성함
        this.ssn = ssn;
        this.name = name;
    }
}

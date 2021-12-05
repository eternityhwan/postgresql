package HongongConstructor;

public class Korean {
    // Field
    String nation = "대한민국";
    String name;
    String ssn;

    // Constructor
    Korean(String n, String s) {
        name =n ;
        ssn = s;

        // 필드와 생성자 이름이 달라야하는데.
        // String 뒤에 name 으로 해버리면
        // 매개변수의 값을 name = name; 으로 저장하면
        // 매개변수와 필드값이 동일하면 매개변수의 값이 먼저 저장됨.
        // name 이라는 필드를 명확하게 하려면
        // this.name = name; 이렇게 저장해버리면
        // 내가 가지고있는 name이라는 필드에 매개값을 내 필드에 저장하라는 뜻.
    }
}

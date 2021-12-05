package HongongSingleTon;

public class Singleton {

    //싱글톤 기법
    // 생성자에 private 붙여
    // 필드에 private 정적 객체를 생성해줘라. 이 두 개가 기본임

    private static Singleton singleton = new Singleton();

    //Constructor
    private Singleton() {}


    static Singleton getInstance() {
        // 자기 자신의 필드를 리턴해줘야해
        return singleton; // 필드를 리턴해줘라 클래스가 아니라
    }

   // Singleton 클래스 내에서는 자유자재로 사용 할 수 있어.

}

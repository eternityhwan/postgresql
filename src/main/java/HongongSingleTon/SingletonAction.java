package HongongSingleTon;

public class SingletonAction {
    public static void main(String[] args) {
//        Singleton obj1 = new Singleton();
//        Singleton obj2 = new Singleton();
        // 하나의 클래스를 가지고 두 개의 객체를 만들게됨.
        // 그렇게 되는 것은 원하는 것이 아니야.
        // 때문에 Sington 클래스의 생성자에 private를 걸어줘

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        // getinstance 메소드는 필드에 저장된 번지를 리턴함.
        // getinstance는 싱글톤 객체를 참조하게됨.

        // getinstance 리턴값은 하나의 객체만 리턴됨
        // 하나의 프로그램 내에서 하나의 객체만 이용할 수 있는거임.

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체임");
        } else {
            System.out.println("다른 Singleton 객체임");
        }
    }
}

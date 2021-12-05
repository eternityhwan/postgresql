package HongongjaFinal;

public class PersonAction {
    public static void main(String[] args) {
        Person nomukun = new Person("901232-1285523","노무쿤");

        System.out.println(nomukun.nation);
        System.out.println(nomukun.ssn);
        System.out.println(nomukun.name);

        //final 의 특징은 값을 못 바꾼다는 것이야.
//        nomukun.nation = "JAPAN"; <--에러남 상수 지정 때문에
//        nomukun.ssn = "1236818-5555555"; <--에러남 상수 지정 때문에
        nomukun.name = "문제인"; //<- 이건됨
    }
}

package HongongjaFinal;

public class Earth {
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;

    // 스태틱 파이널 불변의 값을 저장할 때는 상수 이름은 전부 대문자로 써줘야해(관례)
    // PI 저것도 스태틱 필드임, 자바에서 static final 로 선언되어있다는 뜻임
    // 그래서 대문자임
    // 한 번 값이 저장되면 변하지 않아 상수다.

}

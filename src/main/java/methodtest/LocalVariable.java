package methodtest;

public class LocalVariable {
    public static void main(String[] args) {
        // 메소드 블록에서 선언된 변수를 로컬 변수라 함.
        // 로컬 변수 value
        // 로컬 변수 sum
        // 메소드가 끝나게 되면
        int value = 10;
        int sum = value + 20;
        System.out.println(sum);
     // 메소드의 끝 value와 sum 변수 더 이상 사용 불가능. -- 첫 예제 실행 시 여기에 중괄호 닫기가 있었어

        int v1 = 15; // v1 변수 메인 메소드 블럭에서 실행됨.
        if(v1 >10) { // if 블록 내부에서는 v2 변수가 실행되었다.
            int v2;
            v2 = v1 = 10;
        } // int v1은 메인 변수라 사용 가능, v2는 메소드 블럭에서 사용했기 때문에 사용 못함.
       // int v3 = v1 + v2 + 5; // v2 에러남
    }
}

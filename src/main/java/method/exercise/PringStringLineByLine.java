package method.exercise;

public class PringStringLineByLine {
    public static void main(String[] args) {
        String[] ee = {"hhhh", "eeee", "ssss"};

        for (String line : ee) {
            System.out.println(line);
        }

        for (int i = 0; i < ee.length; i += 1) {
            System.out.println(ee[i]);
        }
    }
}

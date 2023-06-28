import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[]a = new Integer[4];
        Integer bv =123;
        Demo<Integer> demo = new Demo<>();
        demo.addNum(a,bv,2);
        System.out.println(Arrays.toString(a));
    }
}

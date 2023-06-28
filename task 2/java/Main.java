import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            String []a = new String[10];
            Demo<String> demo = new Demo<>(a);
            System.out.println(Arrays.toString(demo.getArr()));

            demo.setNum(1,"sdf");
            System.out.println(Arrays.toString(demo.getArr()));
            demo.setNum(2,"sdf");
            
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is too small");
        }
    }
}

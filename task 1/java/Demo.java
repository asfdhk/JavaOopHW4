public class Demo {

    public <T>void addNum(T[] arr,T num,int index){
        try {
            arr[index] = num;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is too small");
        }
    }
    
}

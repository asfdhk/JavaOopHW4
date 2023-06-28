public class Demo <T>{

    public void addNum(T[] arr,T num,int index){
        try {
            arr[index] = num;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is too small");
        }
    }
}

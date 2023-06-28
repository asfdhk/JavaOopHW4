public class Demo<T> {
    private T[] arr;

    public Demo(T[] arr){
        this.arr = arr;
    }

    public void setNum(int i,T num){
        arr[i] =num;
    }

    public void getNum(int i){
        System.out.println(arr[i]);
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }
}

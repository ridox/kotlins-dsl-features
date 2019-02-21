import java.util.Optional;

public class MyList<T> {

    private int length;

    private T get(int idx) {
        return Optional.<T>empty().get();
    }

    private void set(int idx, T value) {
    }

    public void fillWith(MyList<? extends T> array) {
        for (int i = 0; i < this.length; i++) {
            set(i, array.get(i));
        }
    }

    public void copyTo(MyList<? super T> array) {
        for (int i = 0; i < array.length; i++) {
            array.set(i, get(i));
        }
    }

    public static void main(String[] args) {
        MyList<Number> myList1 = new MyList<>();
        MyList<Integer> myList2 = new MyList<>();
        myList1.fillWith(myList2);
        myList2.copyTo(myList1);
    }
}

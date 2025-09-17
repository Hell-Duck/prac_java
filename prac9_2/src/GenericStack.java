import java.util.Arrays;

public class GenericStack<E> {
    String[] list;
    public GenericStack() {
        list = new String[2];
    }
    public int getSize() {
        return list.length;
    }
    public String peek() {
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] != null) {
                return list[i];
            }
        }
        return null;
    }
    public void push(String o) {
        if (list[list.length - 1] != null) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        for (int i = 0 ; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = o;
                return;
            }
        }
    }
    public String pop() {
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] != null) {
                String o = list[i];
                list[i] = null;
                return o;
            }
        }
        return null;
    }
    public boolean isEmpty() {
        return list[0] == null;
    }
    @Override
    public String toString() {
        return "стек: " + Arrays.toString(list);
    }
}

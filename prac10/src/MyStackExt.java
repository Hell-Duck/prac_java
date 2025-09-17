import java.util.ArrayList;

public class MyStackExt extends ArrayList<Object>{
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return super.getLast();
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return super.removeLast();
    }

    public void push(Object o) {
        super.add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + super.toString();
    }
}
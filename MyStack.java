import java.util.ArrayList;

public class MyStack {

    private ArrayList<Object> list = new ArrayList<>();

    // return true if this stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // returns the number of elements in the stack
    public int getSize() {
        return list.size();
    }

    // return th top element in this stack without removu=ing it
    public Object peek() {
        return list.get(getSize() - 1);
    }

    // returns and removes the top element in this stack
    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    // adds a new element to the top of the stack
    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}

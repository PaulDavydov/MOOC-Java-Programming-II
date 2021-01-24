import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> list = new ArrayList<>();
    public Pipe() {
        list = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        list.add(value);
    }

    public T takeFromPipe() {
        if(list.isEmpty()) {
            return null;
        }
        T returnValue = list.get(0);
        list.remove(0);
        return returnValue;
    }

    public boolean isInPipe() {
        if(!list.isEmpty()) {
            return true;
        }
        return false;
    }
}

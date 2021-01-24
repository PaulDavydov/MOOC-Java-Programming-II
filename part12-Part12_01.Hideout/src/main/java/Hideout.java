public class Hideout<T> {
    private T element;

    public void putIntoHideout(T toHide) {
        this.element = toHide;
    }

    public T takeFromHideout() {
        if (this.element == null) {
            return null;
        }
        T returnT = this.element;
        this.element = null;
        return returnT;
    }
    public boolean isInHideout() {
        if (this.element == null) {
            return false;
        }
        return true;
    }
}

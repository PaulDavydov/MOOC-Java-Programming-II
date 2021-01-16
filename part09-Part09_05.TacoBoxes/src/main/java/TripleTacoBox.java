public class TripleTacoBox implements TacoBox{
    private int taco;
    public TripleTacoBox() {
        this.taco = 3;
    }


    @Override
    public int tacosRemaining() {
        return taco;
    }

    @Override
    public void eat() {
        taco -= 1;
    }
}

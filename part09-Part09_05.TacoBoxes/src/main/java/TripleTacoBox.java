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
        this.taco-=1;
        if (this.taco < 0) {
            this.taco = 0;
        }
    }
}

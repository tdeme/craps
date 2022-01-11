public class Die {
    private int nSides;

    public Die(int nSides){
        this.nSides = nSides;
    }

    public int roll(){
        return (int)(Math.random() * nSides) + 1;
    }

    public int getNSides(){
        return nSides;
    }

    public void setNSides(int nSides){
        this.nSides = nSides;
    }
}

public class Tubo {

    private float r, l; //r=raggio l=lunghezza

    public Tubo(float r, float l) {
        this.r = r;
        this.l = l;
    }

    public float volume () {
        return (float) (Math.PI*Math.pow(r, 2)*l);
    }
}

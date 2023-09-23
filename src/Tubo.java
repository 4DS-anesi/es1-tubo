public class Tubo {

    private float r, h; //r=raggio l=lunghezza

    public Tubo(float r, float h) {
        this.r = r;
        this.h = h;
    }

    public float volume () {
        return (float) (Math.PI*Math.pow(r, 2)*h);
    }

    public float superfice () {
        return (float) ((2*Math.PI*r*h)+(2*Math.PI*Math.pow(r, 2)));
    }
}

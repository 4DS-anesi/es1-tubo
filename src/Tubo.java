public class Tubo {

    private float r, h; //r=raggio l=lunghezza

    public Tubo(float r, float h) throws Exception {
        setR(r);
        this.h = h;
    }

    public void setR(float r) throws Exception {
        if (r > 0) {
            this.r=r;
        } else {
            throw new Exception("Errore! Raggio non valido");
        }
    }

    public float volume () {
        return (float) (Math.PI*Math.pow(r, 2)*h);
    }

    public float superfice () {
        return (float) ((2*Math.PI*r*h)+(2*Math.PI*Math.pow(r, 2)));
    }
}

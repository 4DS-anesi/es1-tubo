public class Tubo {

    private float r, h; //r=raggio l=lunghezza

    public Tubo(float r, float h) throws Exception {
        setR(r);
        setH(h);
    }

    public void setR(float r) throws Exception {
        if (r > 0) {
            this.r=r;
        } else {
            throw new Exception("Errore! Raggio non valido");
        }
    }

    public void setH(float h) throws Exception {
        if (h > 0) {
            this.h=h;
        } else {
            throw new Exception("Errore! Altezza non valida");
        }
    }

    public float getR() {
        return r;
    }

    public float getH() {
        return h;
    }

    public float volume () {
        return (float) (Math.PI*Math.pow(r, 2)*h);
    }

    public float superfice () {
        return (float) ((2*Math.PI*r*h)+(2*Math.PI*Math.pow(r, 2)));
    }

    @Override
    public String toString() {
        return "Tubo: " +
                "r=" + r +
                ", h=" + h;
    }
}

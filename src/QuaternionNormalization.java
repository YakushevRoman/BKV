public class QuaternionNormalization {

    public static final double E = 0.0;

    private double la_0;
    private double la_1;
    private double la_2;
    private double la_3;
    private double quaternionNormalization;

    public QuaternionNormalization(double la_0, double la_1, double la_2, double la_3) {
        this.la_0 = la_0;
        this.la_1 = la_1;
        this.la_2 = la_2;
        this.la_3 = la_3;
    }

    public double getQuaternionNormalization (){
        double s = Math.sqrt(Math.pow(la_0, 2)+Math.pow(la_1, 2)+Math.pow(la_2, 2)+Math.pow(la_3, 2));
        if (Math.abs(1- s) >  E){
            la_0 = la_0/s;
            la_1 = la_1/s;
            la_2 = la_2/s;
            la_3 = la_3/s;
        }
        return quaternionNormalization;
    }

    public double getLa_0() {
        return la_0;
    }

    public void setLa_0(double la_0) {
        this.la_0 = la_0;
    }

    public double getLa_1() {
        return la_1;
    }

    public void setLa_1(double la_1) {
        this.la_1 = la_1;
    }

    public double getLa_2() {
        return la_2;
    }

    public void setLa_2(double la_2) {
        this.la_2 = la_2;
    }

    public double getLa_3() {
        return la_3;
    }

    public void setLa_3(double la_3) {
        this.la_3 = la_3;
    }
}

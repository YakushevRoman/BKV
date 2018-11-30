public class ArcTg {

    private double sin_angle;
    private double cos_angle;
    private double angle;

    public ArcTg(double sin_angle, double cos_angle) {
        this.sin_angle = sin_angle;
        this.cos_angle = cos_angle;
    }

    public double getAngle (double sin_angle, double cos_angle){
        if (sin_angle >= 0 && cos_angle >= 0){
            angle = Math.atan(sin_angle/cos_angle);
        }
        if (sin_angle >= 0 && cos_angle < 0){
            angle = Math.atan(sin_angle/cos_angle);
        }
        if (sin_angle < 0 && cos_angle >= 0){
            angle = Math.atan(sin_angle/cos_angle);
        }
        if (sin_angle < 0 && cos_angle < 0){
            angle = Math.atan(sin_angle/cos_angle);
        }
        return angle;
    }

    public double getSin_angle() {
        return sin_angle;
    }

    public void setSin_angle(double sin_angle) {
        this.sin_angle = sin_angle;
    }

    public double getCos_angle() {
        return cos_angle;
    }

    public void setCos_angle(double cos_angle) {
        this.cos_angle = cos_angle;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
}

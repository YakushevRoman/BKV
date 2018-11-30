public class DataBKV {

    private double omega_a_1_x;
    private double omega_a_1_y;
    private double omega_a_1_z;

    private double dw_1_x;
    private double dw_1_y;
    private double dw_1_z;

    public DataBKV( double omega_a_1_x, double omega_a_1_y, double omega_a_1_z, double dw_1_x, double dw_1_y, double dw_1_z) {
        this.omega_a_1_x = omega_a_1_x;
        this.omega_a_1_y = omega_a_1_y;
        this.omega_a_1_z = omega_a_1_z;
        this.dw_1_x = dw_1_x;
        this.dw_1_y = dw_1_y;
        this.dw_1_z = dw_1_z;
    }


    public double getOmega_a_1_x() {
        return omega_a_1_x;
    }

    public void setOmega_a_1_x(double omega_a_1_x) {
        this.omega_a_1_x = omega_a_1_x;
    }

    public double getOmega_a_1_y() {
        return omega_a_1_y;
    }

    public void setOmega_a_1_y(double omega_a_1_y) {
        this.omega_a_1_y = omega_a_1_y;
    }

    public double getOmega_a_1_z() {
        return omega_a_1_z;
    }

    public void setOmega_a_1_z(double omega_a_1_z) {
        this.omega_a_1_z = omega_a_1_z;
    }

    public double getW_1_x() {
        return dw_1_x;
    }

    public void setW_1_x(double w_1_x) {
        this.dw_1_x = w_1_x;
    }

    public double getW_1_y() {
        return dw_1_y;
    }

    public void setW_1_y(double w_1_y) {
        this.dw_1_y = w_1_y;
    }

    public double getW_1_z() {
        return dw_1_z;
    }

    public void setW_1_z(double w_1_z) {
        this.dw_1_z = w_1_z;
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/** для перебора колекции
 * for (ArrayList<Map<String,Double>> maps : allList3001){
 *             for (Map<String, Double> map : maps){
 *                 for (Map.Entry m : map.entrySet()) {
 *                     if (m.getKey() == "l_imu_0") {
 *                         // = (Double) m.getValue();
 *                     }
 *                 }
 *             }
 *         }
 */

public class A3001 {
    QuaternionToMatrix quaternionToMatrix;
    ArcTg arcTg;
    /**
     * Разовый алгоритм
     */
    private Map<String, Double> map3001;
    private ArrayList<Map<String, Double>> list3001;
    private ArrayList<ArrayList<Map<String, Double>>> allList3001;
    /**
     *
     */
    A3101 a3101;

    /**
     * выводные параметры
     */

    public A3001(A3101 a3101) {
        this.a3101 = a3101;
        allList3001 = new ArrayList<>();
    }

    public void result3001() {
        getL_A();
        getL_0();
        getR_geo_init();
        getG_geo();
        getMatrix();
        getDW_g();
    }

    /**
     * @return L_A
     */
    public void getL_A() {
        double a = 0;
        map3001 = new HashMap<>();
        list3001 = new ArrayList<>();
        for (ArrayList<Map<String, Double>> maps : a3101.getAllList()) {
            for (Map<String, Double> map : maps) {
                for (Map.Entry m : map.entrySet()) {
                    if (m.getKey() == "a_0") {
                        a = (Double) m.getValue();
                    }
                }
            }
        }

        map3001 = new HashMap<>();
        map3001.put("l_a_0", Math.cos(-a / 2));
        map3001.put("l_a_1", 0.0);
        map3001.put("l_a_2", Math.sin(-a / 2));
        map3001.put("l_a_3", 0.0);

        list3001.add(map3001);
        allList3001.add(list3001);
    }

    public void getL_0() {
        map3001 = new HashMap<>();
        list3001 = new ArrayList<>();

        double l_imu_0 = 0.0;
        double l_imu_1 = 0.0;
        double l_imu_2 = 0.0;
        double l_imu_3 = 0.0;

        double l_a_0 = 0.0;
        double l_a_1 = 0.0;
        double l_a_2 = 0.0;
        double l_a_3 = 0.0;

        for (ArrayList<Map<String, Double>> maps : a3101.getAllList()) {
            for (Map<String, Double> map : maps) {
                for (Map.Entry m : map.entrySet()) {
                    if (m.getKey() == "l_imu_0") {
                        l_imu_0 = (Double) m.getValue();
                    }
                    if (m.getKey() == "l_imu_1") {
                        l_imu_1 = (Double) m.getValue();
                    }
                    if (m.getKey() == "l_imu_2") {
                        l_imu_2 = (Double) m.getValue();
                    }
                    if (m.getKey() == "l_imu_3") {
                        l_imu_3 = (Double) m.getValue();
                    }
                }
            }
        }

        for (ArrayList<Map<String, Double>> maps : allList3001) {
            for (Map<String, Double> map : maps) {
                for (Map.Entry m : map.entrySet()) {
                    if (m.getKey() == "l_a_0") {
                        l_a_0 = (Double) m.getValue();
                    }
                    if (m.getKey() == "l_a_1") {
                        l_a_1 = (Double) m.getValue();
                    }
                    if (m.getKey() == "l_a_2") {
                        l_a_2 = (Double) m.getValue();
                    }
                    if (m.getKey() == "l_a_3") {
                        l_a_3 = (Double) m.getValue();
                    }
                }
            }
        }

        map3001.put("l_0_0", l_imu_0 * l_a_0 - l_imu_1 * l_a_1 - l_imu_2 * l_a_2 - l_imu_3 * l_a_3);
        map3001.put("l_0_1", l_imu_0 * l_a_1 + l_imu_1 * l_a_0 + l_imu_2 * l_a_3 - l_imu_3 * l_a_2);
        map3001.put("l_0_2", l_imu_0 * l_a_2 + l_imu_2 * l_a_0 + l_imu_3 * l_a_1 - l_imu_1 * l_a_3);
        map3001.put("l_0_3", l_imu_0 * l_a_3 + l_imu_3 * l_a_0 + l_imu_1 * l_a_2 - l_imu_2 * l_a_1);
        list3001.add(map3001);
        allList3001.add(list3001);

    }

    public void getR_geo_init() {
        Double a_0 = 0.0;
        Double b_0 = 0.0;
        map3001 = new HashMap<>();
        list3001 = new ArrayList<>();


        for (ArrayList<Map<String, Double>> maps : a3101.getAllList()) {
            for (Map<String, Double> map : maps) {
                for (Map.Entry m : map.entrySet()) {
                    if (m.getKey() == "a_0") {
                        a_0 = (Double) m.getValue();
                    }
                    if (m.getKey() == "b_0") {
                        b_0 = (Double) m.getValue();
                    }
                }
            }
        }

        map3001.put("r_geo_init", Constants.DOUBLE_A * Math.sqrt(Math.pow((Math.cos(b_0)), 2) + (1 - Constants.DOUBLE_E_2) * Math.pow(Math.sin(b_0), 2) /
                (1 - Constants.DOUBLE_E_2 * Math.pow(Math.sin(b_0), 2))));
        list3001.add(map3001);
        allList3001.add(list3001);
    }

    public void getG_geo() {
        Double h_0 = 0.0;
        Double b_0 = 0.0;

        map3001 = new HashMap<>();
        list3001 = new ArrayList<>();

        for (ArrayList<Map<String, Double>> maps : a3101.getAllList()) {
            for (Map<String, Double> map : maps) {
                for (Map.Entry m : map.entrySet()) {
                    if (m.getKey() == "h_0") {
                        h_0 = (Double) m.getValue();
                    }
                    if (m.getKey() == "b_0") {
                        b_0 = (Double) m.getValue();
                    }
                }
            }
        }

        map3001.put("g_geo_0", 0.0);
        map3001.put("g_geo_1", -Constants.DOUBLE_G_ET * (1 - 2 * h_0 / Constants.DOUBLE_A
                + Constants.DOUBLE_TETA * Math.pow(Math.sin(b_0), 2)));
        map3001.put("g_geo_2", 0.0);

        list3001.add(map3001);
        allList3001.add(list3001);
    }

   public void  getMatrix (){
        quaternionToMatrix = new QuaternionToMatrix(this);

        list3001 = new ArrayList<>();
        quaternionToMatrix.resultQuaternionToMatrix();

        allList3001.add(quaternionToMatrix.getListG1());
        allList3001.add(quaternionToMatrix.getList1G());

    }

    public void getDW_g(){
        Double c_g1_0 = 0.0;
        Double c_g1_1 = 0.0;
        Double c_g1_2 = 0.0;
        Double c_g1_3 = 0.0;
        Double c_g1_4 = 0.0;
        Double c_g1_5 = 0.0;
        Double c_g1_6 = 0.0;
        Double c_g1_7 = 0.0;
        Double c_g1_8 = 0.0;
        Double dw_imu_x = 0.0;
        Double dw_imu_y = 0.0;
        Double dw_imu_z = 0.0;

        map3001 = new HashMap<>();
        list3001 = new ArrayList<>();
        for (ArrayList<Map<String, Double>> maps : allList3001) {
            for (Map<String, Double> map : maps) {
                for (Map.Entry m : map.entrySet()) {
                    if (m.getKey() == "c_g1_0") {
                        c_g1_0 = (Double) m.getValue();
                    }
                    if (m.getKey() == "c_g1_1") {
                        c_g1_1 = (Double) m.getValue();
                    }
                    if (m.getKey() == "c_g1_2") {
                        c_g1_2 = (Double) m.getValue();
                    }
                    if (m.getKey() == "c_g1_3") {
                        c_g1_3 = (Double) m.getValue();
                    }
                    if (m.getKey() == "c_g1_4") {
                        c_g1_4 = (Double) m.getValue();
                    }
                    if (m.getKey() == "c_g1_5") {
                        c_g1_5 = (Double) m.getValue();
                    }
                    if (m.getKey() == "c_g1_6") {
                        c_g1_6 = (Double) m.getValue();
                    }
                    if (m.getKey() == "c_g1_7") {
                        c_g1_7 = (Double) m.getValue();
                    }
                    if (m.getKey() == "c_g1_8") {
                        c_g1_8 = (Double) m.getValue();
                    }
                }
            }
        }
        for (ArrayList<Map<String, Double>> maps : a3101.getAllList()) {
            for (Map<String, Double> map : maps) {
                for (Map.Entry m : map.entrySet()) {
                    if (m.getKey() == "dw_imu_x") {
                        dw_imu_x = (Double) m.getValue();
                    }
                    if (m.getKey() == "dw_imu_y") {
                        dw_imu_y = (Double) m.getValue();
                    }
                    if (m.getKey() == "dw_imu_z") {
                        dw_imu_z = (Double) m.getValue();
                    }
                }
            }
        }

        map3001.put("dw_g_x", c_g1_0*dw_imu_x + c_g1_1*dw_imu_y + c_g1_2*dw_imu_z);
        map3001.put("dw_g_y", c_g1_3*dw_imu_x + c_g1_4*dw_imu_y + c_g1_5*dw_imu_z);
        map3001.put("dw_g_z", c_g1_6*dw_imu_x + c_g1_7*dw_imu_y + c_g1_8*dw_imu_z);

        list3001.add(map3001);
        allList3001.add(list3001);
    }

   public void getV_g(){
        v_g[0] = 0;
        v_g[1] = 0;
        v_g[2] = Constants.DOUBLE_Q*r_geo_init*Math.cos(B);

    }

   /* public double[] getOmega_a_g(){
        omega_a_g[0] = v_g[2]/r_geo_init;
        omega_a_g[1] = (v_g[2]*Math.tan(B))/r_geo_init;
        omega_a_g[2] = - v_g[0]/r_geo_init;
        return omega_a_g;
    }

    /*public double [] getDv_g(){
        dv_g[0] = DW_g[0] + g_geo[0];
        dv_g[1] = DW_g[2] + g_geo[1];
        dv_g[2] = DW_g[2] + g_geo[2];
        dv_g_prev = dv_g;
        return dv_g;
    }

    /*public double getH(){
        H = Constants.DOUBLE_H0 + v_g[1]*Constants.DOUBLE_T1;
        return H;
    }

    /*public double [] getOmega_1 (){
        omega_1[0] = omega_a1[0] - (C1_g[0]*omega_a_g[0] + C1_g[1]*omega_a_g[1] + C1_g[2]*omega_a_g[2]);
        omega_1[1] = omega_a1[1] - (C1_g[3]*omega_a_g[0] + C1_g[4]*omega_a_g[1] + C1_g[5]*omega_a_g[2]);;
        omega_1[2] = omega_a1[2] - (C1_g[6]*omega_a_g[0] + C1_g[7]*omega_a_g[1] + C1_g[8]*omega_a_g[2]);;
        return omega_1;
    }

    /*public double getPsi (){
        psi = Math.atan2( -Cg_1[2], Cg_1[0]);
        if (psi < 0){
            psi += 360;
        }
        return psi;
    }
    /*public double getTeta (){
        psi = Math.atan2( -Cg_1[1], Math.sqrt(Math.pow(Cg_1[5], 2)+Math.pow(Cg_1[7], 2)));
        return psi;
    }
    /*public double getGamma (){
        psi = Math.atan2( -Cg_1[7], Cg_1[5]);
        return psi;
    }*/

    public ArrayList<ArrayList<Map<String, Double>>> getAllList3001() {
        return allList3001;
    }

    public void setAllList3001(ArrayList<ArrayList<Map<String, Double>>> allList3001) {
        this.allList3001 = allList3001;
    }
}

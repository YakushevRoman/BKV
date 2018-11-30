import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class A3101 {

    private Map<String, Double> map;
    private ArrayList<Map<String, Double>> list;
    private ArrayList<ArrayList<Map<String, Double>>> allList;

    A3101() {
        allList = new ArrayList<>();
    }

    void resultA3101() {
        getDW();
        getOmega_a1();
        getL_10();
        getB();
        getA();
        getH();
    }

    /**
     * @return DWI_a1
     */
    private void getDW() {
        map = new HashMap<>();

        map.put("dw_imu_x", Constants.DOUBLES_DW_IMU[0]);
        map.put("dw_imu_y", Constants.DOUBLES_DW_IMU[1]);
        map.put("dw_imu_z", Constants.DOUBLES_DW_IMU[2]);

        list = new ArrayList<>();
        list.add(map);
        allList.add(list);
    }

    private void getOmega_a1() {
        map = new HashMap<>();
        map.put("omega_imu_x", Constants.DOUBLES_OMEGA_IMU[0]);
        map.put("omega_imu_y", Constants.DOUBLES_OMEGA_IMU[1]);
        map.put("omega_imu_z", Constants.DOUBLES_OMEGA_IMU[2]);

        list = new ArrayList<>();
        list.add(map);
        allList.add(list);
    }


    private void getL_10() {
        map = new HashMap<>();
        map.put("l_imu_0", Constants.DOUBLE_L_IMU[0]);
        map.put("l_imu_1", Constants.DOUBLE_L_IMU[1]);
        map.put("l_imu_2", Constants.DOUBLE_L_IMU[2]);
        map.put("l_imu_3", Constants.DOUBLE_L_IMU[3]);

        list = new ArrayList<>();
        list.add(map);
        allList.add(list);
    }

    /**
     * @return B
     */
    private void getB() {
        map = new HashMap<>();
        map.put("b_0", Constants.B0*Math.PI/180);

        list = new ArrayList<>();
        list.add(map);
        allList.add(list);
    }

    /**
     * @return A
     */
    private void getA() {
        map = new HashMap<>();
        map.put("a_0", Constants.A0);

        list = new ArrayList<>();
        list.add(map);
        allList.add(list);
    }

    /**
     * @return H
     */
    private void getH() {
        map = new HashMap<>();
        map.put("h_0", Constants.DOUBLE_H0);

        list = new ArrayList<>();
        list.add(map);
        allList.add(list);
    }

    @Override
    public String toString() {
        return "A3101{" +
                "list=" + allList +
                '}';
    }

    ArrayList<ArrayList<Map<String, Double>>> getAllList() {
        return allList;
    }

}

import java.util.ArrayList;
import java.util.Map;

public class BKV {
    public static void main(String[] args) {
        A3101 a3101 = new A3101();
        a3101.resultA3101();
        System.out.println(a3101.getAllList());

        A3001 a3001 = new A3001(a3101);
        a3001.result3001();

        System.out.println(a3001.getAllList3001());
    }
}
        //
        // System.out.println(a3101.getH());


        /*ArrayList<ArrayList<Map<String, Double>>> allList= a3101.getAllList();

        /*for (ArrayList<Map<String, Double>> maps : allList)
            for (Map<String, Double> map : maps) {
                for (Map.Entry m : map.entrySet()) {
                    if (m.getKey() == "dw_imu_z") {
                        a = (Double) m.getValue();
                    }
                }
                System.out.println(map);
            }
        System.out.println(a);
        //A3001 a3001 = new A3001(a3101);
        //System.out.println(a3001.getL_A());*/


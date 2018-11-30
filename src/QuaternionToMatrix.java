import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QuaternionToMatrix {

    private A3001 a3001;
    private ArrayList <Map <String, Double>> listG1;
    private ArrayList <Map <String, Double>> list1G;
    private Map<String, Double> map;


    public QuaternionToMatrix(A3001 a3001) {
        this.a3001 = a3001;
        listG1 = new ArrayList<>();
        list1G = new ArrayList<>();
    }

    public void resultQuaternionToMatrix(){
        getMatrixG1();
        getMatrix1G();
    }

    public void getMatrixG1() {
        Double l_0_0 = 0.0;
        Double l_0_1 = 0.0;
        Double l_0_2 = 0.0;
        Double l_0_3 = 0.0;

        map = new HashMap<>();
        listG1 = new ArrayList<>();

          for (ArrayList<Map<String,Double>> maps : a3001.getAllList3001()){
                      for (Map<String, Double> map : maps){
                         for (Map.Entry m : map.entrySet()) {
                             if (m.getKey() == "l_0_0") {
                                 l_0_0 = (Double) m.getValue();
                             }
                             if (m.getKey() == "l_0_1") {
                                 l_0_1 = (Double) m.getValue();
                             }
                             if (m.getKey() == "l_0_2") {
                                 l_0_2 = (Double) m.getValue();
                             }
                             if (m.getKey() == "l_0_3") {
                                 l_0_3 = (Double) m.getValue();
                             }
                          }
                      }
                  }
        map.put("c_g1_0",2*(Math.pow(l_0_0,2)+Math.pow(l_0_1,2)) - 1);
        map.put("c_g1_1",2*(l_0_1*l_0_2 + l_0_0*l_0_3));
        map.put("c_g1_2",2*(l_0_1*l_0_3 - l_0_0*l_0_2));

        map.put("c_g1_3",2*(l_0_1*l_0_2 - l_0_0*l_0_3));
        map.put("c_g1_4",2*(Math.pow(l_0_0,2)+Math.pow(l_0_2,2)) - 1);
        map.put("c_g1_5",2*(l_0_2*l_0_3 + l_0_0*l_0_1));

        map.put("c_g1_6",2*(l_0_1*l_0_3 + l_0_0*l_0_2));
        map.put("c_g1_7",2*(l_0_2*l_0_3 - l_0_0*l_0_1));
        map.put("c_g1_8",2*(Math.pow(l_0_0,2)+Math.pow(l_0_3,2)) - 1);

        listG1.add(map);


    }

    public void getMatrix1G() {
        Double l_0_0 = 0.0;
        Double l_0_1 = 0.0;
        Double l_0_2 = 0.0;
        Double l_0_3 = 0.0;

        map = new HashMap<>();
        list1G = new ArrayList<>();

        for (ArrayList<Map<String,Double>> maps : a3001.getAllList3001()){
            for (Map<String, Double> map : maps){
                for (Map.Entry m : map.entrySet()) {
                    if (m.getKey() == "l_0_0") {
                        l_0_0 = (Double) m.getValue();
                    }
                    if (m.getKey() == "l_0_1") {
                        l_0_1 = (Double) m.getValue();
                    }
                    if (m.getKey() == "l_0_2") {
                        l_0_2 = (Double) m.getValue();
                    }
                    if (m.getKey() == "l_0_3") {
                        l_0_3 = (Double) m.getValue();
                    }
                }
            }
        }

        map.put("c_1g_0",2*(Math.pow(l_0_0,2)+Math.pow(l_0_1,2)) - 1);
        map.put("c_1g_1",2*(l_0_1*l_0_2 - l_0_0*l_0_3));
        map.put("c_1g_2",2*(l_0_1*l_0_3 + l_0_0*l_0_2));

        map.put("c_1g_3",2*(l_0_1*l_0_2 + l_0_0*l_0_3));
        map.put("c_1g_4",2*(Math.pow(l_0_0,2)+Math.pow(l_0_2,2)) - 1);
        map.put("c_1g_5",2*(l_0_2*l_0_3 - l_0_0*l_0_1));

        map.put("c_1g_6",2*(l_0_1*l_0_3 - l_0_0*l_0_2));
        map.put("c_1g_7",2*(l_0_2*l_0_3 + l_0_0*l_0_1));
        map.put("c_1g_8",2*(Math.pow(l_0_0,2)+Math.pow(l_0_3,2)) - 1);

        list1G.add(map);
    }

    public ArrayList<Map<String, Double>> getListG1() {
        return listG1;
    }

    public void setListG1(ArrayList<Map<String, Double>> listG1) {
        this.listG1 = listG1;
    }

    public ArrayList<Map<String, Double>> getList1G() {
        return list1G;
    }

    public void setList1G(ArrayList<Map<String, Double>> list1G) {
        this.list1G = list1G;
    }
}


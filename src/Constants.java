public final class Constants {
    /**
     * A - Большая полуось Земного эллипсоида
     * E_2 - Квадрат первого эксцентриситета
     * Q - Угловая скорость вращения Земли
     * G_ET - Ускорение свободного падения на экваторе
     * TETA - Константа Клеро
     * T1 - Длительность такта
     * H0 - Начальная высота полета самолета
     */
    public static final double DOUBLE_A = 6378137.0;
    public static final double DOUBLE_E_2 = 0.00669438;
    public static final double DOUBLE_Q = 0.00007292115;
    public static final double DOUBLE_G_ET = 9.780318;
    public static final double DOUBLE_TETA = 0.0053024;
    public static final double DOUBLE_T1 = 0.005;
    public static final double DOUBLE_H0 = 0;
    /**
     * Параметры для начлаьной инициализации алгоритма
     */
    public static final double [] DOUBLES_OMEGA_IMU = {-0.000035, 0.000066293, -0.000010336};
    public static final double [] DOUBLES_DW_IMU = {-0.027885456, 9.814031286, -0.069709825};
    public static final double B0 = 49.50284618;
    public static final double A0 = -0.0544321;
    public static final double [] DOUBLE_L_IMU = {0.011339773, -0.001404958, 0.999928099, -0.003608172};
}

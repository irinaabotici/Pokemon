public class ArenaSingleton {
    private static Arena INSTANCE;

    private ArenaSingleton() {
    }

    public static Arena getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Arena();
        }
        return INSTANCE;
    }
}

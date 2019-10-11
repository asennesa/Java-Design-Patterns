public class Singleton {
    private static Singleton instance;

    //Private constructor so no one can create an instance of Singleton using it.
    private Singleton() {
    }

    //Public method that allows the use of only one unique instance of the class.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

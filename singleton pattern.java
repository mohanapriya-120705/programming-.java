class Singleton {

    // Public instance variable
    public String str;

    // Private static variable that holds the single instance
    private static Singleton singleInstance = null;

    // Private constructor (prevents instantiation from outside)
    private Singleton() { }

    // Static method to get the single instance
    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}

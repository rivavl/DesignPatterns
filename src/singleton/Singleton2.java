package singleton;

// можно сделать так, если затраты на создание не очень существенны
public class Singleton2 {
    private static Singleton2 uniqueInstance = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return uniqueInstance;
    }
}

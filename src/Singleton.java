import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private Singleton() {
        // Prevent instantiation via reflection
        if (SingletonHolder.INSTANCE != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    // Holder class for lazy-loaded Singleton instance
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // Prevents Singleton from being instantiated more than once during deserialization
    protected Object readResolve() {
        return getInstance();
    }

    // Override clone method to prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone Singleton instance");
    }
}


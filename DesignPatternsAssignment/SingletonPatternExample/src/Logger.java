public class Logger {

    // Step 1: Create a private static instance of Logger
    private static Logger instance;

    // Step 2: Make the constructor private
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Step 3: Provide a public method to access the single instance
    public static Logger getInstance() {

        // Create the object only if it doesn't already exist
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    // Step 4: Logging method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
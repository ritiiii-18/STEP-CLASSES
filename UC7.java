public class HelloWithJoin {
    public static void main(String[] args) {
        String message;

        if (args.length > 0) {
            // Join all arguments with ", " delimiter
            String joined = String.join(", ", args);
            message = "Hello: " + joined;
        } else {
            // Default message when no arguments are provided
            message = "Hello: World (default message - no arguments provided)";
        }

        System.out.println(message);
    }
}

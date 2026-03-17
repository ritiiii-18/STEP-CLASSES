public class HelloArgs {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            // Default message when no arguments are provided
            System.out.println("Hello, World!");
        } else {
            // Enhanced for loop to greet each argument
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}

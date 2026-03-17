public class HelloArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!"); // Default message
        } else {
            System.out.print("Hello");
            for (String arg : args) {
                System.out.print(", " + arg);
            }
            System.out.println("!");
        }
    }
}

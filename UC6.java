public class HelloWithArgs {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("No arguments provided. Usage: java HelloWithArgs <arg1> <arg2> ...");
            return;
        }

        // Build a string by appending each argument with a delimiter
        String delimiter = ", ";
        StringBuilder sb = new StringBuilder("Hello: ");

        for (String arg : args) {
            sb.append(arg).append(delimiter);
        }

        // Convert to string with trailing delimiter
        String result = sb.toString();
        System.out.println("Before removing trailing delimiter: " + result);

        // Remove the trailing delimiter using substring
        result = result.substring(0, result.length() - delimiter.length());
        System.out.println("After removing trailing delimiter:  " + result);
    }
}

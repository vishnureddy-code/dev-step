public class HelloSubstring {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "Hello ";

            // Add names with comma
            for (String name : args) {
                result += name + ", ";
            }

            // Remove last ", " using substring
            result = result.substring(0, result.length() - 2);

            // Print final output
            System.out.println(result);
        }
    }
}
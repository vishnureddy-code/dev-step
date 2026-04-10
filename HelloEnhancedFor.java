public class HelloEnhancedFor {
    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.print("Hello ");

            // Enhanced for loop
            int count = 0;
            for (String name : args) {
                System.out.print(name);
                
                // Add comma between names
                count++;
                if (count < args.length) {
                    System.out.print(", ");
                }
            }
        }
    }
}
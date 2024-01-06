public class TaskSheet113 {
    public static void main(String[] args) {
        // Step 2: Create an int variable and name it check_number with an initial value of 10.
        int check_number = 10;
        
        // Step 3: Create a String variable and name it message.
        String message;
        
        // Step 4: Use check_number as a condition on how many loops the program can print.
        for (int i = 1; i <= check_number; i++) {
            // Step 5: Create a loop that will check and print each number if odd or even numbers.
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";
            
            // Step 6: The next line should print the message value.
            System.out.println(message);
        }
    }
}

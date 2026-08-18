package exceptionhandling;
public class TryResourceBlock {
    public static void main(String[] args) {
        try(java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

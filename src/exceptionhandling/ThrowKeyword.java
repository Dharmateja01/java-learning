package exceptionhandling;

public class ThrowKeyword {
    int age;
    public void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is not valid to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
    public static void main(String[] args) {
        ThrowKeyword obj = new ThrowKeyword();
        obj.checkAge(15);
    }
}
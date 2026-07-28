package corejava;

// Java program demonstrating all major operators
public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // 2. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int x = 10;
        System.out.println("x = " + x);
        x += 5; // x = x + 5
        System.out.println("x += 5 → " + x);
        x -= 3; // x = x - 3
        System.out.println("x -= 3 → " + x);
        x *= 2; // x = x * 2
        System.out.println("x *= 2 → " + x);
        x /= 4; // x = x / 4
        System.out.println("x /= 4 → " + x);
        x %= 3; // x = x % 3
        System.out.println("x %= 3 → " + x);

        // 3. Comparison (Relational) Operators
        System.out.println("\n=== Comparison Operators ===");
        System.out.println("a == b → " + (a == b));
        System.out.println("a != b → " + (a != b));
        System.out.println("a > b  → " + (a > b));
        System.out.println("a < b  → " + (a < b));
        System.out.println("a >= b → " + (a >= b));
        System.out.println("a <= b → " + (a <= b));

        // 4. Logical Operators
        boolean p = true, q = false;
        System.out.println("\n=== Logical Operators ===");
        System.out.println("p && q → " + (p && q)); // AND
        System.out.println("p || q → " + (p || q)); // OR
        System.out.println("!p     → " + (!p));     // NOT

        // 5. Bitwise Operators
        int m = 6, n = 3; // 6 = 110, 3 = 011 in binary
        System.out.println("\n=== Bitwise Operators ===");
        System.out.println("m & n  → " + (m & n));  // AND
        System.out.println("m | n  → " + (m | n));  // OR
        System.out.println("m ^ n  → " + (m ^ n));  // XOR
        System.out.println("~m     → " + (~m));     // NOT
        System.out.println("m << 1 → " + (m << 1)); // Left shift
        System.out.println("m >> 1 → " + (m >> 1)); // Right shift
        System.out.println("m >>> 1 → " + (m >>> 1)); // Unsigned right shift

        // 6. Unary Operators
        int y = 5;
        System.out.println("\n=== Unary Operators ===");
        System.out.println("y++ → " + (y++)); // Post-increment
        System.out.println("After y++: " + y);
        System.out.println("++y → " + (++y)); // Pre-increment
        System.out.println("y-- → " + (y--)); // Post-decrement
        System.out.println("After y--: " + y);
        System.out.println("--y → " + (--y)); // Pre-decrement

        // 7. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = " + max);

        // 8. instanceof Operator
        System.out.println("\n=== instanceof Operator ===");
        String str = "Hello";
        System.out.println("str instanceof String → " + (str instanceof String));
    }
}


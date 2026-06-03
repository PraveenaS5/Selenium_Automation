class Calculator {

    // Method with 2 integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Calling method with 2 integers
        System.out.println("Sum of 2 numbers: " + calc.add(10, 20));

        // Calling method with 3 integers
        System.out.println("Sum of 3 numbers: " + calc.add(10, 20, 30));
    }
}
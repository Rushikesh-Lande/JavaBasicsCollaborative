class ExceptionPropagation {
    void method1() {
        int result = 10 / 0;  // ArithmeticException occurs here
    }
 
    void method2() {
        method1();  // Exception propagates to this method
    }
 
    void method3() {
        try {
            method2();  // Exception propagates here
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }
 
    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.method3(); // method3 handles the exception
    }
}
 
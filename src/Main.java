public class Main {
    public static void main(String[] args) {
        ComplexOperations operations = new ComplexOperations();
        ComplexTrigonometry trigonometry = new ComplexTrigonometry();
        ComplexNum numOne = new ComplexNum(-12, -10);
        ComplexNum numTwo = new ComplexNum(12, 3);
        System.out.println(numOne);
        System.out.println(numTwo);
        double result = trigonometry.trigonometryForm(numOne);
        System.out.println(result);
        ComplexNum numSum = operations.sum(numOne, numTwo);
        System.out.println(numSum);

    }
}

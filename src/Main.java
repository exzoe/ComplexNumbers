
public class Main {
    public static void main(String[] args) throws Exception {
        ComplexNum numOne = new ComplexNum(-12, -10);
        ComplexNum numTwo = new ComplexNum(12, 3);
        System.out.println(numOne);
        System.out.println(numTwo);

        ComplexNum sum = numOne.sum(numTwo);
        System.out.println(sum);

        double result = numOne.trigonometryForm();
        System.out.println(result);

    }
}

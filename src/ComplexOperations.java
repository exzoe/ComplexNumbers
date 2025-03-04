public class ComplexOperations {

    public ComplexNum sum(ComplexNum num1, ComplexNum num2){
        return new ComplexNum(num1.getX()+num2.getX(), num1.getY()+num2.getY());
    }

    public ComplexNum difference(ComplexNum num1, ComplexNum num2){
        return new ComplexNum(num1.getX()-num2.getX(), num1.getY()-num2.getY());
    }

    public ComplexNum increase(ComplexNum num1, ComplexNum num2){
        return new ComplexNum(num1.getX()*num2.getX(), num1.getY()*num2.getY());
    }

    public ComplexNum division(ComplexNum num1, ComplexNum num2){
        return new ComplexNum(num1.getX()/num2.getX(), num1.getY()/num2.getY());
    }
}

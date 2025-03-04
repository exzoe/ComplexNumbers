public class ComplexNum {
    private final double x;
    private final double y;

    public ComplexNum(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }

    @Override
    public String toString(){
        return "Это комплексное число. Действительная часть = " + x + ", Мнимая = " + y + "i";
    }

    public double abs(){
        return Math.sqrt(x * x + y * y);
    }
    public double argueNum() throws Exception{
        if(abs() == 0){
            throw new IllegalArgumentException("Модуль равен нулю!");
        }
        else{
            return Math.acos(x / abs());
            //return Math.asin(y / abs());
        }
    }
}


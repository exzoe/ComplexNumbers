public class ComplexNum {
    private final double re;
    private final double im;

    public ComplexNum(double x, double y){
        this.re = x;
        this.im = y;
    }

    public double getX() {
        return re;
    }

    public double getY(){
        return im;
    }

    @Override
    public String toString(){
        return "Это комплексное число. Действительная часть = " + getX() + ", Мнимая = " + im + "i";
    }

    public double abs(){
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    public double argueNum() throws Exception{
        if(abs() == 0){
            throw new IllegalArgumentException("Модуль равен нулю!");
        }
        else{
            return Math.acos(getX() / abs());
            //return Math.asin(getY() / abs());
        }
    }
}


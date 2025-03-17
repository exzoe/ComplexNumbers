public class ComplexNum {
    private final double re;
    private final double im;

    public ComplexNum(double re, double im){
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm(){
        return im;
    }

    @Override
    public String toString(){
        return "Это комплексное число. Действительная часть = " + getRe() + ", Мнимая = " + getIm() + "i";
    }

    public double abs(){
        return Math.sqrt(getRe() * getRe() + getIm() * getIm());
    }

    public double argueNum() throws Exception{
        if(abs() == 0){
            throw new IllegalArgumentException("Модуль равен нулю!");
        }
        else{
            return Math.acos(getRe() / abs());
            //return Math.asin(getIm() / abs());
        }
    }

    public ComplexNum sum(ComplexNum num){
        return new ComplexNum(num.getRe() + getRe(), num.getIm() + getIm());
    }

    public ComplexNum difference(ComplexNum num){
        return new ComplexNum(num.getRe() - getRe(), num.getIm() - getIm());
    }

    public ComplexNum increase(ComplexNum num){
        return new ComplexNum((num.getRe() * getRe() - num.getIm() * getIm()), (getIm() * num.getRe() + getRe() * num.getIm()));
    }

    public ComplexNum division(ComplexNum num){
        return new ComplexNum((getRe() * num.getRe() + getIm() * num.getIm()) / Math.pow(num.getIm(), 2) + Math.pow(num.getRe(), 2), (getIm() * num.getRe() - getRe() * num.getIm()) / Math.pow(num.getRe(), 2) + Math.pow(num.getIm() , 2));
    }

    public double trigonometryArgue() {
        if(getRe() > 0 && getIm() > 0){
            return Math.atan(getRe() / getIm());
        }
        else if(getRe() < 0 && getIm() > 0){
            return Math.PI - Math.atan(getIm() / Math.abs(getRe()));
        }
        else if(getRe() < 0 && getIm() < 0){
            return -1 * Math.PI + Math.atan(getIm() / getRe());
        }
        else if(getRe() > 0 && getIm() < 0){
            return -1 * Math.atan(Math.abs(getIm()/getRe()));
        }
        else{
            throw new IllegalArgumentException("Действительная или мнимая часть числа равна нулю!");
        }
    }

    public double trigonometryForm(){
        return abs() * (Math.cos(trigonometryArgue()) + Math.sin(trigonometryArgue()));
    }
}


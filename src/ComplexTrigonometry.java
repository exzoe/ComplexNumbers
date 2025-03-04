public class ComplexTrigonometry {
    public double trigonometryArgue(ComplexNum num) {
        if(num.getX() > 0 && num.getY() > 0){
            return Math.atan(num.getX() / num.getY());
        }
        else if(num.getX() < 0 && num.getY() > 0){
            return Math.PI - Math.atan(num.getY() / Math.abs(num.getX()));
        }
        else if(num.getX() < 0 && num.getY() < 0){
            return -1 * Math.PI + Math.atan(num.getY() / num.getX());
        }
        else if(num.getX() > 0 && num.getY() < 0){
            return -1 * Math.atan(Math.abs(num.getY()/num.getX()));
        }
        else{
            throw new IllegalArgumentException("Действительная или мнимая часть числа равна нулю!");
        }
    }

    public double trigonometryForm(ComplexNum num){
        return num.abs() * (Math.cos(trigonometryArgue(num)) + Math.sin(trigonometryArgue(num)));
    }
}

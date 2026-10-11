package lista1q3;

public class GeometryCalculator {
    
    // radius, base, height, side1, 2,3 , double... sides
    private int precision;
    private double factor;

    private GeometryCalculator(){
        this(2);
    }   
    private GeometryCalculator(int precision){
        this.precision = precision;
    }

    private double toPrecision(double value){
        return Math.round(value * factor) / factor;
    }

    public void setPrecision(int precision){
        this.precision = precision;
        this.factor = Math.pow(10, precision);
    }

    public double calculateArea(double radius){
        return toPrecision(Math.PI*radius*radius);
    }
    public double calculateArea(double base, double height){
        return toPrecision(base*height);
    }
    public double calculateArea(double side1,double side2,double side3){
        double p = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return toPrecision(area);
    }



}

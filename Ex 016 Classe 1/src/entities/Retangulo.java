package entities;

public class Retangulo {
    public double width, height;

    public double Area(){
        return height*width;
    }

    public double Perimeter(){
        return 2*height+2*width;
    }

    public double Diagnal(){
        return Math.sqrt(Math.pow(height,2)+Math.pow(width, 2));
    }

}



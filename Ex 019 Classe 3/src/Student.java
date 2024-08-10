public class Student {

    public String name;
    public double first;
    public double second;
    public double third;

    public double FinalGrade() {
        return first + second + third;

    }

    public double MissingPoints(){
        if (FinalGrade()<60.0) {
            return 60.0 - FinalGrade();
        }
        else{
            return 0.0;
        }


    }


}


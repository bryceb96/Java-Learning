public class Triangle {
    //static variables
    static int numOfSides = 3;

    //non static variables
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    //default constructor for Triangle class
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height =height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;

    }

    //function
    public double findArea() {
        return (this.base * this.height) / 2;
        //accesses the this keyword because function is inside Triangle class
    }
}

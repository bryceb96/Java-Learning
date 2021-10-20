public class Main {
    public static void main(String [] args) {
        Triangle triangleA = new Triangle(15,8,15,8,7);
        Triangle triangleB = new Triangle(20,20,3,3,3);

        double triangleAArea = triangleA.findArea();
        double triangleBArea = triangleB.findArea();

        System.out.println(triangleAArea);
        System.out.println(triangleBArea);

        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleB.base);

        triangleA.sideLenThree = 9;
        System.out.println(triangleA.sideLenThree);

        System.out.println(Triangle.numOfSides);

    }
}

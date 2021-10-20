public class StudentProfile {
    //attributes
    String firstName;
    String lastName;
    int yearToGraduate;
    double GPA;
    String declaredMajor;

    //default constructor for Student Profile
    public StudentProfile(String firstName, String lastName, int yearToGraduate, double GPA, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearToGraduate = yearToGraduate;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    //function to increment student's grad year by 1

    public int incrementGradYear() {
        this.yearToGraduate ++;
        return this.yearToGraduate;
    }


}

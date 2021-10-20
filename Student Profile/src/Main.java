public class Main {
    public static void main(String [] args) {
        StudentProfile studentA = new StudentProfile("Bryce", "Benjamin", 2022, 4.0, "Cybersecurity");
        StudentProfile studentB =  new StudentProfile("Chase", "Pasciuto", 2022, 3.0, "Arts");

       int newGradYearA = studentA.incrementGradYear();
       int newGradYearB = studentB.incrementGradYear();

       System.out.println(newGradYearA);
       System.out.println(newGradYearB);

    }
}

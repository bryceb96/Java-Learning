//Input 1: # of hours the employee works per week
//Input 2: # of money employee makes per hour
//Output: employee's gross yearly salary
//Bonys: input that accounts for vacation days

import java.util.Scanner;

public class SalaryCalculator {
    public static int calculateEmployeeHours() {
        Scanner input = new Scanner(System.in);

        int hoursWorked = Integer.parseInt(input.next());
        if(hoursWorked < 0) {
            return 0;
        }
        return  hoursWorked;
    }

    public static double calculateEmployeeMoneyPerHour () {
        //call calculateEmployeeHours here
        Scanner input = new Scanner(System.in);

        double salaryPerHour = Double.parseDouble(input.next());
        if (salaryPerHour < 0) {
            return 0;
        }
        return salaryPerHour;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newline = System.getProperty("line.separator");
        //calculate employeeHours
        System.out.println("How many hours a week do you work?");
        int employeeHours = calculateEmployeeHours();
        System.out.println("Employee hours are: " + newline + employeeHours);
        //calculate employeeSalary
        System.out.println("How much do you get paid per hour?");
        double employeeSalary = calculateEmployeeMoneyPerHour();
        double employeeSalaryPerWeek = employeeHours * employeeSalary;
        System.out.println("Employee salary per hour is: " + newline + employeeSalary);
        //calculate employeeVacationDays
        double employeeVacationDays = employeeHours / 8;

        //multiply the return of calculateEmployeeMoneyPer Hour * 12 to get yearly gross salary
        double unpaidTime = employeeVacationDays * employeeSalary;

        System.out.println("Employee  vacation days are: " + newline + employeeVacationDays);
        System.out.println("Employee  unpaid time is are: " + newline + unpaidTime);

        double employeeGrossYearlySalary = (employeeSalaryPerWeek * 52) - unpaidTime;


        System.out.println("Employee gross yearly salary is: " + newline + employeeGrossYearlySalary);
    }


}


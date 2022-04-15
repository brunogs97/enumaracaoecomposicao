package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.Worker;
import entities_enums.WorkerLevel;
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = input.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = input.nextLine();
        System.out.print("Level: ");
        String workerLevel = input.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = input.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerName), baseSalary, new Departament(departmentName));
    }
}

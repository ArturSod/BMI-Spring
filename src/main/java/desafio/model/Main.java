package desafio.model;

import desafio.logic.CalcAge;
import desafio.logic.CalcBMI;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter birth date (YYYY-MM-DD): ");
        String birthDateStr = scanner.next();
        LocalDate birthDate = LocalDate.parse(birthDateStr);

        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
        String genderStr = scanner.next();
        Gender gender = Gender.valueOf(genderStr.toUpperCase());

        BMI bmi = new BMI();

        PersonOutput person = new PersonOutput(name, height, birthDate, weight, gender);

        CalcAge calcAge = new CalcAge();
        int age = calcAge.calculateAge(person.getBirthDate());
        person.setAge(age);

        CalcBMI calcBMI = new CalcBMI();
        double BMIValue = calcBMI.calculateBMI(person.getWeight(), person.getHeight());
        String BMIDescription = calcBMI.getBMIDescription(BMIValue);

        bmi.setValue(BMIValue);
        bmi.setDescription(BMIDescription);

        person.setBMI(bmi);

        System.out.println(person);
        System.out.println("BMI value: " + person.getBMI().getDescription());

        scanner.close();
    }
}

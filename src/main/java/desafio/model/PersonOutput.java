package desafio.model;

import java.time.LocalDate;

public class PersonOutput extends Person{

    public PersonOutput(String name, double height, LocalDate birthDate, double weight, Gender gender) {
        super(name, height, birthDate, weight, gender);
    }

    private int age;
    private BMI bmi;

    public BMI getBMI() {
        return bmi;
    }

    public void setBMI(BMI bmi) {
        this.bmi = bmi;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sbPersonOutput = new StringBuilder();
        sbPersonOutput.append("Name: ").append(super.getName())
                .append("\nHeight: ").append(super.getHeight())
                .append("\nBirthdate: ").append(super.getBirthDate())
                .append("\nWeight: ").append(super.getWeight())
                .append("\nGender: ").append(super.getGender())
                .append("\nAge: ").append(this.age)
                .append("\nBMI: ").append(this.bmi.getValue());

        return sbPersonOutput.toString();
    }
}

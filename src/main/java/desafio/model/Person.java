package desafio.model;

import java.time.LocalDate;

public class Person {
    private String name;
    private double height;
    private LocalDate birthDate;
    private double weight;
    private Gender gender;

    public Person(String name, double height, LocalDate birthDate, double weight, Gender gender) {
        this.name = name;
        this.height = height;
        this.birthDate = birthDate;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder sbPerson = new StringBuilder();
        sbPerson.append("Name: ").append(name)
                .append("\nHeight: ").append(height)
                .append("\nBirthdate: ").append(birthDate)
                .append("\nWeight: ").append(weight)
                .append("\nGender: ").append(gender);

        return sbPerson.toString();
    }
}
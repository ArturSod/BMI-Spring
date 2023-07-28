package desafio.logic;

import desafio.model.BMIDesc;

public class CalcBMI {
    public double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    public String getBMIDescription(double bmi) {

        switch (getBMIDesc(bmi)) {
            case UNDERWEIGHT:
            default: {
                return "Underweight: BMI less than 18.5";
            }
            case NORMAL_WEIGHT: {
                return "Normal weight: BMI between 18.5 and 24.9";
            }
            case OVERWEIGHT: {
                return "Overweight: BMI between 25.0 and 29.9";
            }
            case OBESITY_I: {
                return "Obesity grade I: BMI between 30.0 and 34.9";
            }
            case OBESITY_II: {
                return "Obesity grade II: BMI between 35.0 and 39.9";
            }
            case OBESITY_III: {
                return "Obesity grade III (morbid obesity): BMI equal to or greater than 40.0";
            }
        }
    }
    private boolean checkBMI(double bmi, double min, double max) {
        return (bmi >= min && bmi < max);
    }
    public BMIDesc getBMIDesc(double bmi) {
        BMIDesc[] bmiDescArray = BMIDesc.values();
        for (int i = 0; i < bmiDescArray.length; i++) {
            if (checkBMI(bmi, bmiDescArray[i].getMin(), bmiDescArray[i].getMax())) {
                return  bmiDescArray[i];
            }
        }
        return BMIDesc.UNDERWEIGHT;
    }
}
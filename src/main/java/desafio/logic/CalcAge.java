package desafio.logic;

import java.time.LocalDate;
import java.time.Period;

public class CalcAge {
    public int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }
}








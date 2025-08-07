package spring.challenge.loan.utils;

import spring.challenge.loan.domain.Location;

import java.math.BigDecimal;

public class LoanRulesUtils {
    public static boolean isValueEqualOrLessThan(double value, double max){
        return value <= max;
    }

    public static boolean isValueEqualOrLessThan(BigDecimal value, double max){
        return value.doubleValue() <= max;
    }

    public static boolean isValueLessThan(double value, double max){
        return value < max;
    }

    public static boolean isValueLessThan(BigDecimal value, double max){
        return value.doubleValue() < max;
    }

    public static boolean isValueEqualOrGreaterThan(double value, double min){
        return value >= min;
    }

    public static boolean isValueEqualOrGreaterThan(BigDecimal value, double min){
        return value.doubleValue() >= min;
    }

    public static boolean isValueBetween(int value, double min, double max){
        return value >= min && value <= max;
    }

    public static boolean isValueBetween(BigDecimal value, double min, double max){
        return value.doubleValue() >= min && value.doubleValue() <= max;
    }

    public static boolean isFrom(Location locationInput, Location locationDesired){
        return locationInput.equals(locationDesired);
    }
}

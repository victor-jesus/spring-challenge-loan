package spring.challenge.loan.utils;

import org.junit.jupiter.api.Test;
import spring.challenge.loan.domain.Location;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class LoanRulesUtilsTest {

    @Test
    void shouldReturnTrueWhenValueIsLessThanLimit() {
        BigDecimal income = new BigDecimal("2000.0");
        double limit = 3000.0;

        assertTrue(LoanRulesUtils.isValueLessThan(income, limit));
    }

    @Test
    void shouldReturnFalseWhenValueIsEqualOrGreaterThanLimit() {
        BigDecimal income = new BigDecimal("5000.0");
        double limit = 3000.0;

        assertFalse(LoanRulesUtils.isValueLessThan(income, limit));
    }

    @Test
    void shouldReturnTrueWhenValueIsEqualOrLessThanLimit(){
        BigDecimal income = new BigDecimal("2000.0");
        double limit = 3000.0;

        assertTrue(LoanRulesUtils.isValueEqualOrLessThan(income, limit));
    }

    @Test
    void shouldReturnTrueWhenValueIsEqualThanLimit(){
        BigDecimal income = new BigDecimal("2000.0");
        double limit = 3000.0;

        assertTrue(LoanRulesUtils.isValueEqualOrLessThan(income, limit));
    }

    @Test
    void shouldReturnFalseWhenValueIsGreaterThanLimit(){
        BigDecimal income = new BigDecimal("5000.0");
        double limit = 3000.0;

        assertFalse(LoanRulesUtils.isValueEqualOrLessThan(income, limit));
    }

    @Test
    void shouldReturnTrueWhenValueIsGreaterThanLimit(){
        BigDecimal income = new BigDecimal("5000.0");
        double limit = 3000.0;

        assertTrue(LoanRulesUtils.isValueEqualOrGreaterThan(income, limit));
    }

    @Test
    void shouldReturnTrueWhenValueIsEqualOrGreaterThanLimit(){
        BigDecimal income = new BigDecimal("3000.0");
        double limit = 3000.0;

        assertTrue(LoanRulesUtils.isValueEqualOrGreaterThan(income, limit));
    }

    @Test
    void shouldReturnFalseWhenValueIsLessThanMinLimit(){
        BigDecimal income = new BigDecimal("2000.0");
        double limit = 3000.0;

        assertFalse(LoanRulesUtils.isValueEqualOrGreaterThan(income, limit));
    }

    @Test
    void shouldReturnTrueWhenValueIsBetween(){
        BigDecimal income = new BigDecimal("4000.0");
        double min = 3000.0;
        double max = 5000.0;

        assertTrue(LoanRulesUtils.isValueBetween(income, min, max));
    }

    @Test
    void shouldReturnFalseWhenValueIsNotBetween(){
        BigDecimal income = new BigDecimal("2000.0");
        double min = 3000.0;
        double max = 5000.0;

        assertFalse(LoanRulesUtils.isValueBetween(income, min, max));
    }

    @Test
    void shouldReturnTrueWhenLocationsAreEquals(){
        Location sp = Location.SP;
        Location sp2 = Location.SP;

        assertTrue(LoanRulesUtils.isFrom(sp, sp2));
    }

    @Test
    void shouldReturnFalseWhenLocationsAreNotEquals(){
        Location sp = Location.SP;
        Location rj = Location.RJ;

        assertFalse(LoanRulesUtils.isFrom(sp, rj));
    }
}
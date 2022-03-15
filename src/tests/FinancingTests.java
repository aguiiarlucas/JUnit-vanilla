package tests;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {


    //<AÇÃO> should <EFEITO> [when <CENÁRIO>]
    // first :  arrange ,  action and  assert

    @Test
    public void constructorShouldCreatedObjectWhenValidateData() {
        //action
        Financing f1 = new Financing(100000.00, 2000.00, 80);
        Assertions.assertEquals(100000.00, f1.getTotalAmount());
        Assertions.assertEquals(2000.00, f1.getIncome());
        Assertions.assertEquals(80, f1.getMonths());

    }

    @Test
    public void constructorShouldIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f2 = new Financing(100000.00, 2000.00, 20);

        });

    }

    @Test
    public void setTotalAmountShouldSetUpdateWhenValidadDate() {
        Financing f = new Financing(100000.00, 2000.00, 80);

        f.setTotalAmount(90000.00);
        Assertions.assertEquals(90000.00, f.getTotalAmount());

    }

    @Test
    public void setTotalAmountShouldIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.00, 2000.00, 20);
            f.setTotalAmount(110000.00);
        });

    }

    @Test
    public void setIncomeShouldSetUpdateWhenValidadDate() {
        Financing f = new Financing(100000.00, 2000.00, 80);

        f.setIncome(2100.00);
        Assertions.assertEquals(2100.00, f.getIncome());
    }

    @Test
    public void setIncomeShouldIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.00, 2000.00, 80);
            f.setIncome(1900.00);
        });


    }
    @Test
    public void setMonthShouldSetUpdateWhenValidadDate() {
        Financing f = new Financing(100000.00, 2000.00, 80);

        f.setMonths(90);
        Assertions.assertEquals(90, f.getMonths());
    }
    @Test
    public void setMonthShouldIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.00, 2000.00, 80);
            f.setMonths(79);
        });
    }
    @Test
    public void entryShouldCalculateEntryCorrectly() {
        Financing f = new Financing(100000.00, 2000.00, 80);
        Assertions.assertEquals(20000.00, f.entry());
    }

    @Test
    public void quotaShouldCalculateQuoteCorrectly() {

        Financing f = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(1000.00, f.quota());
    }

    }


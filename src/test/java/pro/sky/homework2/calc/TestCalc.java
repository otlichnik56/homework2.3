package pro.sky.homework2.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//aaa

public class TestCalc {
    private int num11;
    private int num22;

    @BeforeEach
    public void setUp() {
        num11 = 1;
        num22 = 5;
    }

    @Test
    public String plusCalc(int num1, int num2) {
        return plusCalc(num1, num2);
    }

    @Test
    public String minusCalc(int num1, int num2) {
        return minusCalc(num1, num2);
    }

    @Test
    public String multiplyCalc(int num1, int num2) {
        return multiplyCalc(num1, num2);
    }

    @Test
    public String divideCalc(double num1, double num2) {
        return divideCalc(num1, num2);
    }

}

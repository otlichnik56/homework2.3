package pro.sky.homework2.calc;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public String helloCalc() {
        return " Добро пожаловать в калькулятор ";
    }

    public String plusCalc(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minusCalc(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiplyCalc(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divideCalc(double num1, double num2) {
        if (num2 == 0){
        throw new IllegalArgumentException("Ачибка, на нол дэлить низя! Ваще низя!");
        } else {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
    }

}

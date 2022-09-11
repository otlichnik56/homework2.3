package pro.sky.homework2.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//aaaaaaaaaaaaa
@RestController

public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService){
        this.calcService = calcService;
    }

    @GetMapping(path = "/calculator")
    public String helloCalc() {
        return calcService.helloCalc();
    }
    @GetMapping(path = "/calculator/plus")
    public String plusCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
            return calcService.plusCalc(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minusCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.minusCalc(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.multiplyCalc(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divideCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.divideCalc(num1, num2);
    }
}

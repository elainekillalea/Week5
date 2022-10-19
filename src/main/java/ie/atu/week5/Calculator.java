package ie.atu.week5;

public class Calculator {
    private int xNum, yNum, sum;

    public Calculator(){
        xNum = 2;
        yNum = 3;
    }

    public int add(){
        sum = xNum + yNum;
        return sum;
    }

}

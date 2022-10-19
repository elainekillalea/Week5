package ie.atu.week5;

public class Calculator {
    private int xNum, yNum, sum;

    public Calculator(){
        xNum = 4;
        yNum = 2;
    }

    public int add(){
        sum = xNum + yNum;
        return sum;
    }

    public int sub(){
        sum = xNum - yNum;
        return sum;
    }

    public int mult(){
        sum = xNum * yNum;
        return sum;
    }

    public int div(){
        sum = xNum / yNum;
        return sum;
    }

}

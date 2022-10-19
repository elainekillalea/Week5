package ie.atu.week5;

public class Calculator {
    private int sum;

    public Calculator(){
        sum = 0;
    }

    public int add(int xNum, int yNum){
        sum = xNum + yNum;
        return sum;
    }

    public int sub(int xNum, int yNum){
        sum = xNum - yNum;
        return sum;
    }

    public int mult(int xNum, int yNum){
        sum = xNum * yNum;
        return sum;
    }

    public int div(int xNum, int yNum){
        sum = xNum / yNum;
        return sum;
    }

}

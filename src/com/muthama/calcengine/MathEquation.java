package com.muthama.calcengine;

public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public double getResult() {return result;}

    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    public void execute(int leftVal, int rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
        result = (int) result;
    }

    public void execute () {
        switch(opCode){
            case 'a':
                result = leftVal + rightVal;
                break;

            case 's':
                result = leftVal - rightVal;
                break;

            case 'm':
                result = leftVal * rightVal;
                break;

            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;

            default:
                System.out.println("Error - invalid opcode");
                result = 0.0d;
                break;
        }
    }
}

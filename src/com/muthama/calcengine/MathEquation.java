package com.muthama.calcengine;

public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}

    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}

    public double opCode() {return opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}

    public double getResult() {return result;}

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
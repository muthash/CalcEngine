package com.muthama.calcengine;

public class Main {

    public static void main(String[] args) {
        double[] leftVals = {100.0d, 225.0d, 25.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] result = new double[opCodes.length];

       for (int i = 0; i < opCodes.length; i++){
           if(opCodes[i] =='a')
               result[i] = leftVals[i] + rightVals[i];

           else if(opCodes[i] =='s')
               result[i] = leftVals[i] - rightVals[i];

           else if(opCodes[i] =='m')
               result[i] = leftVals[i] * rightVals[i];

           else if(opCodes[i] =='d')
               result[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
           
           else {
               System.out.println("Error - invalid opcode");
               result[i] = 0.0d;
           }

       }
       for (double theResult : result) {
           System.out.print("result = ");
           System.out.println(theResult);
       }

    }
}

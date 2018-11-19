package com.muthama.calcengine;

public class Main {

    public static void main(String[] args) {
        double[] leftVals = {100.0d, 225.0d, 25.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] result = new double[opCodes.length];

       for(int i = 0; i < opCodes.length; i++){
           switch(opCodes[i]){
               case 'a':
                   result[i] = leftVals[i] + rightVals[i];
                   break;

               case 's':
                   result[i] = leftVals[i] - rightVals[i];
                   break;

               case 'm':
                   result[i] = leftVals[i] * rightVals[i];
                   break;

               case 'd':
                   result[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
                   break;

               default:
                   System.out.println("Error - invalid opcode");
                   result[i] = 0.0d;
                   break;
           }
       }

       for (double theResult : result) {
           System.out.print("result = ");
           System.out.println(theResult);
       }

    }
}

package com.muthama.myapp;

import com.muthama.calcengine.Adder;
import com.muthama.calcengine.CalculateBase;
import com.muthama.calcengine.CalculateHelper;
import com.muthama.calcengine.Divider;
import com.muthama.calcengine.InvalidStatementException;
import com.muthama.calcengine.MathEquation;
import com.muthama.calcengine.Multiplier;
import com.muthama.calcengine.Subtractor;

public class Main {

    public static void main(String[] args) {
        String[] statements = {
                "add 1.0",
                "add xx 25.0",
                "addX 0.0 0.0",
                "divide 100.0 50.0",
                "add 100.0 50.0",
                "multiply 100.0 50.0",
                "subtract 100.0 50.0"
        };

        CalculateHelper helper = new CalculateHelper();
        for(String statement: statements){
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null)
                    System.out.println(" Original exception: " + e.getCause().getMessage());
            }
        }


        MathEquation[] equations = new MathEquation[4];

        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 15.0d, 23.0d);

        for (MathEquation equation : equations) {
           equation.execute();
           System.out.print("result = ");
           System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overloading");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightDouble);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.print("integer result = ");
        System.out.println(equationOverload.getResult());

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(100.0d, 50.0d),
                new Multiplier(100.0d, 50.0d),
                new Subtractor(100.0d, 50.0d)
        };

        for (CalculateBase calculator: calculators) {
            calculator.calculate();
            System.out.print("result = ");
            System.out.println(calculator.getResult());
        }

    }
}

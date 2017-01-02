package com.company.classes;

public class Main {

    public static void main(String[] args) {
        // rewritten using arrays instead of single values

        MathsEquation[] equations = new MathsEquation[4];
        equations[0] = new MathsEquation('d' ,200.0, 50.0);
        equations[1] =  new MathsEquation('a', 3.0, 20.0 );
        equations[2] =  new MathsEquation('s', 12.0, 530.0 );
        equations[3] =  new MathsEquation('m', 10.0, 50.0);



        // output results
        for (MathsEquation equation : equations){
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }


        System.out.println("");
        System.out.println("Using overloads -----------------------------");
        System.out.println("");


        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        int leftInt = 9;
        int rightInt  = 4;

        MathsEquation equationOverload = new MathsEquation('d');

        System.out.println("call with doubles....");
        equationOverload.execute(leftDouble, rightDouble);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        // while this command may not look like much it is a widening conversion
        // a method that accepts double can accept int as all int values can be represented as doubles
        System.out.println("call with ints....");
        equationOverload.execute(leftInt, rightInt);

        System.out.print("result = ");
        System.out.println(equationOverload.getResult());


        System.out.println("Complete");

    }

//    public static MathsEquation create(double leftVal, double rightVal, char opCode){
//        MathsEquation equation = new MathsEquation();
//       equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }


}


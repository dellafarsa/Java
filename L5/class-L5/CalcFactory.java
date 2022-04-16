public class CalcFactory extends Calculate{

    CalcFactory(int num1, String op, int num2){
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;

    }

    public void getOperator(String operator){
        if(operator == null){
            System.out.println(0);
        }
        if(operator.equals("-")){
            CalcMinus calcMinus = new CalcMinus();
            System.out.println(calcMinus.calc(num1, num2));

        } else if(operator.equals("+")){
            new CalcPlus();
            System.out.println(CalcPlus.calc(num1,num2));
        }

    }

}

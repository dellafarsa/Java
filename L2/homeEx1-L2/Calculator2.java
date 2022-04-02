public class Calculator2 extends Calculator1{

    Calculator2(int num1, int num2) {
        super(num1, num2);
    }

    public void multiply(){
        result = num1 * num2;
        System.out.println("result: " + result);
    }
    public void divide(){
        result = num1 / num2;
        System.out.println("result: " + result);
    }

}

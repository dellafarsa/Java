public class Calculator1 {
    int num1;
    int num2;
    int result;

    Calculator1(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addIt(){
        result = num1 + num2;
        System.out.println("result: " + result);
    }

    public void subtract(){
        result = num1 - num2;
        System.out.println("result: " + result);
    }
}

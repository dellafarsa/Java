public class Integer implements MyInteger{
    int num;

    @Override
    public void isPositive(int num) {
        if (num >= 0)
            System.out.println("Yes.");
        else
            System.out.println("No.");
    }

    @Override
    public void isNegative(int num) {
        if (num >= 0)
            System.out.println("No.");
        else
            System.out.println("Yes.");
    }

    @Override
    public void isEven(int num) {
        if (num % 2 == 0)
            System.out.println("Yes.");
        else
            System.out.println("No.");
    }

    @Override
    public void isOdd(int num) {
        if (num % 2 == 0)
            System.out.println("No.");
        else
            System.out.println("Yes.");
    }

    @Override
    public void isZero(int num) {
        if (num == 0)
            System.out.println("Yes.");
        else
            System.out.println("No.");
    }
}

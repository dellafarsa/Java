public class Equation {
    int x;
    int y;
    int e;
    int f;
    int a = 2;
    int b = 3;
    int c = 2;
    int d = 2;

    Equation(int x, int y, int e, int f) {
        int x1 = (e * d - f * b) / (a * d - b * c);
        int y1 = (a * f - e * c) / (a * d - b * c);
        this.x = x;
        this.y = y;
        if (x != x1 || y != y1)
            System.out.println("The equation is unsolvable.");
        else{
            System.out.println("x = " + x );
            System.out.println("y = " + y );
            System.out.println("The equation solvable.");
        }
    }
}

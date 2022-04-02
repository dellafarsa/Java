public class Rectangle {

    int x;
    int y;
    int area;
    int circ;

    Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }

    void area(){
        area = x * y;
        System.out.print("area: " + area + "\n");
    }
    void circ(){
        circ = 2 * (x + y);
        System.out.print("circumference: " + circ);
    }

}

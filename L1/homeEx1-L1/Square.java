public class Square {
    int x;
    int area;
    int circ;

    Square(int x){
        this.x = x;
    }

    void area(){
        area = x * x;
        System.out.print("area: " + area + "\n");
    }
    void circ(){
        circ = 4 * x;
        System.out.print("circumference: " + circ);
    }

}

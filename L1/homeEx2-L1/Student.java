public class Student {

    int sum;
    Student(int sum){
        this.sum = sum;
    }

    void validation(){
        if (sum  >= 10)
            System.out.print("Passed.");
        else
            System.out.print("Not Passed.");
    }
}

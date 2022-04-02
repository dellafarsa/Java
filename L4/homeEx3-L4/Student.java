public class Student<T, V>{
    private T name, fname;
    private V num;

    public void setName(T name) {
        this.name = name;
    }

    public void setNum(V num) {
        this.num = num;
    }

    public void setFname(T fname) {
        this.fname = fname;
    }

    public T getName() {
        return name;
    }

    public V getNum() {
        return num;
    }

    public T getFname() {
        return fname;
    }
}


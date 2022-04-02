public class User<T, V> implements Cloneable{
    T username;
    V password;

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class Renault implements Car{
    @Override
    public boolean isSmart() {
        return false;
    }

    @Override
    public void price() {
        System.out.println("$15.580");
    }

    @Override
    public void fuel() {
        System.out.println("70 Lit");
    }
}

public class Kia implements Car{

    @Override
    public boolean isSmart() {
        return true;
    }

    @Override
    public void price() {
        System.out.println("$20.115");
    }

    @Override
    public void fuel() {
        System.out.println("100 Lit");
    }
}

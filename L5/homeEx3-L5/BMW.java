public class BMW implements Car{
    @Override
    public boolean isSmart() {
        return true;
    }

    @Override
    public void price() {
        System.out.println("$30.250");
    }

    @Override
    public void fuel() {
        System.out.println("110 Lit");
    }
}

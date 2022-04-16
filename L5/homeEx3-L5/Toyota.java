public class Toyota implements Car{
    @Override
    public boolean isSmart() {
        return true;
    }

    @Override
    public void price() {
        System.out.println("$26.650");
    }

    @Override
    public void fuel() {
        System.out.println("75 Lit");
    }
}


public class Physics2 extends Subjects{
    @Override
    public void prerequisites() {
        System.out.println("Prerequisite: Physics 1");
    }
    @Override
    public void inNeed() {
        System.out.println("Currently in need: Nothing.");
    }
    @Override
    public void units() {
        System.out.println("number of units = 3");
    }
}

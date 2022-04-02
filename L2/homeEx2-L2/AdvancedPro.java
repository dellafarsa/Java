public class AdvancedPro extends Subjects{
    @Override
    public void prerequisites() {
        System.out.println("Prerequisites: Basic Programming");
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

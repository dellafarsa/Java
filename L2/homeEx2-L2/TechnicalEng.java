public class TechnicalEng extends Subjects{
    @Override
    public void prerequisites() {
        System.out.println("Prerequisites: English");
    }
    @Override
    public void inNeed() {
        System.out.println("Currently in need: Nothing.");
    }
    @Override
    public void units() {
        System.out.println("number of units = 2");
    }
}

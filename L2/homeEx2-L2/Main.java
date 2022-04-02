import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose a subject: ");
        String subj = input.next();

        switch (subj){
            case "differential-equations":
                DifferentialEq dif = new DifferentialEq();
                dif.inNeed();
                dif.prerequisites();
                dif.units();
                break;
            case "physics2":
                Physics2 phy = new Physics2();
                phy.inNeed();
                phy.prerequisites();
                phy.units();
                break;
            case "discrete-mathematics":
                DiscreteMath dis = new DiscreteMath();
                dis.inNeed();
                dis.prerequisites();
                dis.units();
                break;
            case "technical-english":
                TechnicalEng tech = new TechnicalEng();
                tech.inNeed();
                tech.prerequisites();
                tech.units();
                break;
            case "advanced-programming":
                AdvancedPro ad = new AdvancedPro();
                ad.inNeed();
                ad.prerequisites();
                ad.units();
            default:
                System.out.println("Subject Unavailable.");
        }
    }
}

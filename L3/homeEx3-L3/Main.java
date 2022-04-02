import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sentence: ");
        String str = input.nextLine();
        //String sample = "krishna64";
        char[] chars = str.toCharArray();
        int sw = 0;
        for(char c : chars){
            if(Character.isDigit(c)){
                sw = 1;
                break;
            }
        }

        if (sw == 1){
            try {
                throw new NumberInStringException("Number in string");
            } catch (NumberInStringException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Length of sentence = "+ str.length());
        }



    }
}

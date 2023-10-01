import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String partyAffiliation;

        System.out.println("What is your affiliation? (use letters)");
        partyAffiliation = scan.nextLine();

        if (partyAffiliation.equalsIgnoreCase("D")) {
            System.out.println("You are a democratic donkey");
        } else if (partyAffiliation.equalsIgnoreCase("R")) {
            System.out.println("You are a republican elephant");
        } else if (partyAffiliation.equalsIgnoreCase("I")) {
            System.out.println("You are an Independent man");
        } else {
            System.out.println("nobody care L");
        }
    }
}
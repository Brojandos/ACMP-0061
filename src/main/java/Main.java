import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 22.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        int firstTeamScore = 0, secondTeamScore = 0;
        Scanner input = new Scanner(System.in);
        for (byte i = 0; i < 4; i++) {
            firstTeamScore += input.nextByte();
            secondTeamScore += input.nextByte();
        }
        if (firstTeamScore > secondTeamScore) System.out.println(1);
        else if (firstTeamScore == secondTeamScore) System.out.println("DRAW");
        else System.out.println(2);
    }
}

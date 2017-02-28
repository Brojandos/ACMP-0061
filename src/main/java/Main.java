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
        System.out.print(firstTeamScore == secondTeamScore ? "DRAW" : (firstTeamScore > secondTeamScore ? 1 : 2));
    }
}
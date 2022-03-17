import java.time.Duration;
import java.time.Instant;

public class FiniteAutomata {

    public static void main(String[] args) {
        //save current date-time in UTC
        Instant start = Instant.now();

        //initialise strings
        String fullText = "andtryskdh";
        String thePattern = "try";

        char[] tChar = fullText.toCharArray();
        char[] pChar = thePattern.toCharArray();
        findStringMatch(pChar, tChar);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    // function to get the next state
    static int getNextState(char[] p, int lenPattern, int state, int x) {
        if (state < lenPattern && x == p[state])
            return state + 1;
        int nextState, i;

        for (nextState = state; nextState > 0; nextState--) {
            if (p[nextState - 1] == x) {
                for (i = 0; i < nextState - 1; i++)
                    if (p[i] != p[state - nextState + 1 + i])
                        break;
                if (i == nextState - 1)
                    return nextState;
            }
        }
        return 0;
    }

    static void createFiniteAutomata(char[] p, int lenPattern, int faTable[][]) {
        int state, x;
        for (state = 0; state <= lenPattern; ++state)
            for (x = 0; x < 256; ++x)
                faTable[state][x] = getNextState(p, lenPattern, state, x);
    }

    static void findStringMatch(char[] p, char[] t) {
        int lenPattern = p.length;
        int lenText = t.length;

        int[][] faTable = new int[lenPattern+1][256];

        createFiniteAutomata(p, lenPattern, faTable);

        // Process text over faTable
        int i, state=0;
        for (i = 0; i < lenText; i++) {
            state = faTable[state][t[i]];
            if (state == lenPattern)
                System.out.println("Substring found at index " + (i-lenPattern+1) + ".");
        }
    }
}

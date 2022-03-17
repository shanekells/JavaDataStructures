import java.time.Duration;
import java.time.Instant;

//Searches for the first character of the pattern

public class NaiveStringMatching {
    public static void main(String[] args) {

        //save current date-time in UTC
        Instant start = Instant.now();

        //initialise strings
        String fullText = "andtryskdh";
        String thePattern = "try";

        char[] aText = fullText.toCharArray();
        char[] aPattern = thePattern.toCharArray();

        int lenText = aText.length;
        int lenPattern = aPattern.length;

        for (int i = 0; i < lenText; i++) {
            int matchCount = 0;

            for (int j = 0; j < lenPattern; j++) {
                if(aPattern[j] != aText[i+j]){
                    break; //no match
                }
                matchCount++;
            }
            if (matchCount == lenPattern){
                System.out.println("Pattern found at " + (i+1) + " position " + (i+1) + " (shift = " + i+ ").");
            }
        }

        //save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}

import java.util.*;

public class MatchJavaIdentifier {

    private static final String STOP = "STOP";
    private static final String VALID = "Valid Java identifier";
    private static final String INVALID = "Not a valid Java identifier";
    private static final String VALID_IDENTIFIER_PATTERN = "[a-zA-Z][a-zA-Z0-9_$]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str, reply;

        while (true) {
            System.out.println("Identifier: ");
            str = scanner.next();

            if (str.equals(STOP))
                break;
            if (str.matches(VALID_IDENTIFIER_PATTERN)) {
                reply = VALID;
            } else {
                reply = INVALID;
            }
            System.out.println(str + ": " + reply + "\n");
        }
        scanner.close();
    }
}
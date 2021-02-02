public class RandomCharacter {
    // generate a random char btw ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    // generate random uppercase letter
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    // generate random lowercase letter
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    // generate random digit char
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    // generate a random char
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
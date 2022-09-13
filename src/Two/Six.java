package Two;

public class Six {
    public static void main(String[] args) {
        String string = "who am i";
        System.out.println(swapWordsInLine(string,0,2));
    }

    private static String swapWordsInLine(String string, int index1, int index2) {
        String[] words = string.split(" ");
        String tmp = words[index1];
        words[index1] = words[index2];
        words[index2] = tmp;
        return String.join(" ", words);
    }
}

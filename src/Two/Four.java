package Two;

public class Four {
    public static void main(String[] args) {
        String string = "Now is the winter of our discontent\n Made glorious summer by this sun of York;";
        System.out.println(reverseLine(string));
    }
    private static String reverseLine(String input){
        String []inputArray = input.split(" ");
        String resultString = new String();
        for(int i = inputArray.length-1; i >= 0; --i){
            resultString += inputArray[i] + " ";
        }
        return resultString;
    }
}

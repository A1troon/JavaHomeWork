package Two;

public class Five {
    public static void main(String[] args) {
        String string = "who am i";
        System.out.println(averageWords(string));
    }
    public static String averageWords(String input){
        String [] inputArray = input.split(" ");
        int averageLen = sumArray(inputArray)/inputArray.length;
        String resultString = new String();
        for(int i = 0; i < inputArray.length; ++i){
            if(inputArray[i].length() == averageLen) resultString += inputArray[i] + " ";
        }
        return resultString;
    }
    public static  int sumArray(String[] array){
        int result = 0;
        for(int i = 0; i < array.length; ++i){
            result += array[i].length();
        }
        return result;
    }
}

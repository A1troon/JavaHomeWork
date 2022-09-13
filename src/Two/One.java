package Two;

public class One {
    public static void main(String[] args) {
        int[][] vertex = new int[][] {{3,4}, {5,11}, {12,8}, {9,5}, {5,6}};
        System.out.println(formulaShoelace(vertex));
    }
    private static double formulaShoelace(int[][] vertex){
        int sum = vertex[vertex.length-1][0]*vertex[0][1]-vertex[0][0]*vertex[vertex.length-1][1];
        for(int i = 0; i < vertex.length-1; ++i){
            sum += vertex[i][0]*vertex[i+1][1]-vertex[i+1][0]*vertex[i][1];
        }
        return Math.abs(sum)/2.0;
    }
}

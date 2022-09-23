package Three;

public class Two {
    public static final int[][] lab = new int[][]{
            {1,1,1,0,1},
            {1,1,0,0,1},
            {1,1,1,0,1}
    };
    public static void main(String[] args) {
        if(nextStep(2,1))
            System.out.println("Сможет");
        else
            System.out.println("Не сможет");
    }
    public static boolean nextStep(int x, int y){
        if( y < 0 || y >= lab.length || x < 0 || x >= lab[y].length)
            return false;
        if(lab[y][x] == 1)
            return false;
        lab[y][x] = 1;
        if(x == 0 || y == 0  || y == lab.length || x == lab[y].length)
            return true;
        else{
            return nextStep(x-1,y) || nextStep(x+1,y) || nextStep(x,y-1) || nextStep(x,y+1);
        }
    }
}

package Three;

public class Four {
    public static final int[][] map = new int[][]{
            {1,1,1,0,1},
            {1,1,0,0,0},
            {1,0,1,0,1}
    };

    public static void main(String[] args) {
        int result = 0;
        for(int i = 0; i < map.length; ++i)
            for (int  j = 0; j < map[i].length; ++j)
                if(nextStep(j,i))
                    result++;
        System.out.println(result);
    }
    public static boolean nextStep(int x, int y){
        if( y < 0 || y >= map.length || x < 0 || x >= map[y].length)
            return false;
        if(map[y][x] == 0)
            return false;
        else {
            map[y][x] = 0;
            nextStep(x - 1, y);
            nextStep(x + 1, y);
            nextStep(x, y - 1);
            nextStep(x, y + 1);
            return true;
        }
    }
}

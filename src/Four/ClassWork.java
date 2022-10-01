package Four;

import java.io.*;
import java.util.Random;

public class ClassWork {
    public static void main(String[] args) {
        try {
            String filePath = "intText";
            Random r = new Random();
            int[] x = new int[20];
            for (int i = 0; i < x.length; System.out.print(x[i] + " "), i++)
                x[i] = r.nextInt(20);
            int j = 0;
            FileOutputStream fos = new FileOutputStream(filePath);
            try (DataOutputStream dos = new DataOutputStream(fos)) {
                for (j = 0; j < x.length; j++)
                    dos.writeInt(x[j]);
            }
            System.out.println(checkSymetry(filePath));
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
    public static boolean checkSymetry (String filePath) throws IOException {
        RandomAccessFile rafEnd = new RandomAccessFile(filePath, "r");
        RandomAccessFile rafStart = new RandomAccessFile(filePath, "r");
        long posEnd = rafEnd.length();
        long posStart = rafEnd.length();
        int size = 4;
        int x,y;
        for (posEnd = posEnd - size; posEnd >= 0; posEnd -= size,posStart += size ) {
            rafEnd.seek(posEnd);
            x = rafEnd.readInt();
            y = rafStart.readInt();
            if(x != y)
                return false;
        }
        return true;
    }
}

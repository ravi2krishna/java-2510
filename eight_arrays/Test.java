package eight_arrays;

public class Test {
    public static void main(String[] args) {
        
        int[][] numTwoDim = new int[3][2]; // 3 Rows & 2 Columns
        numTwoDim[0][0] = 1;
        numTwoDim[0][1] = 2;
        numTwoDim[1][0] = 3;

        int[][] numsTwoDim = {{1,2},{3,4},{5,6}};
        for (int i = 0; i < numsTwoDim.length; i++) {
            int [] rows = numsTwoDim[i];
            for (int j = 0; j < rows.length; j++) {
                System.out.print(rows[j]);
            }
        }


    }
}

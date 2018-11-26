public class Skyview {

    private double[][] view;
    
    public Skyview(int numRows, int numCols, double[] scanned) {
        int num = 0;
        double[][] view = new double[numRows][numRows];
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                if (r % 2 == 0) {
                    view[r][c] = scanned[num];
                } else {
                    view[r][numCols - c] = scanned[num];
                    num++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRows, int startcol, int endCol) {
        int sum = 0;
        int count = 0;

        for (int r = startRow; r < endRows; r++) {
            for (int c = startcol; c < endCol; c++) {
                sum += view[r][c];
                count++;
            }
        }
        return sum/count;
    }
}

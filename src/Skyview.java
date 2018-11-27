public class Skyview {

    private double[][] view;

    public Skyview(int numRows, int numCols, double[] scanned) {
        int num = 0;
        this.view = new double[numRows][numRows];
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                if (r % 2 == 0) {
                    view[r][c] = scanned[num];
                } else {
                    view[r][numCols - c - 1] = scanned[num];
                    num++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0;
        int count = 0;

        for (int row = startRow; row <= endRow; row++) {
            for (int col = startCol; col <= endCol; col++) {
                sum += view[row][col];
                count++;
            }
        }

        return sum / count;
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[i].length; j++) {
                out += "[" + view[i][j] + "]";
            }
            out += "\n";
        }
        return out;
    }
}

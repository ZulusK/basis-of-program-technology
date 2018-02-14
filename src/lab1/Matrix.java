package lab1;

public class Matrix {
    private double[][] _data;
    private double _determinant;
    private boolean _isActualDeterminant;
    private double _doubleCompareDiff = 1e-6;

    /**
     * create new empty matrix [rows][columns]
     *
     * @param rows    number of rows in matrix
     * @param columns number of columns in matrix
     */
    public Matrix(int rows, int columns) {
        if (rows <= 0) {
            throw new IllegalArgumentException(String.format("Argument 'rows' should be positive integer, received %d", rows));
        } else if (columns <= 0) {
            throw new IllegalArgumentException(String.format("Argument 'columns' should be positive integer, received %d", columns));
        } else {
            this._data = new double[rows][columns];
            this._isActualDeterminant = false;
            this._determinant = 0;
        }
    }

    /**
     * create new  matrix [rows][columns] and fill it with some value
     *
     * @param rows    number of rows in matrix
     * @param columns number of columns in matrix
     * @param filler  - value to fill matrix
     */
    public Matrix(int rows, int columns, double filler) {
        this(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this._data[i][j] = filler;
            }
        }
    }

    /**
     * create new  matrix from 2-dimension array
     *
     * @param array - base array
     */
    public Matrix(double[][] array) {
        this(array.length, array[0].length);
        this.copyArray(array, _data);
    }

    /**
     * get rows number
     *
     * @return rows number
     */
    public int getRows() {
        return this._data.length;
    }

    /**
     * get columns number
     *
     * @return columns number
     */
    public int getColumns() {
        return this._data[0].length;
    }

    /**
     * Add matrix B to this matrix and get result
     *
     * @param B matrix for sum
     * @return result of sum A+B
     */
    public Matrix add(Matrix B) {
        if (B.getColumns() != this.getColumns()) {
            throw new IllegalArgumentException("Number of columns in matrix not equal this columns count");
        } else if (B.getRows() != this.getRows()) {
            throw new IllegalArgumentException("Number of rows in matrix not equal this columns count");
        } else {
            this._isActualDeterminant = false;
            double[][] data = new double[this.getRows()][this.getColumns()];
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    data[i][j] = this.get(i, j) + B.get(i, j);
                }
            }
            return new Matrix(data);
        }
    }

    /**
     * Multiply this matrix by the matrix B
     *
     * @param B matrix for multiplication
     * @return result of  A*B
     */
    public Matrix multiply(Matrix B) {
        throw new UnsupportedOperationException("");
    }


    /**
     * check, is matrix is square
     *
     * @return true, if matrix is square
     */
    public boolean isSquare() {
        return this.getRows() == this.getColumns();
    }

    /**
     * Multiply this matrix by the scalar value K
     *
     * @param K scalar value for multiplication
     * @return result of  A*K
     */
    public Matrix multiply(double K) {
        this._isActualDeterminant = false;
        double[][] data = new double[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                data[i][j] = this.get(i, j) * K;
            }
        }
        return new Matrix(data);
    }

    /**
     * calculate determinant of submatrix 2x2
     *
     * @param r start row
     * @param c start cell
     * @return determinant of submatrix 2x2
     */
    private double determinant2x2(int r, int c) {
        return _data[r][c] * _data[r + 1][c + 1] - _data[r + 1][c] * _data[r][c + 1];
    }

    private void copyArray(double[][] src, double[][] dest) {
        int rows = src.length;
        int columns = src[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                dest[i][j] = src[i][j];
            }
        }
    }

    /**
     * deduct one row from other
     *
     * @param src         source matrix
     * @param rowFrom     number of source row
     * @param rowWhat     number of subtracted row
     * @param startColumn number of start row
     * @param k           coefficient of from-k*what
     */
    private void deductRow(double[][] src, int rowFrom, int rowWhat, int startColumn, double k) {
        for (int i = startColumn; i < this.getColumns(); i++) {
            src[rowFrom][i] -= src[rowWhat][i];
        }
    }

    private double triangulate(double[][] src) {
        int bottom = this.getRows() - 1;
        int left = this.getRows() - 1;
        double lambda = 1;

        for (int currCol = 0; currCol < left; currCol++) {
            for (int currRow = 0; currRow < bottom; currRow++) {
                for (int destRow = currRow + 1; destRow < bottom; destRow++) {
                    // check is value in dest cell !=0
                    if (Math.abs(src[currRow][currCol]) < _doubleCompareDiff) {
                        return 0;
                    } else {
                        double k = -src[destRow][currCol] / src[currRow][currCol];
                        deductRow(src, destRow, currRow, currCol, k);
                    }
                }
            }
        }
        return lambda;
    }

    private double multiplyDiagonal(double[][] src) {
        double result = 1;
        for (int i = 0; i < this.getRows(); i++) {
            result *= src[i][i];
        }
        return result;
    }

    /**
     * calculate determinant of full matrix
     *
     * @return determinant of matrix NxN
     */
    private double determinantNxN() {
        double[][] dataTriangulated = new double[this.getRows()][this.getColumns()];
        copyArray(this._data, dataTriangulated);
        double lambda = this.triangulate(dataTriangulated);
        if (Math.abs(lambda) < _doubleCompareDiff) {
            return 0;
        } else {
            return lambda * multiplyDiagonal(dataTriangulated);
        }
    }

    /**
     * Calculate determinant of this matrix
     *
     * @return scalar value -determinant of this matrix
     */
    public double determinant() {
        if (!isSquare()) {
            throw new IllegalArgumentException("Matrix is not square");
        } else if (!this._isActualDeterminant) {
            if (this.getColumns() == 2) {
                // if matrix is 2x2
                this._determinant = determinant2x2(0, 0);
            } else {
                // if matrix is NxN
                this._determinant = this.determinantNxN();
            }
            this._isActualDeterminant = true;
        }
        return this._determinant;
    }

    /**
     * get value from cell (R,C)
     *
     * @param row    row number
     * @param column column number
     * @return value from cell (R,C)
     */
    public double get(int row, int column) {
        if (row < 0 || row >= this.getRows()) {
            throw new IllegalArgumentException(String.format("Param 'row'(%d) is out of matrix sizes", row));
        } else if (column < 0 || column >= this.getColumns()) {
            throw new IllegalArgumentException(String.format("Param 'column'(%d) is out of matrix sizes", column));
        } else {
            return this._data[row][column];
        }
    }

    /**
     * set value in cell(R,C)
     *
     * @param row    row number
     * @param column cell number
     * @param value  value for replacement
     * @return old value from cell [row,column]
     */
    public double set(int row, int column, double value) {
        if (row < 0 || row >= this.getRows()) {
            throw new IllegalArgumentException(String.format("Param 'row'(%d) is out of matrix sizes", row));
        } else if (column < 0 || column >= this.getColumns()) {
            throw new IllegalArgumentException(String.format("Param 'column'(%d) is out of matrix sizes", column));
        } else {
            double old = this._data[row][column];
            this._isActualDeterminant = false;
            this._data[row][column] = value;
            return old;
        }
    }
}

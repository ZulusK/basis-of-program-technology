package zulus.lab1;

import java.util.Arrays;

public class Matrix {
    private double[][] _data;
    private double _determinant;
    private boolean _isActualDeterminant;
    private double _delta = 1e-6;

    /**
     * create new empty matrix [rows][columns]
     *
     * @param rows    number of rows in matrix
     * @param columns number of columns in matrix
     **/
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

    public Matrix(Double[][] src) {
        this(src.length, src[0].length);
        int rows = src.length;
        int columns = src[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                _data[i][j] = src[i][j];
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
        int colN = src[0].length;
        for (int i = startColumn; i < colN; i++) {
            src[rowFrom][i] -= src[rowWhat][i] * k;
        }
    }

    private void swap(double[][] src, int r1, int r2) {
        double[] tmp = src[r1];
        src[r1] = src[r2];
        src[r2] = tmp;
    }

    private boolean normalizeRow(double[][] src, int currCell) {
        for (int row = currCell + 1; row < src.length; row++) {
            if (Math.abs(src[row][currCell]) > _delta) {
                // we found row with not 0 value in cell
                // swap this row with current
                swap(src, currCell, row);
                return true;
            }
        }
        return false;
    }

    private boolean is0(double v) {
        return Math.abs(v) < _delta;
    }

    private double triangulate(double[][] src) {
        int bottom = this.getRows();
        int left = this.getRows() - 1;
        double lambda = 1;
        for (int currCell = 0; currCell < left; currCell++) {
            // current row and column is equal
            // we move by diagonal
            if (is0(src[currCell][currCell])) {
                // value in current row is 0
                // we should swap it with another row
                if (!normalizeRow(src, currCell)) {
                    // all cell in columns contain 0, we can't swap them
                    // return 0
                    return 0;
                } else {
                    lambda *= -1;
                }
            }
            for (int destRow = currCell + 1; destRow < bottom; destRow++) {
                // destRow is index of row, from which we deduct current row
                if (!is0(src[destRow][currCell])) {
                    double k = src[destRow][currCell] / src[currCell][currCell];
                    deductRow(src, destRow, currCell, currCell, k);
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

        // if lambda ==0
        // return 0, matrix is singular
        if (is0(lambda)) {
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
            throw new IllegalArgumentException("zulus.lab1.Matrix is not square");
        } else if (!this._isActualDeterminant) {
            switch (this.getColumns()) {
                case 1:
                    this._determinant = this.get(0, 0);
                    break;
                case 2:
                    this._determinant = determinant2x2(0, 0);
                    break;
                default:
                    // if matrix is NxN
                    this._determinant = this.determinantNxN();
                    break;
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
            this._isActualDeterminant = false;
            double old = this._data[row][column];
            this._data[row][column] = value;
            return old;
        }
    }

    public String toString() {
        String s = String.format("zulus.lab1.Matrix %dx%d", getRows(), getColumns());
        for (double[] row : _data) {
            s += String.format("\n%s", Arrays.toString(row));
        }
        return s;
    }

    public boolean equals(Matrix m) {
        if (m == null || m.getRows() != this.getRows() || m.getColumns() != this.getColumns()) return false;
        for (int i = 0; i < m.getRows(); i++) {
            if (!Arrays.equals(m._data[i], this._data[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * task from lab 1
     *
     * @param A
     * @param B
     * @param k
     * @return value of det(A+ k *B)
     */
    public static double operation(Matrix A, Matrix B, double k) {
        if (A == null || B == null) throw new IllegalArgumentException("zulus.lab1.Matrix must be not-null value");
        return A.add(B.multiply(k)).determinant();
    }
}

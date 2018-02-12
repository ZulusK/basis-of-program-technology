package lab1;

import jdk.jshell.spi.ExecutionControl;

public abstract class Matrix<K extends Number> {
    private K[][] _data;
    private double _determinant;
    private boolean isActualDeterminant;


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
            this._data = (K[][]) new Object[rows][columns];
            this.isActualDeterminant = false;
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
    public Matrix(int rows, int columns, K filler) {
        this(rows, columns);
        if (filler == null) {
            throw new IllegalArgumentException("Argument 'filler' should be non null value");
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    this._data[i][j] = filler;
                }
            }
        }
    }

    /**
     * create new  matrix from 2-dimension array
     *
     * @param array - base array
     */
    public Matrix(K[][] array) {
        this(array.length, array[0].length);
        int rows = array.length;
        int columns = array[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this._data[i][j] = array[i][j];
            }
        }
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
    public abstract Matrix add(Matrix B);

    /**
     * Multiply this matrix by the matrix B
     *
     * @param B matrix for multiplication
     * @return result of  A*B
     */
    public abstract Matrix multiply(Matrix B);

    /**
     * Multiply this matrix by the scalar value K
     *
     * @param K scalar value for multiplication
     * @return result of  A*K
     */
    public abstract Matrix multiply(K K);

    /**
     * calculate determinant of submatrix
     *
     * @param r0 start row number
     * @param r1 end row number
     * @param c0 start column  number
     * @param c1 end column number
     * @return determinant of submatrix
     */
    private double determinnant(int r0, int r1, int c0, int c1) {
        throw new UnsupportedOperationException("");
    }

    /**
     * Calculate determinant of this matrix
     *
     * @return scalar value -determinant of this matrix
     */
    public double determinant() {
        throw new UnsupportedOperationException("");
    }

    /**
     * get value from cell (R,C)
     *
     * @param row    row number
     * @param column column number
     * @return value from cell (R,C)
     */
    public K get(int row, int column) {
        if (row < 0 || row > this.getRows()) {
            throw new ArrayIndexOutOfBoundsException(String.format("Param 'row'(%d) is out of matrix sizes", row));
        } else if (column < 0 || column > this.getColumns()) {
            throw new ArrayIndexOutOfBoundsException(String.format("Param 'column'(%d) is out of matrix sizes", column));
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
    public K set(int row, int column, K value) {
        if (row < 0 || row > this.getRows()) {
            throw new ArrayIndexOutOfBoundsException(String.format("Param 'row'(%d) is out of matrix sizes", row));
        } else if (column < 0 || column > this.getColumns()) {
            throw new ArrayIndexOutOfBoundsException(String.format("Param 'column'(%d) is out of matrix sizes", column));
        } else if (value == null) {
            throw new IllegalArgumentException("Param value must be non null value");
        } else {
            K old = this._data[row][column];
            this._data[row][column] = value;
            return old;
        }
    }
}

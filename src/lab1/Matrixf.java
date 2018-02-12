package lab1;

public class Matrixf extends Matrix<Float> {

    public Matrixf(Float[][] array) {
        super(array);
    }

    @Override
    public Matrix add(Matrix B) {
        if (B.getColumns() != this.getColumns()) {
            throw new IllegalArgumentException("Number of columns in matrix not equal this columns count");
        } else if (B.getRows() != this.getRows()) {
            throw new IllegalArgumentException("Number of rows in matrix not equal this columns count");
        }
        Float[][] data = new Float[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                data[i][j] = this.get(i, j) + B.get(i, j).floatValue();
            }
        }
        return new Matrixf(data);
    }


    @Override
    public Matrix multiply(Matrix B) {
        return null;
    }

    @Override
    public Matrix multiply(Float K) {
        Float[][] data = new Float[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                data[i][j] = this.get(i, j) * K;
            }
        }
        return new Matrixf(data);
    }

}

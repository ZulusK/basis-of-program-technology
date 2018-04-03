package zulus.lab3;

import zulus.lab1.Matrix;

import java.util.HashMap;

/**
 * Created by zulus on 03.04.18
 */
public class MatrixEnvironment {
    private HashMap<String, Matrix> _matrices;

    public MatrixEnvironment() {
        _matrices = new HashMap<>();
    }

    public void add(String name, Matrix matrix) {
        if (matrix != null) {
            this._matrices.put(name, matrix);
        } else {
            throw new IllegalArgumentException("Argument matrix == null");
        }
    }

    public Matrix delete(String name) {
        Matrix matrix = _matrices.getOrDefault(name, null);
        if (matrix != null) {
            _matrices.remove(name);
        }
        return matrix;
    }

    public Matrix get(String name) {
        return _matrices.getOrDefault(name, null);
    }
    public Matrix operation()
}

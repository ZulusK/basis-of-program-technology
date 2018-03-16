package zulus.lab1;

import org.junit.jupiter.api.Test;
import zulus.lab1.Matrix;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {
    double delta = 1e-6;

    @Test
    void testBaseConstructor_normal() {
        Matrix m = new Matrix(3, 3);
        assertEquals(m.getRows(), 3);
        assertEquals(m.getColumns(), 3);
        assertEquals(m.get(1, 1), 0, delta, "All cells is empty");
    }

    @Test
    void testBaseConstructor_invalidSize() {
        assertThrows(IllegalArgumentException.class, () -> {
            Matrix m = new Matrix(0, 3);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Matrix m = new Matrix(3, 0);
        });
    }

    @Test
    void testFillerConstructor_normal() {
        double filler = 10;
        Matrix m = new Matrix(3, 3, filler);
        assertEquals(m.getRows(), 3);
        assertEquals(m.getColumns(), 3);
        assertEquals(m.get(1, 1), filler, delta, "Values in cells are equal with filler");
    }

    @Test
    void testFillerConstructor_invalidSize() {
        assertThrows(IllegalArgumentException.class, () -> {
            Matrix m = new Matrix(0, 3, 100);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Matrix m = new Matrix(3, 0, 100);
        });
    }

    @Test
    void testArrayConstructor_normal() {
        double[][] src = new double[3][3];
        for (int i = 0; i < src.length; i++) {
            for (int j = 0; j < src[0].length; j++) {
                src[i][j] = Math.random();
            }
        }
        Matrix m = new Matrix(src);
        assertEquals(m.getRows(), src.length);
        assertEquals(m.getColumns(), src[0].length);
        for (int i = 0; i < src.length; i++) {
            for (int j = 0; j < src[0].length; j++) {
                assertEquals(m.get(i, j), src[i][j], delta);
            }
        }
    }

    @Test
    void testArrayConstructor_with0columns() {
        double[][] src = new double[3][0];

        assertThrows(IllegalArgumentException.class, () -> {
            Matrix m = new Matrix(src);
        });
    }

    @Test
    void testArrayConstructor_nullPointer() {
        assertThrows(NullPointerException.class, () -> {
            Matrix m = new Matrix(null);
        });
    }

    @Test
    void testGet_normal() {
        double filler = 10;
        Matrix m = new Matrix(10, 10, filler);
        assertEquals(m.get(0, 0), filler, delta, "Values in cells are equal with filler");
        assertEquals(m.get(9, 9), filler, delta, "Values in cells are equal with filler");
        assertEquals(m.get(0, 0), filler, delta, "zulus.lab1.Matrix doesn't change value in cell after get");
    }

    @Test
    void testGet_outOfBound() {
        double filler = 10;
        Matrix m = new Matrix(10, 10, filler);
        assertThrows(IllegalArgumentException.class, () -> {
            m.get(-1, 0);
        }, "zulus.lab1.Matrix not check negative row");
        assertThrows(IllegalArgumentException.class, () -> {
            m.get(0, -1);
        }, "zulus.lab1.Matrix not check negative column");
        assertThrows(IllegalArgumentException.class, () -> {
            m.get(10, 0);
        }, "zulus.lab1.Matrix not check row > size");
        assertThrows(IllegalArgumentException.class, () -> {
            m.get(0, 10);
        }, "zulus.lab1.Matrix not check negative columns > size");
    }

    @Test
    void testSet_outOfBound() {
        double filler = 10;
        Matrix m = new Matrix(10, 10, filler);
        assertThrows(IllegalArgumentException.class, () -> {
            m.set(-1, 0, 0);
        }, "zulus.lab1.Matrix not check negative row");
        assertThrows(IllegalArgumentException.class, () -> {
            m.set(0, -1, 0);
        }, "zulus.lab1.Matrix not check negative column");
        assertThrows(IllegalArgumentException.class, () -> {
            m.set(10, 0, 0);
        }, "zulus.lab1.Matrix not check row > size");
        assertThrows(IllegalArgumentException.class, () -> {
            m.set(0, 10, 0);
        }, "zulus.lab1.Matrix not check negative columns > size");
    }

    @Test
    void testSet_normal() {
        double filler = 10;
        double newValue = 1;
        Matrix m = new Matrix(10, 10, filler);
        assertEquals(m.set(0, 0, newValue), filler, delta, "zulus.lab1.Matrix does not return old value");
        assertEquals(m.set(9, 9, newValue), filler, delta, "zulus.lab1.Matrix does not return old value");
        assertEquals(m.get(0, 0), newValue, delta, "zulus.lab1.Matrix doesn't change value in cell after set");
    }

    @Test
    void testIsSquare() {
        Matrix m = new Matrix(3, 3);
        assertEquals(m.isSquare(), true);
        m = new Matrix(1, 10);
        assertEquals(m.isSquare(), false);
    }

    @Test
    void testAdd_normal() {
        Matrix m1 = new Matrix(3, 3, 10);
        Matrix m2 = new Matrix(3, 3, 1);
        Matrix m3 = m1.add(m2);
        assertEquals(m3.getColumns(), m1.getColumns(), "Number of columns in result matrix is invalid");
        assertEquals(m3.getRows(), m1.getRows(), "Number of rows in result matrix is invalid");
        for (int i = 0; i < m1.getRows(); i++) {
            for (int j = 0; j < m1.getColumns(); j++) {
                assertEquals(m3.get(i, j), m1.get(i, j) + m2.get(i, j), delta, String.format("Value in cell [%d,%d] is doesn't equals sum of cells in sources", i, j));
            }
        }
    }

    @Test
    void testAdd_invalidSize() {
        Matrix m = new Matrix(3, 3, 1);
        Matrix m1 = new Matrix(4, 3);
        assertThrows(IllegalArgumentException.class, () -> {
            m1.add(m);
        }, "Add matrix with rows>size");
        assertThrows(IllegalArgumentException.class, () -> {
            m.add(m1);
        }, "Add matrix with rows>size");
        Matrix m2 = new Matrix(2, 3);
        assertThrows(IllegalArgumentException.class, () -> {
            m2.add(m);
        }, "Add matrix with rows<size");
        assertThrows(IllegalArgumentException.class, () -> {
            m.add(m2);
        }, "Add matrix with rows<size");
        Matrix m3 = new Matrix(3, 4);
        assertThrows(IllegalArgumentException.class, () -> {
            m3.add(m);
        }, "Add matrix with columns>size");
        assertThrows(IllegalArgumentException.class, () -> {
            m.add(m3);
        }, "Add matrix with columns>size");
        Matrix m4 = new Matrix(3, 2);
        assertThrows(IllegalArgumentException.class, () -> {
            m4.add(m);
        }, "Add matrix with columns<size");
        assertThrows(IllegalArgumentException.class, () -> {
            m.add(m4);
        }, "Add matrix with columns<size");
    }

    @Test
    void testMultiply_normalSquare() {
        Matrix src = new Matrix(3, 3, 10);
        double k = 111;
        Matrix m = src.multiply(k);
        assertNotNull(m, "Result is not null");
        assertNotSame(src, m, "Result is not source matrix");
        for (int i = 0; i < src.getRows(); i++) {
            for (int j = 0; j < src.getColumns(); j++) {
                assertEquals(m.get(i, j), src.get(i, j) * k, delta);
            }
        }
    }

    @Test
    void testMultiply_normalNotSquare() {
        Matrix src = new Matrix(1, 3, 10);
        double k = 111;
        Matrix m = src.multiply(k);
        assertNotNull(m, "Result is not null");
        assertNotSame(src, m, "Result is not source matrix");
        for (int i = 0; i < src.getRows(); i++) {
            for (int j = 0; j < src.getColumns(); j++) {
                assertEquals(m.get(i, j), src.get(i, j) * k, delta);
            }
        }
    }

    @Test
    void testDeterminant_isChangeAfterOperationExecution() {
        Matrix m = new Matrix(2, 2, 1);
        assertEquals(m.determinant(), 0, delta);
        m.set(0, 0, 10);
        assertEquals(m.determinant(), 9, delta);
    }

    @Test
    void testDeterminant_notSquare() {
        Matrix m1 = new Matrix(1, 3);
        assertThrows(IllegalArgumentException.class, () -> {
            m1.determinant();
        });
        Matrix m2 = new Matrix(2, 1);
        assertThrows(IllegalArgumentException.class, () -> {
            m2.determinant();
        });
    }

    @Test
    void testDeterminant_1x1() {
        Matrix m = new Matrix(1, 1, 1);
        assertEquals(m.determinant(), 1, delta);
    }

    @Test
    void testDeterminant_2x2() {
        double[][] src1 = {
                {1, 0},
                {0, 1}
        };
        Matrix m1 = new Matrix(src1);
        assertEquals(m1.determinant(), 1, delta);
        double[][] src2 = {
                {1, 2},
                {2, 1}
        };
        Matrix m2 = new Matrix(src2);
        assertEquals(m2.determinant(), -3, delta);
        double[][] src3 = {
                {0, 0},
                {0, 0}
        };
        Matrix m3 = new Matrix(src3);
        assertEquals(m3.determinant(), 0, delta);
    }

    @Test
    void testDeterminant_3x3() {
        double[][] src1 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        Matrix m1 = new Matrix(src1);
        assertEquals(m1.determinant(), 1, delta);
        double[][] src2 = {
                {3, 0, 0},
                {0, 1, 2},
                {0, 2, 1}
        };
        Matrix m2 = new Matrix(src2);
        assertEquals(m2.determinant(), -9, delta);
        double[][] src3 = {
                {10, 1, 1},
                {20, 2, 3},
                {5, 4, 3}
        };
        Matrix m3 = new Matrix(src3);
        assertEquals(m3.determinant(), -35, delta);
    }

    @Test
    void testDeterminant_4x4() {

        double[][] src1 = {
                {1, 2, 5, 2},
                {-5, 1, -4, 2},
                {0, 1, 2, -2},
                {-1, 2, -5, 3},
        };
        Matrix m1 = new Matrix(src1);
        assertEquals(m1.determinant(), -259, delta);
        Matrix m2 = new Matrix(4, 4, 0);
        assertEquals(m2.determinant(), 0, delta);
    }

    @Test
    void testEquals_matrixFromArray() {

        Matrix m1 = new Matrix(3, 4, 1.6);
        Matrix m2 = new Matrix(new double[][]{
                {1.6, 1.6, 1.6, 1.6,},
                {1.6, 1.6, 1.6, 1.6,},
                {1.6, 1.6, 1.6, 1.6,},
        });
        assertTrue(m1.equals(m2));

        Matrix m3 = new Matrix(4, 3, 1.6);
        assertFalse(m1.equals(m3));
    }

    @Test
    void testEquals_null() {
        Matrix m1 = new Matrix(3, 4, 1.6);
        assertFalse(m1.equals(null));
    }

    @Test
    void testEquals_differentDelta() {
        Matrix m1 = new Matrix(3, 4, 1.6);
        Matrix m2 = new Matrix(3, 4, 1.60000001);
        assertFalse(m1.equals(m2));
    }

    @Test
    void testTask_null() {

        assertThrows(IllegalArgumentException.class, () -> {
            Matrix.operation(null, new Matrix(3, 4), 5);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Matrix.operation(new Matrix(3, 4), null, 5);
        });
    }

    @Test
    void testTask_diffDimensions() {

        assertThrows(IllegalArgumentException.class, () -> {
            Matrix.operation(new Matrix(4, 3), new Matrix(3, 3), 5);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Matrix.operation(new Matrix(3, 4), new Matrix(3, 3), 5);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Matrix.operation(new Matrix(4, 3), new Matrix(4, 3), 5);
        });
    }

    @Test
    void testTask_2x2() {
        Matrix A = new Matrix(2, 2, 1);
        Matrix B = new Matrix(2, 2, 1);
        assertEquals(Matrix.operation(A, B, 0.5), 0, delta);
        Matrix C = new Matrix(new double[][]{
                {1, 0},
                {0, 1}
        });
        assertEquals(Matrix.operation(A, C, 2), 8, delta);
    }

    @Test
    void testTask_3x3() {
        Matrix A = new Matrix(3, 3);
        Matrix B = new Matrix(new double[][]{
                {0, 0, 1},
                {0, 1, 0},
                {1, 0, 0}
        });
        Matrix C = new Matrix(new double[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        });
        assertEquals(Matrix.operation(A, B, 3), -27, delta);
        assertEquals(Matrix.operation(A, C, 2), 8, delta);
    }
}

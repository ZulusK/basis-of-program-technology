package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Main {
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
        assertEquals(m.get(0, 0), filler, delta, "Matrix doesn't change value in cell after get");
    }

    @Test
    void testGet_outOfBound() {
        double filler = 10;
        Matrix m = new Matrix(10, 10, filler);
        assertThrows(IllegalArgumentException.class, () -> {
            m.get(-1, 0);
        }, "Matrix not check negative row");
        assertThrows(IllegalArgumentException.class, () -> {
            m.get(0, -1);
        }, "Matrix not check negative column");
        assertThrows(IllegalArgumentException.class, () -> {
            m.get(10, 0);
        }, "Matrix not check row > size");
        assertThrows(IllegalArgumentException.class, () -> {
            m.get(0, 10);
        }, "Matrix not check negative columns > size");
    }

    @Test
    void testSet_outOfBound() {
        double filler = 10;
        Matrix m = new Matrix(10, 10, filler);
        assertThrows(IllegalArgumentException.class, () -> {
            m.set(-1, 0, 0);
        }, "Matrix not check negative row");
        assertThrows(IllegalArgumentException.class, () -> {
            m.set(0, -1, 0);
        }, "Matrix not check negative column");
        assertThrows(IllegalArgumentException.class, () -> {
            m.set(10, 0, 0);
        }, "Matrix not check row > size");
        assertThrows(IllegalArgumentException.class, () -> {
            m.set(0, 10, 0);
        }, "Matrix not check negative columns > size");
    }

    @Test
    void testSet_normal() {
        double filler = 10;
        double newValue = 1;
        Matrix m = new Matrix(10, 10, filler);
        assertEquals(m.set(0, 0, newValue), filler, delta, "Matrix does not return old value");
        assertEquals(m.set(9, 9, newValue), filler, delta, "Matrix does not return old value");
        assertEquals(m.get(0, 0), newValue, delta, "Matrix doesn't change value in cell after set");
    }

    @Test
    void testIsSquare() {
        Matrix m = new Matrix(3, 3);
        assertEquals(m.isSquare(), true);
        m = new Matrix(1, 10);
        assertEquals(m.isSquare(), false);
    }
}

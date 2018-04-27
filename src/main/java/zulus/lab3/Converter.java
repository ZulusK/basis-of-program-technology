package zulus.lab3;

import zulus.lab1.Matrix;

public class Converter {

    public static Matrix convertToMatrix(Variable variable) throws ConvertationException {
        if (variable.getValueType().isAssignableFrom(Matrix.class)) {
            return (Matrix) variable.getValue();
        }
        throw new ConvertationException(variable.getValueType(), Double.class);
    }

    public static Double convertToDouble(Variable variable) throws ConvertationException {
        if (variable.getValueType().isAssignableFrom(Double.class)) {
            return (Double) variable.getValue();
        }
        if (variable.getValueType().equals(String.class)) {
            return Double.parseDouble((String) variable.getValue());
        }
        throw new ConvertationException(variable.getValueType(), Double.class);

    }


}

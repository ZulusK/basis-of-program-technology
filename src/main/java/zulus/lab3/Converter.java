package zulus.lab3;

public class Converter {

    public static Double convertToDouble(Variable variable) throws ConvertationException {
        if (variable.getValueType().isAssignableFrom(Double.class)) {
                return (Double) variable.getValue();
        }
        if (variable.getValueType().equals(String.class)) {
                return Double.parseDouble((String) variable.getValue());
        }
        throw new ConvertationException(variable.getValueType(), Double.class);

    }

    public static Object convert(Variable variable, Class destination) throws ConvertationException {
        if (destination.isAssignableFrom(String.class)) {
            return variable.getValue().toString();
        }
        if (destination.isAssignableFrom(Double.class)) {
            return convertToDouble(variable);
        }
        throw new ConvertationException(variable.getValueType(), destination);
    }
}

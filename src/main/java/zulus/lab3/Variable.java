package zulus.lab3;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import zulus.lab1.Matrix;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.stream.Collectors;

public class Variable<T> {

    private T _value;
    private Class<T> _type;

    public Variable(T value, Class<T> type) {
        this._value = value;
        this._type = type;
    }

    public Variable setSign() {
        if (_type.equals(Double.class)) {
            return new Variable<>(((Double) this._value) * -1, Double.class);
        } else if (_type.equals(Matrix.class)) {
            return new Variable<>(((Matrix) _value).multiply(-1), Matrix.class);
        } else if (_type.isAssignableFrom(List.class)) {
            List inverted = ((List) _value).stream().mapToDouble( x -> -(Double)x).boxed().collect(Collectors.toList());
            return new Variable<>(inverted, List.class);
        }
        return this;
    }

    public T getValue() {
        return _value;
    }


    public Class<T> getValueType() {
        return _type;
    }


}

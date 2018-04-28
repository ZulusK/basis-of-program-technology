package zulus.lab3;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import zulus.lab1.Matrix;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.stream.Collectors;

public class Variable<T> {

    private T _value;

    public Variable(T value) {
        this._value = value;
    }

    public Variable setSign() {
        if (getValueType().equals(Double.class)) {
            return new Variable<>(((Double) this._value) * -1);
        } else if (getValueType().equals(Matrix.class)) {
            return new Variable<>(((Matrix) _value).multiply(-1));
        } else if (getValueType().isAssignableFrom(List.class)) {
            List inverted = ((List) _value).stream().mapToDouble(x -> -(Double) x).boxed().collect(Collectors.toList());
            return new Variable<>(inverted);
        }
        return this;
    }

    public T getValue() {
        return _value;
    }


    public Class getValueType() {
        return _value.getClass();
    }


}

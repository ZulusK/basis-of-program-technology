package zulus.lab3;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.lang.reflect.ParameterizedType;

public class Variable<T> {
    public static enum SIGN {
        PLUS, MINUS
    }

    private T _value;
    private Class<T> _type;
    private SIGN sign = SIGN.PLUS;

    public Variable(T value, Class<T> type) {
        this._value = value;
        this._type = type;
    }

    public SIGN getSign() {
        return sign;
    }

    public Variable<T> setSign() {
        this.sign = this.sign == SIGN.PLUS ? SIGN.MINUS : SIGN.MINUS;
        return this;
    }

    public T getValue() {
        return _value;
    }

    public void setValue(T _value) {
        this._value = _value;
    }

    public Class<T> getValueType() {
        return _type;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s", getValueType().getName(), String.valueOf(_value));
    }

    public Variable applySign() {
        if (sign == SIGN.PLUS) return new Variable<>(this._value, this._type);
        else {
            if (_type.equals(Double.class)) {
                return new Variable<>(((Double) this._value) * -1, Double.class);
            } else {
                return new Variable<>(_value, _type);
            }
        }
    }
}

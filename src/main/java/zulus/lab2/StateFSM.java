package zulus.lab2;

/**
 * Created by zulus on 31.03.18
 */
public class StateFSM extends FSM {
    private FSMState _currStateHandler;

    interface FSMState {
        State getOrigin();

        FSMState handle(Event event);
    }

    class State0 implements FSMState {
        public State getOrigin() {
            return State.Q0;
        }

        public FSMState handle(Event event) {
            switch (event) {
                case OPEN_BRACKET:
                    return new State1();
                default:
                    return new StateError();
            }
        }
    }

    class State1 implements FSMState {
        public State getOrigin() {
            return State.Q1;
        }

        public FSMState handle(Event event) {
            switch (event) {
                case DIGIT:
                    return new State2();
                case UPPER_LETTER:
                    return new State3();
                default:
                    return new StateError();
            }
        }
    }

    class State2 implements FSMState {
        public State getOrigin() {
            return State.Q2;
        }

        public FSMState handle(Event event) {
            switch (event) {
                case DIGIT:
                    return new State2();
                case CLOSE_BRACKET:
                    return new State4();
                default:
                    return new StateError();
            }
        }
    }

    class State3 implements FSMState {
        public State getOrigin() {
            return State.Q3;
        }

        public FSMState handle(Event event) {
            switch (event) {
                case UPPER_LETTER:
                    return new State3();
                case CLOSE_BRACKET:
                    return new State4();
                default:
                    return new StateError();
            }
        }
    }

    class State4 implements FSMState {
        public State getOrigin() {
            return State.Q4;
        }

        public FSMState handle(Event event) {
            return new StateError();
        }
    }

    class StateError implements FSMState {
        public State getOrigin() {
            return State.ERROR;
        }

        public FSMState handle(Event event) {
            return new StateError();
        }
    }

    @Override
    protected void start() {
        _currStateHandler = new State0();
        _currentState=_currStateHandler.getOrigin();
    }

    @Override
    State nextState(Event event) {
        _currStateHandler = _currStateHandler.handle(event);
        return _currStateHandler.getOrigin();
    }
}

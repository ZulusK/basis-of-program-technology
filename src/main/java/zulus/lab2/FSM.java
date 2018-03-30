package zulus.lab2;

/**
 * Created by zulus on 30.03.18
 */
//  \{(\d+|[A-Z]+)\}
public abstract class FSM {
    protected enum State {
        Q0, Q1, Q2, Q3, Q4, ERROR;
    }

    protected enum Event {
        DIGIT("0123456789"), UPPER_LETTER("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), OPEN_BRACKET("{"), CLOSE_BRACKET("}"), ANY("");
        public final String template;

        Event(String template) {
            this.template = template;
        }

        /**
         * check, is the symbol is a in a vocabulary
         *
         * @param symbol symbol to check
         * @return true, if symbol is part of vocabulary
         */
        public boolean contains(char symbol) {
            return template.contains(String.valueOf(symbol));
        }
    }

    protected State _currentState;

    /**
     * recognize event, which is dispatched with specified symbol
     *
     * @param symbol specified symbol
     * @return event, that is associated with this symbol
     */
    private Event recognizeEvent(char symbol) {
        for (Event event : Event.values()) {
            if (event.contains(symbol)) {
                return event;
            }
        }
        return Event.ANY;
    }

    private void start() {
        _currentState = State.Q0;
    }

    /**
     * check, is string matched to this regex
     *
     * @param string string to check
     * @return true, if matched
     */
    public boolean scan(String string) {
        if (string == null) throw new IllegalArgumentException("Argument string must be non-null value");
        start();
        for (char symbol : string.toCharArray()) {
            Event event = recognizeEvent(symbol);
            _currentState = nextState(event);
            if (_currentState == State.ERROR) break;
        }
        if (_currentState == State.Q4) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * calculate next state of SM
     *
     * @param event transition event
     * @return next state of state machine
     */
    abstract State nextState(Event event);
}

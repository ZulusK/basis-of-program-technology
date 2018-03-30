package zulus.lab2;

/**
 * Created by zulus on 30.03.18
 */
public class SwitchFSM extends FSM {

    private State nextStateQ0(Event event) {
        if (event == Event.OPEN_BRACKET) return State.Q1;
        else return State.ERROR;
    }

    private State nextStateQ1(Event event) {
        switch (event) {
            case DIGIT:
                return State.Q2;
            case UPPER_LETTER:
                return State.Q3;
            default:
                return State.ERROR;
        }
    }

    private State nextStateQ2(Event event) {
        switch (event) {
            case DIGIT:
                return State.Q2;
            case CLOSE_BRACKET:
                return State.Q4;
            default:
                return State.ERROR;
        }
    }

    private State nextStateQ3(Event event) {
        switch (event) {
            case UPPER_LETTER:
                return State.Q3;
            case CLOSE_BRACKET:
                return State.Q4;
            default:
                return State.ERROR;
        }
    }

    @Override
    State nextState(Event event) {
        switch (_currentState) {
            case Q0:
                return nextStateQ0(event);
            case Q1:
                return nextStateQ1(event);
            case Q2:
                return nextStateQ2(event);
            case Q3:
                return nextStateQ3(event);
            default:
                return State.ERROR;
        }
    }
}

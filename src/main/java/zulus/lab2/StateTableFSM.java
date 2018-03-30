package zulus.lab2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zulus on 31.03.18
 */
public class StateTableFSM extends FSM {
    private class TransitionTable {
        private HashMap<State, List<Transition>> _table;

        public TransitionTable() {
            this._table = new HashMap<>();
        }

        public void addTransition(State startState, Transition transition) {
            if (!_table.containsKey(startState)) {
                _table.put(startState, new LinkedList<>());
            }
            _table.get(startState).add(transition);
        }

        public List<Transition> get(State startState) {
            if (_table.containsKey(startState))
                return _table.get(startState);
            else return null;
        }
    }

    private class Transition {
        Event trigger;
        State endState;

        public Transition(Event trigger, State endState) {
            this.trigger = trigger;
            this.endState = endState;
        }

    }

    TransitionTable _transitionTable;

    public StateTableFSM() {
        _transitionTable = new TransitionTable();
        _transitionTable.addTransition(State.Q0, new Transition(Event.OPEN_BRACKET, State.Q1));
        _transitionTable.addTransition(State.Q1, new Transition(Event.DIGIT, State.Q2));
        _transitionTable.addTransition(State.Q1, new Transition(Event.UPPER_LETTER, State.Q3));
        _transitionTable.addTransition(State.Q2, new Transition(Event.DIGIT, State.Q2));
        _transitionTable.addTransition(State.Q3, new Transition(Event.UPPER_LETTER, State.Q3));
        _transitionTable.addTransition(State.Q2, new Transition(Event.CLOSE_BRACKET, State.Q4));
        _transitionTable.addTransition(State.Q3, new Transition(Event.CLOSE_BRACKET, State.Q4));
    }

    @Override
    State nextState(Event event) {
        List<Transition> transitionList = _transitionTable.get(_currentState);
        if (transitionList == null) {
            return State.ERROR;
        } else {
            Transition transition = transitionList
                    .stream()
                    .filter((Transition x) -> x.trigger == event)
                    .findFirst()
                    .orElse(null);
            if (transition != null) {
                return transition.endState;
            } else {
                return State.ERROR;
            }
        }
    }
}

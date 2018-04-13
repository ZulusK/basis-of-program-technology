package zulus.lab3.commands;


import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;

public class AssignmentCommand extends Command {

    public AssignmentCommand(Matcher matcher) {
        super(matcher);
    }

    @Override
    public Map<String, Object> getArgs() {
        if (_args == null) {
            _args = new HashMap<>();
            _args.put("VARIABLE", _matcher.group(2));
            _args.put("VALUE", _matcher.group(1));
        }
        return _args;
    }

    @Override
    public String getName() {
        return "ASSIGNMENT";
    }
}

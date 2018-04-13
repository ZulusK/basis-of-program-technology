package zulus.lab3;

import zulus.lab3.commands.AssignmentCommand;
import zulus.lab3.commands.Command;

import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum CommandType {
    ASSIGNMENT("\\s*([A-Z])\\s*=\\s*(\\[.*\\])\\s*", AssignmentCommand.class), ERROR(".*", null);


    private Pattern pattern;
    private Class<? extends Command> _commandClass;

    CommandType(String regex, Class<? extends Command> commandClass) {
        pattern = Pattern.compile(regex);
        _commandClass = commandClass;
    }

    public boolean matches(String candidate) {
        return pattern.matcher(candidate).matches();
    }

    public Command getCommand(String candidate) {
        if (_commandClass == null) return null;
        try {
            return _commandClass.getConstructor(Matcher.class).newInstance(new Object[]{pattern.matcher(candidate)});
        } catch (NoSuchMethodException exc) {
            System.out.println(exc.getCause());
            return null;
        } catch (IllegalAccessException exc) {
            System.out.println(exc.getCause());
            return null;
        } catch (InstantiationException exc) {
            System.out.println(exc.getCause());
            return null;
        } catch (InvocationTargetException exc) {
            System.out.println(exc.getCause());
            return null;
        }
    }
}

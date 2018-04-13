package zulus.lab3.commands;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Command {

    protected Matcher _matcher;
    protected Map<String,Object> _args;


    public Command(Matcher matcher){
        _matcher=matcher;
    }

    public abstract Map<String, ?> getArgs();
    public abstract String getName();


    @Override
    public String toString(){
        return String.format("Command %s with args: %s",getName(),getArgs());
    }
}

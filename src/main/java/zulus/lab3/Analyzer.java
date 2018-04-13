package zulus.lab3;

import zulus.lab3.commands.Command;
import zulus.lab3.commands.AssignmentCommand;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by zulus on 03.04.18
 */
public class Analyzer {


    public Analyzer() {

    }

    public Command recognizeCommand(String input) {
        return Arrays.stream(CommandType.values()).filter(x -> x.matches(input)).findFirst().get().getCommand(input);
    }

}



package by.dma.calculator;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Main {
    public static void main(String[] args) {
        CommandLineParser parser = new DefaultParser();
        Options options = createOptions();

        try {
            CommandLine line = parser.parse(options, args);
            validateOptions(line);

            String operation = line.getOptionValue("operation");
            Integer a = Integer.valueOf(line.getOptionValue("value1"));
            Integer b = Integer.valueOf(line.getOptionValue("value2"));
            calculate(operation, a, b);
        } catch (ParseException e) {
            System.err.println("Failed to pass command line arguments");
            System.exit(0);
        }
    }

    private static Options createOptions() {
        Options options = new Options();
        options.addOption(new Option("o", "operation", true,
                                     "The operation to use for the calculator."));
        options.addOption(new Option("v1", "value1", true, "Value 1 for the operation."));
        options.addOption(new Option("v2", "value2", true, "Value 2 for the operation."));
        return options;
    }

    private static void validateOptions(CommandLine line) {
        if (!line.hasOption("operation")) {
            System.err.println("Need to provide option -o, --operation");
            System.exit(0);
        }

        if (!line.hasOption("value1")) {
            System.err.println("Need to provide option -v1, --value1");
            System.exit(0);
        }

        if (!line.hasOption("value2")) {
            System.err.println("Need to provide option -v2, --value2");
            System.exit(0);
        }
    }

    private static void calculate(String operation, Integer a, Integer b) {
        Calculator calculator = new Calculator();

        if ("add".equals(operation)) {
            System.out.println(calculator.add(a, b));
        } else if ("subtract".equals(operation)) {
            System.out.println(calculator.subtract(a, b));
        } else if ("multiply".equals(operation)) {
            System.out.println(calculator.multiply(a, b));
        } else if ("divide".equals(operation)) {
            System.out.println(calculator.divide(a, b));
        } else {
            throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
    }
}

public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        return logLine.split(":")[0].replaceAll("\\[|\\]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = logLevel(logLine);
        String message2 = message(logLine);
        System.out.println(message2 + " (" + message + ")");
        return message2 + " (" + message + ")";
    }
}

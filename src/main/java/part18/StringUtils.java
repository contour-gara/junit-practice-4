package part18;

public class StringUtils {
    public String toSnakeCase(String string) {
        String[] strings = string.split("(?<=[A-Z])(?=[A-Z][a-z])|(?<=[a-z])(?=[A-Z])");
        string = String.join("_", strings);
        string = string.toLowerCase();
        return string;
    }
}

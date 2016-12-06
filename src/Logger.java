public class Logger {
    private String format;

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public static void main(String[] args) {
        String format;
        Logger test = new Logger();
        test.setFormat("Test");
        format = test.getFormat();
        System.out.println(format);
    }
}
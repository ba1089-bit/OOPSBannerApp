public class BannerUC5 {

    public static void main(String[] args) {

        // Array declaration + initialization in single statement
        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", " ", "WELCOME", " ", " ", "*"),
                String.join("", "*", " ", " ", "TO", " ", " ", "*"),
                String.join("", "*", " ", "OOPS", " ", "BANNER", " ", "APP", " ", "*"),
                String.join("", "*", " ", "UC5", " ", "VERSION", " ", "*"),
                String.join("", "*", " ", "ARRAY INITIALISATION", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
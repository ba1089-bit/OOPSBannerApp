public class BannerUC4 {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "*********"),
                String.join("", "*  WELCOME  *"),
                String.join("", "*   TO   *"),
                String.join("", "* OOPS BANNER APP *"),
                String.join("", "*********")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
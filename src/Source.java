public class Source {
    public static void main(String[] args) {
        String str = ("one.two.three");
        String test = replaceDots(str);
        System.out.println(test.equals("one-two-three"));
    }
    public static String replaceDots(final String str) {
        String result = str.replace(".", "-");
        return result;
    }
}


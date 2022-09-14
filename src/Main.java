import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    String name = "FJU Catholic University";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        //INDEX 0,1,2,3,......,n=1; n=length()
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(name.length()-1));
        System.out.println(name.indexOf('i'));
        System.out.println(name.indexOf("Uni"));

        String age = "25";
        System.out.println(Integer.parseInt(age)); //Java build-in method
    }
}

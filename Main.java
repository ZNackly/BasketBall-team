import java.util.Locale;
import java.util.*;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        String name = in.next();
        int age = in.nextInt();
        double height = in.nextDouble();
        System.out.println(name + " is " + age + " years old and " + height + " centimeters tall");
    }
}

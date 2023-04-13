package stringsactions;

public class Test {
    public static void main(String[] args) {
        String testString = "neshto si";
        byte carAge = 18;
        String carMake = "Mazda";

        System.out.println(testString.charAt(2));
        System.out.println(testString.length());
        System.out.println(testString.toUpperCase());

        System.out.printf("The car Age is: %d\n", carAge);
        System.out.printf("The car Make is: %s\n", carMake);
    }
}

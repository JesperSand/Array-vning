public class funktions {
    public static void printNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            if (i < names.length - 1) {
                System.out.print(", ");
            }
        }
    }
    public static void printReversed(String[] names) {
        for (int i = 0; i < names.length; i++) {
            String reversedName = new StringBuilder(names[i]).reverse().toString();
            System.out.print(reversedName);
            if (i < names.length - 1) {
                System.out.print(", ");
            }
        }
    }

}

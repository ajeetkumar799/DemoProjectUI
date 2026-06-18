package programs;
class StringReverseWithoutBuilder {
    public static void main(String[] args) {
        String str = "Ajeet Kumar Singh";
        String str2 = str.replace(" ", "");   // remove spaces
        String str3 = str2.toLowerCase();     // convert to lowercase
        int a = str3.length();                // corrected spelling

        for (int i = str3.length()-1; i >= 0; i--) {
            char c = str3.charAt(i);
            System.out.print(c);
        }
    }
}

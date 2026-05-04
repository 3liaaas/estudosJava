public class FuncoesString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG";

        String s01 = original.toLowerCase();
        String s02  = original.toUpperCase();
        String s03  = original.trim();
        String s04  = original.substring(2);
        String s05  = original.substring(2, 9);
        String s06 = original.replace("a", "x");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        String s07 = "Elias Araujo Rodrigues";
        String[] nome = s07.split(" ");
        String p01 = nome[0];
        String p02 = nome[1];
        String p03 = nome[2];


        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(s06);

        System.out.println(i);
        System.out.println(j);

        System.out.println(p01);
        System.out.println(p02);
        System.out.println(p03);
    }
}

/*
 * FORMATAR: toLowerCase(); toUpperCase(); trim() -> (trim)REMOVE ESPAÇOS NOS CANTOS;
 *
 * RECORTAR: substring(inicio); substring(inicio, fim);
 *
 * SUBSTITUIR: replace(char, char); replace(string, string);
 *
 * BUSCAR: indexOf; lastIndexOf;
 *
 * str.Split(""); -> recortar em vetores.
 */

public class FuncoesString {
    public static void main(String[] args) {

        String original = "abcde FGIHJ ABC abc DEFG   ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -"  + s07 + "-");
        System.out.println("indexOf('bc'): -" + i + "-");
        System.out.println("lastIndexOf('bc'): -" + j + "-");

    }
}

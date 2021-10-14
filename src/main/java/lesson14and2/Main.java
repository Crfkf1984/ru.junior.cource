package lesson14and2;

public class Main {
    public static void main(String[] args) {
        String rt = "Before  text editors existed, computer text was punched into cards with keypunch machines. " +
                "Physical boxes of these thin cardboard cards were then inserted into a card-reader. Magnetic tape " +
                "and disk card-image files created from such card decks often had no line-separation characters at all," +
                " and assumed fixed-length 80-character records. An alternative to cards was punched paper tape. " +
                "It could be created by some teleprinters such as the Teletype, which used special characters to indicate ends of records." +
                "The first text editors were line editors oriented to teleprinter- or typewriter-style terminals without displays. " +
                "Commands often a single keystroke effected edits to a file at an imaginary insertion point called the cursor." +
                " Edits were verified by typing a command to print a small section of the file, and periodically by printing the entire file. " +
                "In some line editors, the cursor could be moved by commands that specified the line number in the file, text strings context " +
                "for which to search, and eventually regular expressions. Line editors were major improvements over keypunching." +
                " Some line editors could be used by keypunch; editing commands could be taken from a deck of cards and applied to a specified file." +
                " Some common line editors supported a verify mode in which change commands displayed the altered lines.";

        String res = word(rt);

            System.out.println(res);
    }

    public static String word(String str){
        String def = str.replace(" ", "\n");

        return def;
    }
}

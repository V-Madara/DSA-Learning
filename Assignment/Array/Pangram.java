package Assignment.Array;

public class Pangram {
    public boolean checkIfPangram(String sentence) {
        char alpha = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.println(alpha);
            if (sentence.indexOf(alpha) == -1) {
                return false;
            }
            alpha += 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        Pangram pg = new Pangram();
        System.out.println(pg.checkIfPangram(str));
    }

}

class PangramChecker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(sentence);
        System.out.println("Is Pangram: " + isPangram);
    }

    public static boolean checkPangram(String s) {
        s = s.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}

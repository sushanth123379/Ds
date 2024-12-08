
public class Practice01{
    public String compressString(String word) {
        int i = 0, j = 0;
        int n = word.length();
        StringBuilder s = new StringBuilder();

        while (i < n) {
            int c = 0;
            while (j < n && word.charAt(i) == word.charAt(j) && c < 9) {
                c++;
                j++;
            }
            s.append(c).append(word.charAt(i));
            i = j;
        }

        return s.toString();
    }

    public static  void main(String[] args) {
        String word="aaabbc";
         System.out.println(new Practice01().compressString(word));
    }
}
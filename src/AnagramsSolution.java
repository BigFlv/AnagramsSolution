import java.util.Hashtable;
import java.util.Scanner;

/**
 * This class has just two methods.
 */
public class AnagramsSolution {
    /**
     * This method checks if two string is Anagram. An Anagram is a word or phrase formed by rearranging the letters.
     * We choose to make that with HashTable.
     * @param a is first string
     * @param b is second string
     * @return true if a and b are Anagrams
     */
    static boolean isAnagram(String a, String b) {
        Hashtable <Character, Integer> hm1 = new Hashtable<Character, Integer>();
        for (int i = 0; i < a.length(); i++) {
            if (hm1.containsKey(a.charAt(i))) {
                int v = hm1.get(a.charAt(i)) + 1;
                hm1.put(a.charAt(i), v);
            } else {
                hm1.put(a.charAt(i), 1);
            }
        }
        Hashtable<Character, Integer> hm2 = new Hashtable<Character, Integer>();
        for (int i = 0; i < b.length(); i++) {
            if (hm2.containsKey(b.charAt(i))) {
                int v = hm2.get(b.charAt(i)) + 1;
                hm2.put(b.charAt(i), v);
            } else {
                hm2.put(b.charAt(i), 1);
            }
        }
        //am adaugat ceva nou
        return hm1.equals(hm2);// I change "==" with equals
    }

    /**
     * This method returns the first number which is repetitive.
     * @param arr is a array
     * @return return an integer number which is repetitive
     */
    static int findD (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return 0;
    }

    /**
     * Here we create instance or object of class AnagramsSolution
     * @param args ceva
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        System.out.println("test");

        System.out.println("Commit - Opincariu Calin");
        
        // rezolvati inca doua probleme
        ClasaLuMiron m=new ClasaLuMiron();
        m.Afisare();

    }
}


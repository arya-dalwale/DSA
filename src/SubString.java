import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
        substring("", "absgabs");
        System.out.println(substring1("","abcde"));
    }

    static void substring(String p, String up) {

        // Base condition
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        // Take the first character
        char ch = up.charAt(0);

        // Include the character
        substring(p + ch, up.substring(1));

        // Exclude the character
        substring(p, up.substring(1));
    }
    
    
    static ArrayList<String> substring1(String p,String up) {
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        
        ArrayList<String>left = substring1(p+ch,up.substring(1));
        ArrayList<String>right = substring1(p,up.substring(1));
        
        
        left.addAll (right);
        return left;

    }
}
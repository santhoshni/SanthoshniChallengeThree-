import java.util.*;
public class ChallengeThree {
	
    static void decodeStr(){
        Map<Character, Character> replacements = new HashMap<>();
        replacements.put('h', 'b');
        replacements.put('g', 'u');
        replacements.put('i', 't');
        replacements.put('k', 'e');
        replacements.put('f', 'r');
    
        String input = "hgiikf";
        StringBuilder output = new StringBuilder();
        for (Character c : input.toCharArray()) {
            output.append(replacements.getOrDefault(c, c));
        }
        System.out.println(output.toString());
    }
    
    public static void main(String args[]) {
        
        ChallengeThree CT = new ChallengeThree();
        CT.decodeStr();
 	
    }
}

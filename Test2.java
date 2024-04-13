package Logic_Based_programs;
import java.util.*;
public class Test2 {

	 static String s="";
	public static void main(String[] args) {
		String name = "example"; // You can replace this with any string you want to test

        Map<Character, Integer> letterCountMap = new HashMap<>();

        for (char c : name.toCharArray()) {
            letterCountMap.put(c, letterCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            char letter = entry.getKey();
            int count = entry.getValue();

            if (count > 1) {
                System.out.println("Letter: " + letter + ", Count: " + count);
            }
        }
				
	}
	
	
		}
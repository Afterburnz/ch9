import java.util.Arrays;
public class Longest {
    public static void main(String[] args) {
    if (args.length == 0) {
		System.err.println("Usage: java Longest <words>");
		return;
		}
		
		String longest = args[0];
		String firstAlphabetically = args[0];
		for (int i = 0; i<args.length; i++) {
			if (args[i].length() > longest.length()) {
				longest = args[i];
			}
			if (firstAlphabetically.compareTo(args[i]) > 0) {
				firstAlphabetically = args[i];
			}
		}
	System.out.println("Longest: " + longest + " " + longest.length() + " letters");
	System.out.println("First alphabetically: " + firstAlphabetically);
	}
}

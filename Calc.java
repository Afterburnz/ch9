import java.util.Arrays;
public class Calc {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        args[0] = args[0].toLowerCase();
        int product = 1;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double average = 0;
        if (args.length < 2) {
			System.err.println("Usage: java Calc <add|mult|max|min> <numbers>");
			return;
        }
		for (int i = 1; i <args.length; i++) {
			int value = Integer.parseInt(args[i]);
			if (value > max) {
				max = value;
			}
			if (value < min) {
				min = value;
			}
			product *= value;
			sum+= value;
		}
		if (args[0].equals("add")) {
			System.out.println(sum);
		} else if (args[0].equals("mult")) {
			System.out.println(product);
		} else if (args[0].equals("max")) {
			System.out.println(max);
		} else if (args[0].equals("min")){
			System.out.println(min);
		} else {
			System.err.println("Unknown operation: " + args[0]);
			return;
		}
	}
}

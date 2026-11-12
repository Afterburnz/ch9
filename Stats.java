import java.util.Arrays;
public class Stats {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
		for (String arg : args) {
			int value = Integer.parseInt(arg);
			if (value > max) {
				max = value;
			}
			if (value < min) {
				min = value;
			}
		}
		System.out.println("The max is " + max);
		System.out.println("The min is " + min);
	}
}

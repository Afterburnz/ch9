import java.util.Arrays;
public class Stats {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        int count = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double average = 0;
		for (String arg : args) {
			int value = Integer.parseInt(arg);
			if (value > max) {
				max = value;
			}
			if (value < min) {
				min = value;
			}
			count++;
			sum+= value;
		}
		average = (double) sum / count;
		System.out.println("Count: " + count);
		System.out.println("Sum: " + sum);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.printf("Average: %.2f", average); 
		System.out.println("");
	}
}

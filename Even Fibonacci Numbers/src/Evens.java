
public class Evens {
	public static void main (String [] args) {
		int x1 = 1;//fib num 1
		int x2 = 2;//fib num 2
		int sum = 2;//sum of even fibonacci nums
		while (x2 < 4000000) {//goes till fibonacci sequence passes 4 mil
			int total = x1 + x2;//gets the next fibonacci number
			if (isEven(total))//adds fibonacci num to sum if it is even
				sum += total;
			x1 = x2;//moves forward in fibonacci sequence
			x2 = total;
			System.out.println(sum);
		}	
	}
	public static boolean isEven(int i) {//checks to see if num is even
		if (i % 2 == 0)
			return true;
		return false;
	}
}

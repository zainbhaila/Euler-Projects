import java.util.*;
//Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
//125874 works for x2
public class Multiples {
	public static void main (String [] args) {	
		int curNum = 1;//current number
		boolean incomplete = true;
		while(incomplete) {
			ArrayList<Integer> int1 = new ArrayList<Integer>();
			newNum(curNum,int1,1);//x
			ArrayList<Integer> int2 = new ArrayList<Integer>();
			newNum(curNum,int2,2);//2x
			if (int1.equals(int2)) {//check whether to proceed to next multiple
				//System.out.println(int1 + " " + int2);
				//incomplete = false;
				ArrayList<Integer> int3 = new ArrayList<Integer>();
				newNum(curNum,int3,3);//3x
				if (int1.equals(int3)) {
					//System.out.println("" + int1 + int2 + int3);
					//incomplete = false;
					ArrayList<Integer> int4 = new ArrayList<Integer>();
					newNum(curNum,int4,4);//4x
					if (int1.equals(int4)) {
						ArrayList<Integer> int5 = new ArrayList<Integer>();
						newNum(curNum,int5,5);//5x
						if (int1.equals(int5)) {
							ArrayList<Integer> int6 = new ArrayList<Integer>();
							newNum(curNum,int6,6);//6x
							if (int1.equals(int6)) 
								incomplete = false;
						}
					}
				}
			}
			System.out.println(curNum);
			curNum++;
		}
		System.out.println("Done.");
	}
	
	public static void sort(ArrayList<Integer> list) {//sorts an integer array list numerically
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(j).intValue() < list.get(i).intValue()) {
					Integer temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
	
	public static void newNum(int cur, ArrayList<Integer> list, int value) {
		String nextNum  = String.valueOf(cur*value);//multiplies the current number by the multiple value
		for (int i = 0; i < nextNum.length(); i++) {//separates multiple into digits
			list.add(new Integer(nextNum.substring(i, i+1)));
		}
		sort(list);//sorts the digits
	}
}

// Problem:  http://oj.leetcode.com/problems/integer-to-roman/
// Analysis: http://blog.csdn.net/lilong_dream/article/details/22869803
// 1988lilong@163.com

public class IntegerToRoman {
	public String intToRoman(int num) {
		int[] base = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
				"IX", "V", "IV", "I" };

		String result = "";

		for (int i = 0; num > 0; ++i) {
			int count = num / base[i];
			num %= base[i];

			while (count > 0) {
				result += roman[i];
				--count;
			}
		}

		return result;
	}
	
	public static void main(String[] args) {
		IntegerToRoman slt = new IntegerToRoman();
		System.out.println(slt.intToRoman(321));
	}
}
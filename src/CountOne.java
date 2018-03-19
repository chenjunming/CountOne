package cn.cjm.interview10;

/**
 * 
 * @ClassName: CountOne
 * @Description: 请实现一个函数，输入一个整数，输出该数二进制表示中1的个数。
 *               例如把9表示成二进制是1001，有2位是1。因此如果输入9，该函数输出2。
 * @author cjm
 * @date 2018年2月2日 下午5:12:42
 *
 */
public class CountOne {
	/*
	 * 解题思路：当一个二进制数减去1之后，从右边数起第一个1就会变成0，他后面的数字就会变成1
	 */
	public static void main(String[] args) {
		int countOneNum = countOneNum(0xFFFFFFFF);
		System.out.println(countOneNum);
		System.out.println(0xFFFFFFFF);
	}

	private static int countOneNum(int num) {
		int count=0;//记录1的个数
		if(num==0)return 0;
		
		while (true) {
			int temp = num -1;
			num = num & temp;
			count++;
			if (num == 0)
				break;
		}
		return count;
	}
}

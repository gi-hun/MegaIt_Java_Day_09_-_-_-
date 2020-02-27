// 문제) 구구단 출력
		/*
		 * === 2단 ===
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * 2 X 4 = 8
		 * 2 X 5 = 10
		 * 2 X 6 = 12
		 * 2 X 7 = 14
		 * 2 X 8 = 16
		 * 2 X 9 = 18
		 * === 3단 ===
		 * 3 X 1 = 3
		 * 3 X 2 = 6
		 * ...
		 * ...
		 */

package day_09;

public class WhileEx21 {
	public static void main(String[] args) {
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("[i]="+i+"[j]= "+j);
			}
		}
		System.out.println();
		
		int count=2;
		
		for(int i=2;i<10;i++)
		{
			System.out.println("====="+count+"단=====");
			for(int j=0;j<10;j++)
			{
				System.out.println(i+"X"+j+"="+i*j);
			}
			count++;
		}
	}
}

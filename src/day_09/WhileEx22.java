// # 삼각형 그리기

package day_09;

public class WhileEx22 {
	public static void main(String[] args) {
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		int count=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("#");
			}
			System.out.println("");
		}
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		System.out.println("문제 1번");
		count = 1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<count;j++)
			{
				System.out.print("#");
			}
			count++;
			System.out.println("");
		}

		/*
		 * 문제 2)
		 * ###
		 * ##
		 * #
		 */
		System.out.println("문제2번");
		count=3;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<count;j++)
			{
				System.out.print("#");
			}
			System.out.println("");
			count--;
		}

		/*
		 * 문제 3)
		 * @##
		 * @@#
		 * @@@
		 */
		int count1=0;
		int count2=1;
		System.out.println("문제3번");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("@");
			}
			for(int j=2;j>i;j--)
			{
				System.out.print("#");
			}
			System.out.println();
		}

		/*
		 * 문제 4)
		 *   #
		 *  ###
		 * #####
		 */
		System.out.println("문제4번");
		for(int i=0;i<4;i++)
		{
			for(int j=3;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("#");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print("#");
			}
			System.out.println(" ");
		}

	}
}

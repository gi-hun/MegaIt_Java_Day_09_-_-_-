// # �ﰢ�� �׸���

package day_09;

public class WhileEx22 {
	public static void main(String[] args) {
		/*
		 * ��)
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
		 * ���� 1)
		 * #
		 * ##
		 * ###
		 */
		System.out.println("���� 1��");
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
		 * ���� 2)
		 * ###
		 * ##
		 * #
		 */
		System.out.println("����2��");
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
		 * ���� 3)
		 * @##
		 * @@#
		 * @@@
		 */
		int count1=0;
		int count2=1;
		System.out.println("����3��");
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
		 * ���� 4)
		 *   #
		 *  ###
		 * #####
		 */
		System.out.println("����4��");
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

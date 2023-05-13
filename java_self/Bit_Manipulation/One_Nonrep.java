package Bit_Manipulation;
public class One_Nonrep{
	public static int findSingle(int ar[])
	{
		int res = ar[0];
		for (int i = 1; i < ar.length; i++)
			res = res ^ ar[i];
		    return res;
	}
	public static void main (String[] args)
	{
		int ar[] = {2, 3, 5, 4, 5, 3, 4 ,2,8};
		System.out.println(findSingle(ar) + " ");
	}
}

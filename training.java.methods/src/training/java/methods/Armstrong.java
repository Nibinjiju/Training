package training.java.methods;


	

	public class Armstrong {
			public static void main(String args[])
			{
			int number=407;
			int reverse=0;
			int remainder;
			int temp;
			temp=number;
			while(number!=0)
			{
			remainder=number%10;
			reverse+=Math.pow(remainder,3);
			number=number/10;
			}
			if(temp==reverse)
			{
			System.out.print("it is an Armstrong");
			}
			else
			{

			System.out.print("it is not an armstrong");
			}
			}
			}






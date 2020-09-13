package week1.day1;

public class Fibanocci {
	public static void main(String[] args) {
		
	
int a=0,b=1,n=8;
System.out.print("First "+n+" terms: ");

for (int i = 1; i <= n; i++)
{
    System.out.print(a + " , ");

    int sum = a + b;
    a = b;
    b = sum;
}
}
}

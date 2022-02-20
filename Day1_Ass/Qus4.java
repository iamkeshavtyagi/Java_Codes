package Day1_Ass;


public class Qus4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k,count=6;

for(i=0;i<=11;i++)
{
	for(j=0;j<2;j++) {
		System.out.printf("*");
	}
	for(k=0;k<=6;k++) {
		if(k==count) {
			System.out.printf("***");
		}
		else {
			System.out.printf("  ");
		}
	}
	if(i<=5)
	{
		count--;
	}
	else if(i<=11) {
		count++;
	}
	System.out.printf("\n");
}
	}

}

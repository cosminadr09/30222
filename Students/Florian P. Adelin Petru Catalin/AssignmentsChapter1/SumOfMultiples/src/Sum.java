import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
	System.out.println("Number: ");
	Scanner read= new Scanner(System.in);
	
	int number= read.nextInt();
	int i,sum=0;

	for(i=0; i<number; i++){
		if(i%3==0 || i%5==0){
			sum=sum+i;
		}
	}
	
	System.out.println("The sum is "+sum);
	
	}

}

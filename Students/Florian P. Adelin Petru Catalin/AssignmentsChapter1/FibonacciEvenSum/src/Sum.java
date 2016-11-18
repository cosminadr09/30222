
public class Sum {

	public static void main(String[] args) {
		int firstTerm=0;
		int secondTerm=1;
		int aux;
		int sum=0;
		while(secondTerm<4000000){
			aux=firstTerm;
			firstTerm=secondTerm;
			secondTerm=aux+firstTerm;
			if(secondTerm%2==0){
				sum=sum+secondTerm;
			}
		}
		System.out.println("Sum of even terms is "+ sum);

	}

}

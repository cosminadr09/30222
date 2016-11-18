
public class Palindrome {

	public static void main(String[] args) {
		int maxProduct3Digits=999*999;
		for(int i=maxProduct3Digits; i>0; i--){
			int reversedNr=0;
			int aux=i;
			//checking if i is palindrome
			while(aux>0){
				reversedNr=(aux%10)+reversedNr*10;
				aux=aux/10;
			}
			//if i is palindrome checking if can be wrote like a product of 2 numbers of 3 digits each one
			if(reversedNr==i){
				int p=100;
				while(i%p!=0 && p<i/2 && p<1000){
					p++;
				}
				if(p<1000 && i/p<1000){
					System.out.println(p+"The largest palindrome made from the product of two 3-digit numbers is "+ i);
					break;
				}
				else{continue;}
				
			}
		}
	}

}

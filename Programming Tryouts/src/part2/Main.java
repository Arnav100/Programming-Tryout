package part2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //User has to put string first

int input = args.length - 1; 


for(int f = 0; f <= input; f += 1 ){
	 System.out.print(args[f] + " ");
	 if(f == input - 1) {
		 System.out.print("\n");
	 }
}
System.out.print("\n");
 for(int i = input - 1; i >= 0 ; i -= 1){
	  	String word = args[i]; 
	  	int wordLength = word.length() - 1; 
	  	
	  	 
	  	 		for( ; wordLength >= 0; wordLength -= 1){

	  	 			System.out.print(word.charAt(wordLength));
	
	  	 			} 
	  	 		System.out.print(" ");
 }
 
int total = 0; 

 for(int f = 0; f <= input - 1 ; f += 1 ){
	  total += args[f].length(); 
 }

String num = args[input];
int number = Integer.parseInt(num);

int mod = number % 10;

 System.out.println("\n" + "Amount of characters: " + total + "\n" + "Mod 10: " + mod);
  
	}

}

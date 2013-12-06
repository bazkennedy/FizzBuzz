public class fizzbuzz{
/*
FizzBuzz is a common test for programmers. 
You are asked to print the numbers 1 to 100 with the following exceptions
--> replace numbers divisible by 3 with the string Fizz
--> replace numbers divisible by 5 with the string Buzz
--> replace numbers divisible by both 3 and 5 with the string FizzBuzz
*/


	public static void main(String[] args){
		for(int i=0;i < 100;i++){
			if(((i%3)==0)&&((i%5)==0)){
				System.out.println("fizzbuzz");
			}
			else if((i%5)==0){
				System.out.println("fizz");
			}	
			else if((i%3)==0){
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}	
		}
	}
}
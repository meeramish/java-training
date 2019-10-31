package basics;

public class FibinachiApp {

	public static void main(String[] args) {
		/*fib(0)=0;
		 * fib(1)=1;
		 * */
System.out.println(fib(5));
	}
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}return (fib(n-1)+ fib(n-2));
	}

}
/*
 * Write a function that takes a value n returns the sum of numbers 1 to n
 * -----------------------------------------------------------------------
 * public static int sum(int[]numbers){
 * for(int n=0; n<numbers.length; n++){
 * sum= sum+numbers[n]}
 * return sum;
 * }*/
 
/*Find Average-------------------------------------------
 * public static int findAvg(int[] arr){
 * int sum=0;
 * for(i=0; i<arr.length; i++){
 * sum= sum+arr[i]}
 * return sum/arr.length}*/

/*Maximum-------------------------
 * public static int findMax(int[] arr){
	int max = arr[0];
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
 * }
 */














 
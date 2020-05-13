package HackerRank;

public class Day2 {


	    /*
	     * Complete the simpleArraySum function below.
	     */
	    public static int simpleArraySum(int[] a) {
	        int sum=0;
	        for(int i=0; i<a.length; i++){
	         sum=sum+a[i];
	        }
	return sum;
	    }

	   
	
	    public static void main(String[] args) {
	  int []Array={1,2,3,4,10,11};
	 int sum= simpleArraySum(Array);

	     System.out.println(simpleArraySum(Array));
	    }
		
		
	
}
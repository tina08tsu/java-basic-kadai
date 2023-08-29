package kadai_011;

public class Prime_Chapter11 {

	    public static void main(String[] args) {
	        int n = 100; 
	        boolean[] number = new boolean[n + 1];

	        
	        for (int i = 2; i <= n; i++) {
	            number[i] = true;
	        }

	        
	        for (int i = 2; i * i <= n; i++) {
	            if (number[i]) {
	                for (int j = i * i; j <= n; j += i) {
	                    number[j] = false;
	                }
	            }
	        }
	        for (int i = 2; i <= n; i++) {
	            if (number[i]) {
	                System.out.println(i + " ");
	            }
	        }
	    }
	}

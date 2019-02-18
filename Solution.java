import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Solution {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {

    	int changed = 0;
    	
    	// **** loop once per SOS message ****
    	for (int i = 0; i < s.length(); i += "SOS".length()) {
    		
//    		System.out.println("i: " + i);
    		
    		// **** extract the current substring ****
    		String subs = s.substring(i, i + 3);
    		
//    		System.out.println("subs ==>" + subs + "<==");
    		
    		// **** count the changes ****
    		if (subs.charAt(0) != 'S')
    			changed++;
    		
    		if (subs.charAt(1) != 'O')
    			changed++;
 		
       		if (subs.charAt(2) != 'S')
    			changed++;
    	}
    	
    	// **** ****
    	return changed;
    }

    
    private static final Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) throws IOException {
    	
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

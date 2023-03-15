import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;

public class main {

    
    public static void main(String[] args) throws Exception {
    	
    	int answer;
    	int attemption = 0;
    	int[] x = new int[10];
    	double length = x.length;
    	double sum = 0;
		
    	while (true){
    		
    		Scanner input = new Scanner(System.in);
    		System.out.print("Insert temperature " + (attemption+1) + "/10: ");
    		answer = input.nextInt();
    		if (answer > -140 && answer < 20) {
    			x[attemption] = answer;
        		
        		
        		if (attemption == 9) {
        			for(int i = 0; i < x.length; i++) {
            			sum += x[i];
            		}
        			double average = sum / length;
        			System.out.println("Temperature average: " + average);
            		System.out.println("Temperature smallest result: " + getMin(x));
        			System.out.println("Temperature maximum result: " + getMax(x));
        			
        			
        			break;
        		}
        		attemption = attemption + 1;
        		
    		}
    		else {
    			System.out.println("Insert temperature between -140 and +20!");
    		}
    		
    		
    	}
		
    	
    	
    	/*
    	for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}*/
		
		
    }
    
    public static int getMax(int[] inputArray) {
    	int maxValue = inputArray[0];
    	for(int i=1; i < inputArray.length; i++) {
    		if(inputArray[i] > maxValue) {
    			maxValue = inputArray[i];
    		}
    	}
    	return maxValue;
    }
    
    public static int getMin(int[] inputArray) {
    	int minValue = inputArray[0];
    	for(int i=1; i < inputArray.length; i++) {
    		if(inputArray[i] < minValue) {
    			minValue = inputArray[i];
    		}
    	}
    	
    	return minValue;
    }
}
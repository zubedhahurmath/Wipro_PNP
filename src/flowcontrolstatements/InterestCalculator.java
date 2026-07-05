package flowcontrolstatements;

public class InterestCalculator {
	 public static void main(String[] args) {
	        if (args.length == 2) {
	            String gender = args[0];
	            int age = Integer.parseInt(args[1]);
	            if (gender.equalsIgnoreCase("Female")) {
	                if (age >= 1 && age <= 58) {
	                    System.out.println("Percentage of interest is 8.2%");
	                } else if (age >= 59 && age <= 100) {
	                    System.out.println("Percentage of interest is 9.2%");
	                }
	            } else if (gender.equalsIgnoreCase("Male")) {
	                if (age >= 1 && age <= 58) {
	                    System.out.println("Percentage of interest is 8.4%");
	                } else if (age >= 59 && age <= 100) {
	                    System.out.println("Percentage of interest is 10.5%");
	                }
	            } else {
	                System.out.println("Invalid Gender");
	            }
	        } else {
	            System.out.println("Please pass gender and age as command line arguments.");
	        }
	    }
}

package activities;

public class Activity8 {
	
	  void exceptionTest(String str) throws CustomException {
	        if(str == null) {
	            throw new CustomException("String value is null");
	        } else {
	            System.out.println(str);
	        }
	    }

	 public static void main(String[] args){
        try {
            Activity8 a8 = new Activity8();
            a8.exceptionTest("Will print to console");
            a8.exceptionTest(null); // Exception is thrown here
            a8.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }
 
   
}
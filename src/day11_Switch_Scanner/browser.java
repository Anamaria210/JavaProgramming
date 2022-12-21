package day11_Switch_Scanner;

public class browser {

    public static void main(String[] args) {
        String browserName ="firefox";
        String result ="";
        boolean validBrowser= browserName=="Chrome"||browserName=="firefox"||browserName=="opera"
                || browserName=="safari"||browserName=="Edge";


        if(validBrowser){
           //5 options
           if(browserName=="Chrome"){
               result="Chrome result is Selected";
           } else if (browserName=="Firefox") {
               result ="firefox result is Selected";
           } else if (browserName=="opera") {
               result="Opera result is Selected";
           } else if (browserName == "safari") {
              result="Safari result is Selected";
           }else{
               result="Edge result is Selected";
           }


        }else{
            result ="Invalid browser Name";


        }
        System.out.println(result);
    }


}




/*
1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declare a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name
	        Ex:
	        	String browser = "chrome";
	    	Output:
	    		Chrome Browser is selected
			Note: MUST use nested if
 */

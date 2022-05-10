package java8features;

//block lambda expressions
public class LambdaDemo3 {

	public static void main(String[] args) {
		
		//lambda expression
		IMyString reverseStr = (str) -> {
            String result="";
            for(int i=str.length()-1;i>=0;i--)
                result+=str.charAt(i);
            return result;
        };
       
        System.out.println(reverseStr.myStringFunction("Lambda EXpressions"));

	// lambda expression with single parameter
    IMyString myName = (name) -> { return "Hello "+name;};
   
    System.out.println(myName.myStringFunction("Raj"));
   
    // lambda expression with single parameter with no parenthesis
        IMyString myName1 = name -> { return "Hello "+name;};
       
        System.out.println(myName1.myStringFunction("James Gosling"));
	}

}

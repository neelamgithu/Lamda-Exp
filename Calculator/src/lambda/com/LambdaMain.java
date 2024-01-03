package lambda.com;

public class LambdaMain {

public static void main(String[] args) {
	
System.out.println("Welcome to Calculator using Lambda");

LambdaInterface sum = (int a,int b)->a+b;
  
LambdaInterface sub = (int a,int b)->a-b;
   
LambdaInterface div = (int a,int b)->a / b;

}

	}



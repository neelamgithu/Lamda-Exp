package lambda.com;

public class LambdaMain {

public static void main(String[] args) {
	
System.out.println("Welcome to Calculator using Lambda");

LambdaInterface sum = (int a,int b)->a+b;
System.out.println("Addition of a and  b is" +sum.Values(5, 4));
LambdaInterface sub = (int a,int b)->a-b;
System.out.println("Substraction of a and  b is" +sub.Values(5, 4));
LambdaInterface div = (int a,int b)->a / b;
System.out.println("divsion  of a and  b is" +div .Values(5, 4));
}

	}



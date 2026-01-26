import java.util.Scanner;
class Calculator{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter first Number: ");
double num1 = sc.nextDouble();
System.out.print("Enter second Number: ");
double num2 = sc.nextDouble();
System.out.print("Enter Operator(+,-,*,/):");
char operator = sc.next().charAt(0);

double result;
switch (operator) {
    case '+' :
        result = num1 + num2;
        break;
    case '-':
        result = num1 - num2;
        break;
    case '*':
        result = num1 * num2;
        break;
    case '/':
        if(num2 != 0){
            result = num1/num2;
        }else{
            System.out.println("Cannot divide by Zero");
            return; 
        }
        break;
   default:
        System.out.println("Invalid operator");
        return;
}

System.out.println("Result: "+ result);
}
}

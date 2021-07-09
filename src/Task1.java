import java.math.BigDecimal;

public class Task1 {

    public static void main(String[] args) {

        short var1 = 22;
        short var2 = 460;
        if (var1 > var2){
            System.out.println("1. variable is largest");
        }else{
            System.out.println("2.variable is largest");
        }

        if (var1 < var2) {
            System.out.println("1. variable is smallest");
        }else {
            System.out.println("2. variable is smallest");
        }

        if(var1 == var2){
            System.out.println("Variables are equals");
        }else{
            System.out.println("Variables are not equals");
        }

        if(var1 % 2 == 0){
            System.out.println("Variable 1 is even.");
        }else{
            System.out.println("Variable 1 is odd");
        }

        if(var2 % 2 == 0){
            System.out.println("Variable 2 is even.");
        }else{
            System.out.println("Variable 2 is odd");
        }

        if (var1 >= 0){
            System.out.println("Variable 1 is positive");
        }else {
            System.out.println("Variable 1 is negative");
        }

        if (var2 >= 0){
            System.out.println("Variable 2 is positive");
        }else {
            System.out.println("Variable 2 is negative");
        }

        if (var1 < 100){
            System.out.println("Variable 1 is less than 100");
        }else {
            System.out.println("Variable 1 is greater than 100");
        }

        if (var2 < 100){
            System.out.println("Variable 2 is less than 100");
        }else {
            System.out.println("Variable 2 is greater than 100");
        }

        int result = Math.round(var1 + var2);
        System.out.println("Rounded sum: " + result);

        double result2 = Math.round((var2 - var1) * 100)/100;
        System.out.println("Result 2 : " + result2);

        //Same output for this:

        //double result2 = var2 - var1;
        //System.out.println("Result 2: " + result2);

    }
}






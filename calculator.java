import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char operator;
        int choice;
        Double num1, num2, result;
        
        System.out.println("----Simple Calculator----");
        System.out.println("1. Basic Operations");
        System.out.println("2. Unit Conversion");
        System.out.print("Choose an Option: ");
        choice = scan.nextInt();

        System.out.println("");  // Extra line break for better visibility

        if(choice == 1){
            System.out.println("Choose an operator: +, -, *, /");
            operator = scan.next().charAt(0);

            System.out.print("Enter first number : ");
            num1 = scan.nextDouble();

            System.out.print("Enter second number : ");
            num2 = scan.nextDouble();

            switch (operator) {

                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
                break;
            }
        }else{
            System.out.println("----Availble Option----");
            System.out.println("1. Length Conversion");
            System.out.println("2. Weight Conversion");
            System.out.print("Choose an Option: ");
            choice = scan.nextInt();

            System.out.println("");  // Extra line break for better visibility
            
            if(choice == 1){
                System.out.println("----Availble Option----");
                System.out.println("1. Centimeters To Meters");
                System.out.println("2. Meters To Centimeters");
                System.out.println("3. Feets To Centimeters");
                System.out.print("Choose an Option: ");
                choice = scan.nextInt();

                System.out.print("Enter the length: ");
                double Length = scan.nextDouble();
                double conver_length;

                switch (choice) {
                    case 1:
                        conver_length = Length / 100;
                        System.out.println(Length + " centimeters is " + conver_length + " meters");
                        break;

                    case 2:
                        conver_length = Length * 100;
                        System.out.println(Length + " meters is " + conver_length + " centimeters");
                        break;
                    
                    case 3:
                        conver_length = Length * 30.48;
                        System.out.println(Length + " feets is " + conver_length + " centimeters");
                        break;
                        
                    default:
                        System.out.println("Invalid Option! Plz choose correct option");
                    break;
                }
            }else{
                System.out.println("----Availble Option----");
                System.out.println("1. Grams To Kilograms");
                System.out.println("2. Kilograms To Grams");
                System.out.print("Choose an Option: ");
                choice = scan.nextInt();

                System.out.print("Enter the weight: ");
                double weight = scan.nextDouble();
                double conver_weight;

                switch (choice) {
                    case 1:
                        conver_weight = weight / 1000;
                        System.out.println(weight + " grams is " + conver_weight + " kilograms");
                        break;

                    case 2:
                        conver_weight = weight * 1000;
                        System.out.println(weight + " kilograms is " + conver_weight + " grams");
                        break;

                    default:
                        System.out.println("Invalid Option! Plz choose correct option");
                    break;
                }
            }
        }
        scan.close();
    }
}

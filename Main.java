import javax.swing.*;

import static java.lang.Double.parseDouble;

public class Main {



    /*
     *Uses JOptionPane to get user input for what numbers should be used and which operation
     *should be performed. Then displays the result of the operation to the user and repeats
     * until they tell the program to stop.
     */
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        String[] ops = {"Addition", "Subtraction", "Multiplication", "Division"};
        String[] exit = {"Yes", "No"};
        while(true) {
            String input1 = JOptionPane.showInputDialog("Enter the first number.");
            num1 = processInput(input1);
            int operation = JOptionPane.showOptionDialog(null, "Select Operation.", "", -1, 1, null, ops, ops[0]);
            String input2 = JOptionPane.showInputDialog("Enter the second number.");
            num2 = processInput(input2);
            double ans = runOperation(num1, num2, operation);
            showResult(operation, num1, num2, ans);
            int end = JOptionPane.showOptionDialog(null, "Perform Another Operation?", "", -1, 1, null, exit, exit[0]);
            if(end == 1)
                System.exit(0);
        }
    }

    /*
     *Extracts a double from the user input passed as a parameter. It does this by using parseDouble.
     */
    private static double processInput(String input) {
        double num = 0;
        try {
            num = parseDouble(input);
        }
        catch(Exception e) {
            String in = JOptionPane.showInputDialog("Invalid Entry! Enter only a single number.");
            return processInput(in);
        }
        return num;
    }

    /*
     *Uses the int parameter to determine which operation should be performed, then performs the operation
     *with a helper method in the calc class.
     */
    private static double runOperation(double first, double second, int op) {
        if(op == 0) {
            return Calc.add(first, second);
        }
        else if(op == 1) {
            return Calc.subtract(first, second);
        }
        else if(op == 2) {
            return  Calc.multiply(first, second);
        }
        else {
            return Calc.divide(first, second);
        }
    }

    /*
     *Displays the mathematical expression entered along with the answer to said expression.
     */
    private static void showResult(int op, double first, double second, double res) {
        String result = "";
        if(op == 0)
            result = first + " + " + second + " = " + res;
        else if(op == 1)
            result = first + " - " + second + " = " + res;
        else if(op == 2)
            result = first + " * " + second + " = " + res;
        else
            result = first + " / " + second + " = " + res;
        JOptionPane.showMessageDialog(null, result);
    }
}

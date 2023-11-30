package org.example;

public class Calculator {
    private double num1, num2, result;
    private String operator;

    public void setOperand1(double num1) {
        this.num1 = num1;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setOperand2(double num2) {
        this.num2 = num2;
    }

    public double performOperation() {
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "÷":
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
        return result;
    }
}

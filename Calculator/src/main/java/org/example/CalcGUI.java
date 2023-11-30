package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcGUI extends Calculator {
    private JPanel panelMain;
    private JTextField textField1;
    private JTextField textField2;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a9Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton multiplyButton;
    private JButton subtractButton;
    private JButton addButton;
    private JButton button2;
    private JButton dotButton;
    private JButton a0Button;
    private JButton CLEARButton;
    private JButton divideButton;
    private JButton DELETEButton;

    private Calculator calculatorLogic;

    public CalcGUI() {
        JFrame mainFrame = new JFrame("Calculator");
        mainFrame.setContentPane(panelMain);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.setSize(400, 400);

        calculatorLogic = new Calculator();

        // Initialize textField2
        textField2 = new JTextField();
        textField2.setEditable(false);  // Make it non-editable

        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText("");
                textField2.setText("");
            }
        });

        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String backspace = null;

                if(textField1.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(textField1.getText());
                    strB.deleteCharAt(textField1.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    textField1.setText(backspace);
                }
                textField2.setText("");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calculatorLogic.setOperand1(Double.parseDouble(textField1.getText()));
                calculatorLogic.setOperator("/");
                textField1.setText("");
                textField2.setText("");  // Clear textField2 when an operator is clicked
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calculatorLogic.setOperand2(Double.parseDouble(textField1.getText()));
                double result = calculatorLogic.performOperation();
                textField1.setText("");
                String val = String.valueOf(result);
                textField1.setText(val);  // Update textField2 with the result
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calculatorLogic.setOperand1(Double.parseDouble(textField1.getText()));
                calculatorLogic.setOperator("*");
                textField1.setText("");
                textField2.setText("");  // Clear textField2 when an operator is clicked
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calculatorLogic.setOperand1(Double.parseDouble(textField1.getText()));
                calculatorLogic.setOperator("-");
                textField1.setText("");
                textField2.setText("");  // Clear textField2 when an operator is clicked
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calculatorLogic.setOperand1(Double.parseDouble(textField1.getText()));
                calculatorLogic.setOperator("+");
                textField1.setText("");
                textField2.setText("");  // Clear textField2 when an operator is clicked
            }
        });

        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!textField1.getText().contains(".")) {
                    textField1.setText(textField1.getText() + dotButton.getText());
                }
            }
        });

        ActionListener digitButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton source = (JButton) actionEvent.getSource();
                textField1.setText(textField1.getText() + source.getText());
            }
        };

        a0Button.addActionListener(digitButtonListener);
        a1Button.addActionListener(digitButtonListener);
        a2Button.addActionListener(digitButtonListener);
        a3Button.addActionListener(digitButtonListener);
        a4Button.addActionListener(digitButtonListener);
        a5Button.addActionListener(digitButtonListener);
        a6Button.addActionListener(digitButtonListener);
        a7Button.addActionListener(digitButtonListener);
        a8Button.addActionListener(digitButtonListener);
        a9Button.addActionListener(digitButtonListener);
    }

    }

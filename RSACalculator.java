import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RSACalculator extends JFrame {
    private JButton checkButton;
    private JLabel resultLabel;
    private JLabel titleLabel;
    private JLabel inputLabel;
    private JTextField inputField;

    public RSACalculator() {
        setTitle("RSA Number Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        titleLabel = new JLabel("RSA Number Checker");
        inputLabel = new JLabel("Enter a number:");
        inputField = new JTextField(5);
        checkButton = new JButton("Check");
        resultLabel = new JLabel("");

        add(titleLabel);
        add(inputLabel);
        add(inputField);
        add(checkButton);
        add(resultLabel);

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText().trim();

                try {
                    int num = Integer.parseInt(inputText);
                    boolean RSANumber = isRSANumber(num);
                    if (RSANumber) {
                        resultLabel.setText(num + " is an RSA number");
                    } else {
                        resultLabel.setText(num + " is not an RSA number");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText(" Input is Invalid. Please enter a valid number.");
                }
            }
        });
    }

    public boolean isRSANumber(int num) {
        if (num <= 1) {
            return false; // RSA number
        }

        int divisor = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisor++;
                if (divisor > 4) {
                    return false; // Not RSA Number
                }
            }
        }

        return divisor == 4;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RSACalculator app = new RSACalculator();
            app.setVisible(true);
        });
    }
}


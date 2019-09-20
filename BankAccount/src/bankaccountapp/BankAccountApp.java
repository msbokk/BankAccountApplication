package bankaccountapp;

import java.io.IOException;
import javax.swing.JFrame;

public class BankAccountApp {

    public static void main(String[] args) throws IOException {

        BankGui bGui = new BankGui();
        bGui.setBounds(0, 0, 700, 700);
        bGui.setTitle("Bank Management App");
        bGui.setResizable(false);
        bGui.setVisible(true);
        bGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

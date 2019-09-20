package bankaccountapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankGui extends javax.swing.JFrame {

    List<Account> accObjList = new LinkedList<Account>();

    List<String[]> newAccounts = new LinkedList<String[]>();
    Account selected;

    public BankGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pathButton = new javax.swing.JButton();
        pathText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfoTextArea = new javax.swing.JTextArea();
        destinationButton = new javax.swing.JButton();
        showButton = new javax.swing.JButton();
        nameText = new javax.swing.JTextField();
        adhaarText = new javax.swing.JTextField();
        accountTypeText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        initialDepositText = new javax.swing.JTextField();
        outPathText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        selectButton = new javax.swing.JButton();
        sNoText = new javax.swing.JTextField();
        amountText = new javax.swing.JTextField();
        depositButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        transferButton = new javax.swing.JButton();
        interestButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pathButton.setText("Load Records");
        pathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathButtonActionPerformed(evt);
            }
        });

        pathText.setText("C:\\\\Users\\\\Pc\\\\Downloads\\\\InputFile.txt");
        pathText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathTextActionPerformed(evt);
            }
        });

        InfoTextArea.setColumns(20);
        InfoTextArea.setRows(5);
        jScrollPane1.setViewportView(InfoTextArea);

        destinationButton.setText("Store Records");
        destinationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationButtonActionPerformed(evt);
            }
        });

        showButton.setText("Show Records");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        nameText.setText("Name");

        adhaarText.setText("Adhaar");
        adhaarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adhaarTextActionPerformed(evt);
            }
        });

        accountTypeText.setText("Account Type");
        accountTypeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTypeTextActionPerformed(evt);
            }
        });

        addButton.setText("Add Account");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        initialDepositText.setText("Initial Deposit");

        outPathText.setText("C:\\\\Users\\\\Pc\\\\Downloads\\\\OutputFile.txt");

        jLabel1.setText("Input File Path");

        jLabel2.setText("Output File Path");

        jLabel3.setText("Add an account to the records.");

        selectButton.setText("Select Account");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        sNoText.setText("S.No");
        sNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNoTextActionPerformed(evt);
            }
        });

        amountText.setText("Amount");

        depositButton.setText("Deposit");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        withdrawButton.setText("Withdraw");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        transferButton.setText("Transfer");
        transferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });

        interestButton.setText("Calculate Interest");
        interestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(interestButton)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectButton)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(depositButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(withdrawButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(transferButton)))))
                .addContainerGap(384, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositButton)
                    .addComponent(withdrawButton)
                    .addComponent(transferButton))
                .addGap(18, 18, 18)
                .addComponent(interestButton)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jLabel4.setText("Featrues for an Account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outPathText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pathText, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(destinationButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pathButton)
                                .addGap(18, 18, 18)
                                .addComponent(showButton)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adhaarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(accountTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(initialDepositText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addButton))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showButton)
                    .addComponent(jLabel1)
                    .addComponent(pathButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outPathText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationButton)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adhaarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initialDepositText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(348, 348, 348))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pathTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathTextActionPerformed

    }//GEN-LAST:event_pathTextActionPerformed

    private void pathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathButtonActionPerformed

        String path = pathText.getText();
        newAccounts = utilities.CSV.read(path);
        //String path = "C:\\Users\\Pc\\Downloads\\NewBankAccounts.csv";

        for (String[] accountHolders : newAccounts) {
            String name = accountHolders[0];
            String adhaar = accountHolders[1];
            String accountType = accountHolders[2];
            double initialDeposit = Double.parseDouble(accountHolders[3]);
            Account obj;
            if (accountType.equalsIgnoreCase("current")) {
                obj = new Current(name, adhaar, initialDeposit);
                accObjList.add(obj);
            } else if (accountType.equalsIgnoreCase("savings")) {
                obj = new Savings(name, adhaar, initialDeposit);
                accObjList.add(obj);
            } else {
                System.out.println("Error in reading AccountType.");
            }
        }
        InfoTextArea.setText("Data loaded from " + path + " Successfully!");


    }//GEN-LAST:event_pathButtonActionPerformed

    private void destinationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationButtonActionPerformed

        String destination = outPathText.getText();
        BufferedWriter fp;
        try {
            // fp = new BufferedWriter(new FileWriter("C:\\Users\\Pc\\Downloads\\OutputNewBankAccounts.txt"));
            fp = new BufferedWriter(new FileWriter(destination));
            for (Account acc : accObjList) {
                fp.write(acc.showInfo());
                fp.newLine();
                fp.write("-------------------------------------------");
                fp.newLine();
            }

            fp.close();
        } catch (IOException ex) {
            Logger.getLogger(BankGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        InfoTextArea.setText("Data written to " + destination + " Successfully!");
    }//GEN-LAST:event_destinationButtonActionPerformed

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Account acc : accObjList) {
            //InfoTextArea.setText(acc.showInfo());
            sb.append("\n" + "S.No. " + i + "\n" + acc.showInfo() + "\n" + "*********************" + "\n");
            i++;
        }
        InfoTextArea.setText(sb.toString());
    }//GEN-LAST:event_showButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String destination = pathText.getText();
        BufferedWriter fp;
        try {
            // fp = new BufferedWriter(new FileWriter("C:\\Users\\Pc\\Downloads\\OutputNewBankAccounts.txt"));
            fp = new BufferedWriter(new FileWriter(destination, true));

            fp.append(nameText.getText() + "," + adhaarText.getText() + "," + accountTypeText.getText() + "," + initialDepositText.getText());
            fp.newLine();

            fp.close();
        } catch (IOException ex) {
            Logger.getLogger(BankGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        InfoTextArea.setText("Data written to " + destination + " Successfully!");
    }//GEN-LAST:event_addButtonActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        int sNo = parseInt(sNoText.getText());
        selected = accObjList.get(sNo);
        InfoTextArea.setText(selected.showInfo());

    }//GEN-LAST:event_selectButtonActionPerformed

    private void sNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNoTextActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        selected.deposit(parseInt(amountText.getText()));

        InfoTextArea.setText(selected.showInfo() + "\n" + selected.showBalance() + amountText.getText() + "RS successfully deposited to your account");


    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        selected.withdraw(parseInt(amountText.getText()));
        InfoTextArea.setText(selected.showInfo() + "\n" + selected.showBalance() + amountText.getText() + "RS successfully withdrawn from your account");
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed
        selected.transfer("Jethalal", parseDouble(amountText.getText()));
        InfoTextArea.setText(selected.showInfo() + "\n" + selected.showBalance() + amountText.getText() + "RS successfully transferred to Jethalal");
    }//GEN-LAST:event_transferButtonActionPerformed

    private void interestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interestButtonActionPerformed

        InfoTextArea.setText(selected.showInfo() + "\n" + selected.interest() + "\n" + selected.showBalance());
    }//GEN-LAST:event_interestButtonActionPerformed

    private void adhaarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adhaarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adhaarTextActionPerformed

    private void accountTypeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTypeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTypeTextActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea InfoTextArea;
    private javax.swing.JTextField accountTypeText;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField adhaarText;
    private javax.swing.JTextField amountText;
    private javax.swing.JButton depositButton;
    private javax.swing.JButton destinationButton;
    private javax.swing.JTextField initialDepositText;
    private javax.swing.JButton interestButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField outPathText;
    private javax.swing.JButton pathButton;
    private javax.swing.JTextField pathText;
    private javax.swing.JTextField sNoText;
    private javax.swing.JButton selectButton;
    private javax.swing.JButton showButton;
    private javax.swing.JButton transferButton;
    private javax.swing.JButton withdrawButton;
    // End of variables declaration//GEN-END:variables
}

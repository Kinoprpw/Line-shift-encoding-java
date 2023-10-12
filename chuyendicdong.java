package test;

public class chuyendicdong extends javax.swing.JFrame {

    public chuyendicdong() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Plaintext = new javax.swing.JScrollPane();
        Plaintext1 = new javax.swing.JTextArea();
        Key1 = new javax.swing.JTextField();
        Ciphertext = new javax.swing.JTextField();
        Decryption = new javax.swing.JButton();
        Encryption = new javax.swing.JButton();
        Key2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chuyen Dich Dong");

        Plaintext1.setColumns(20);
        Plaintext1.setRows(5);
        Plaintext1.setText("chaocacbanminhtenlaminhne");
        Plaintext.setViewportView(Plaintext1);

        Key1.setText("human");

        Decryption.setText("Decryption");
        Decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptionActionPerformed(evt);
            }
        });

        Encryption.setText("Encryption");
        Encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptionActionPerformed(evt);
            }
        });

        Key2.setText("human");

        jButton1.setText("return Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Plaintext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Ciphertext, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Key1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Decryption)
                    .addComponent(Encryption)
                    .addComponent(Key2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plaintext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Encryption)))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ciphertext, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Key2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(Decryption)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptionActionPerformed
        String plaintext = Plaintext1.getText();
        String key = Key1.getText();
        String outputString = "";
        int row = plaintext.length() / key.length();
        int colum = key.length();
        if (plaintext.length() % key.length() == 0) {
            char matrix[][] = new char[row][colum];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    int k = i * 5;
                    matrix[i][j] = plaintext.charAt(k + j);
                }
            }
            for (char w = 'a'; w < 'z'; w++) {
                int a = key.indexOf(w);

                if (a != -1) {
                    for (int i = 0; i < row; i++) {
                        outputString += matrix[i][a];
                    }
                }

            }
            Ciphertext.setText(outputString);
    }//GEN-LAST:event_EncryptionActionPerformed
    }
    private void DecryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptionActionPerformed
        String ciphertext = Plaintext1.getText();
        String key = Key2.getText();
        String outputString = "";
        int row = ciphertext.length() / key.length();
        int colum = key.length();
        char matrix[][] = new char[row][colum];

        int j = 0;
        for (char w = 'a'; w < 'z'; w++) {

            int a = key.indexOf(w);//3
            //j=0
            if (a != -1) {
                int k = j * row;
                for (int i = 0; i < row; i++) {
                    matrix[i][a] = ciphertext.charAt(k + i);
                }
                j++;
            }
        }
        for (int i = 0; i < row; i++) {

            for (int b = 0; b < colum; b++) {
                outputString += matrix[i][b];
            }
        }

        Ciphertext.setText(outputString);
    }//GEN-LAST:event_DecryptionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menucipher cs = new Menucipher();
        cs.show();
        dispose();     
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chuyendicdong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ciphertext;
    private javax.swing.JButton Decryption;
    private javax.swing.JButton Encryption;
    private javax.swing.JTextField Key1;
    private javax.swing.JTextField Key2;
    private javax.swing.JScrollPane Plaintext;
    private javax.swing.JTextArea Plaintext1;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

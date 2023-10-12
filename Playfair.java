/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

/**
 *
 * @author pcong
 */
public class Playfair extends javax.swing.JFrame {

    /**
     * Creates new form Playfair
     */
    public Playfair() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Plaintext = new javax.swing.JTextArea();
        Key1 = new javax.swing.JTextField();
        Keygeneration1 = new javax.swing.JTextField();
        encryption = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Answer = new javax.swing.JTextArea();
        Keygeneration2 = new javax.swing.JTextField();
        decryption = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Key2 = new javax.swing.JTextField();
        generation = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PlayFair Cipher");

        Plaintext.setColumns(20);
        Plaintext.setRows(5);
        jScrollPane1.setViewportView(Plaintext);

        encryption.setText("Encryption");
        encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptionActionPerformed(evt);
            }
        });

        Answer.setColumns(20);
        Answer.setRows(5);
        jScrollPane2.setViewportView(Answer);

        decryption.setText("Decryption");
        decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptionActionPerformed(evt);
            }
        });

        jLabel1.setText("key");

        jLabel2.setText("key");

        generation.setText("Generation key");
        generation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generationActionPerformed(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton1)))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(encryption)
                                .addGap(18, 18, 18)
                                .addComponent(generation))
                            .addComponent(Key1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Keygeneration1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decryption)
                            .addComponent(Keygeneration2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Key2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Keygeneration1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encryption)
                    .addComponent(generation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Key2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Keygeneration2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(decryption)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptionActionPerformed
        String plaintext = Plaintext.getText();
        String key = Key1.getText();
        String play = "";
        String ciphertext = "";
        for (int i = 0; i < key.length(); i++) {
            if (play.indexOf(key.charAt(i)) == -1) {
                play += key.charAt(i);
            }
        }
        for (char w = 'a'; w <= 'z'; w++) {
            if (w == 'j') {
                continue;
            }
            if (play.indexOf(w) == -1) {
                play += w;
            }
        }
        int k = 0;
        char[][] matrix = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = play.charAt(k);
                k++;
            }
        }
        for (int i = 0; i < plaintext.length(); i += 2) {
            if (plaintext.charAt(i) == plaintext.charAt(i + 1)) {
                plaintext = plaintext.substring(0, i + 1) + 'x' + plaintext.substring(i + 1);
            }
            if (plaintext.length() % 2 != 0) {
                plaintext = plaintext + 'x';
            }
        }
        char c1, c2;
        int i1 = 0, j1 = 0, i2 = 0, j2 = 0;
        for (int z = 0; z < plaintext.length(); z += 2) {
            c1 = plaintext.charAt(z);
            c2 = plaintext.charAt(z + 1);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (matrix[i][j] == c1) {
                        i1 = i;
                        j1 = j;
                    }
                    if (matrix[i][j] == c2) {
                        i2 = i;
                        j2 = j;
                    }
                }
            }
            if (i1 == i2) {
                c1 = matrix[i1][(j1 + 1) % 5];
                c2 = matrix[i2][(j2 + 1) % 5];
            } else if (j1 == j2) {
                c1 = matrix[(i1 + 1) % 5][j1];
                c2 = matrix[(i2 + 1) % 5][j2];
            } else {
                c1 = matrix[i1][j2];
                c2 = matrix[i2][j1];
            }
            ciphertext = ciphertext + c1 + c2;
        }
        Answer.setText(ciphertext);
        Keygeneration1.setText(play);
    }//GEN-LAST:event_encryptionActionPerformed

    private void decryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptionActionPerformed
        String ciphertext = Plaintext.getText();
        String key = Key2.getText();
        String play="";
        String plaintext="";
        
        for(int i=0 ; i<key.length() ; i++)
        {
            if(play.indexOf(key.charAt(i)) == -1)
            {
             play += key.charAt(i);         
            }
        }
         
        for(char w='a' ; w<='z' ; w++)
        {
            if(w == 'j')
                continue;
            if(play.indexOf(w) == -1)
                play += w;
        }   
     
        int k=0;
        char[][] matrix = new char[5][5];
        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<5 ; j++)
            {
                matrix[i][j] = play.charAt(k);  
                k++;
            }
        }
        
        int i1=0,j1=0,i2=0,j2=0;
        char c1,c2;
        for(int z=0 ; z<ciphertext.length() ; z+=2)
        {
            c1 = ciphertext.charAt(z);
            c2 = ciphertext.charAt(z+1);

          
            for(int i=0 ; i<5 ; i++)
            {
                for(int j=0 ; j<5 ; j++)
                {
                     if(matrix[i][j] == c1)
                     {
                         i1 = i;
                         j1 = j;
                     }
                     if(matrix[i][j] == c2)
                     {
                         i2 = i;
                         j2 = j;
                     } 
                }
            }

            
            if(i1 == i2)
            {
                if(j1 == 0)
                    j1 = 5;
                if(j2 == 0)
                    j2 = 5;
                c1 = matrix[i1][j1-1];
                c2 = matrix[i2][j2-1];
            }
          
          else if(j1 == j2)
          {
              if(i1 == 0)
                  i1 = 5;
              if(i2 == 0)
                  i2 = 5;
              c1 = matrix[i1-1][j1];
              c2 = matrix[i2-1][j2];
          }

            
          else
          {
            c1 = matrix[i1][j2];
            c2 = matrix[i2][j1];
          }

        plaintext = plaintext+c1+c2;
      }
        Answer.setText(plaintext);
        Keygeneration2.setText(play);
    }//GEN-LAST:event_decryptionActionPerformed

    private void generationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generationActionPerformed
        String key=Key1.getText();
        String play="";
        for(int i=0 ; i<key.length() ; i++)
        {
            if(play.indexOf(key.charAt(i)) == -1)
            {
             play += key.charAt(i);         
            }
        }
         
        for(char w='a' ; w<='z' ; w++)
        {
            if(w == 'j')
                continue;
            if(play.indexOf(w) == -1)
                play += w;
        }  
    }//GEN-LAST:event_generationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Menucipher cs = new Menucipher();
        cs.show();
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Playfair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Playfair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Playfair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Playfair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Playfair().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Answer;
    private javax.swing.JTextField Key1;
    private javax.swing.JTextField Key2;
    private javax.swing.JTextField Keygeneration1;
    private javax.swing.JTextField Keygeneration2;
    private javax.swing.JTextArea Plaintext;
    private javax.swing.JButton decryption;
    private javax.swing.JButton encryption;
    private javax.swing.JButton generation;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}


package test;

public class Ceasar extends javax.swing.JFrame {

   
    public Ceasar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Plaintext = new javax.swing.JTextArea();
        Ciphertext = new javax.swing.JTextField();
        encryption = new javax.swing.JButton();
        decryption = new javax.swing.JButton();
        key1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        key2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ma hoa Cearsar");

        Plaintext.setColumns(20);
        Plaintext.setRows(5);
        jScrollPane1.setViewportView(Plaintext);

        encryption.setText("Encryption");
        encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptionActionPerformed(evt);
            }
        });

        decryption.setText("Decryption");
        decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptionActionPerformed(evt);
            }
        });

        jLabel1.setText("key");

        jButton1.setText("Return Menu");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Ciphertext)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encryption)
                    .addComponent(decryption)
                    .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(encryption)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ciphertext, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(decryption)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//ma hoa seacar
    private void encryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptionActionPerformed
       String answer = Plaintext.getText();
       int x = Integer.parseInt(key1.getText());
       String ciphertext="";
       for (int i = 0; i < answer.length(); i++) {
            char c = answer.charAt(i);

            if (isLetter(c)) {
                c = alphabet[(c - 'a' + x) % 26];
            }

            ciphertext += c;
        }
        Ciphertext.setText(ciphertext);
    }//GEN-LAST:event_encryptionActionPerformed
//giai ma ceasar
    private void decryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptionActionPerformed
        String answer = Plaintext.getText();//lay du lieu tu o plaintext(1)
       int x = Integer.parseInt(key2.getText());//chuyen kieu du lieu key sang so nguyen
       String plaintext="";//khoi tao bien tra ve 
        for (int i = 0; i < answer.length(); i++) {//duyet cac phan tu trong plaintext
            char c = answer.charAt(i);//lay phan tu thu "i" trong chuoi

            if (isLetter(c)) {
                c = alphabet[(c - 'a' - x + 26) % 26];//
            }
            plaintext+= c;
        }
        Ciphertext.setText(plaintext);
    }//GEN-LAST:event_decryptionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Menucipher cs = new Menucipher();
        cs.show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
   private static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z');
    }
    private static final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Ceasar().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ciphertext;
    private javax.swing.JTextArea Plaintext;
    private javax.swing.JButton decryption;
    private javax.swing.JButton encryption;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField key1;
    private javax.swing.JTextField key2;
    // End of variables declaration//GEN-END:variables
}

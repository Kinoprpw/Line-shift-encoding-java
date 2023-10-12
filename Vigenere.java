package test;

public class Vigenere extends javax.swing.JFrame {

    public Vigenere() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Answer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Plaintext = new javax.swing.JTextArea();
        Key1 = new javax.swing.JTextField();
        Encryption = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        KeyGeneration = new javax.swing.JTextField();
        Key2 = new javax.swing.JTextField();
        KeyGeneration1 = new javax.swing.JTextField();
        Decryption = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vegenere");

        Answer.setActionCommand("<Not Set>");

        Plaintext.setColumns(20);
        Plaintext.setRows(5);
        jScrollPane1.setViewportView(Plaintext);

        Encryption.setText("Encryption");
        Encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptionActionPerformed(evt);
            }
        });

        jLabel1.setText("Key");

        Decryption.setText("Decryption");
        Decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptionActionPerformed(evt);
            }
        });

        jLabel2.setText("Key");

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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Decryption)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(Encryption)
                                    .addGap(158, 158, 158))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(KeyGeneration, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(KeyGeneration1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Key1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Key2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(KeyGeneration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Encryption))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Key2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KeyGeneration1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(Decryption))
                    .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void EncryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptionActionPerformed

        String plaintext = Plaintext.getText();
        String ciphertext = ""; // Chuỗi chứa kết quả sau khi mã hóa
        String key1 = Key1.getText();
        String keygeneration = keyVigenere(plaintext, key1);

        KeyGeneration.setText(keygeneration);
        for (int i = 0; i < plaintext.length(); i++) { // duyệt qua từng kí tự chuỗi
            int x = (plaintext.charAt(i) + keygeneration.charAt(i)) % 26; // câu lệnh dùng để đảm bảo rằng kết qủa sẽ không vượt ra
            // khỏi phạm vi của bảng chữ cái Tiếng Anh
            x += 'A';// chuyển đổi số nguyên x thành ký tự tương ứng với bảng chữ cái tiếng anh
            ciphertext += (char) (x);// Ký tự mã hóa (được biểu diễn bằng x) được thêm vào chuỗi textEncrypt.
        }
        Answer.setText(ciphertext);


    }//GEN-LAST:event_EncryptionActionPerformed

    private void DecryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptionActionPerformed
        String plaintext = Plaintext.getText();
        String ciphertext = ""; // Chuỗi chứa kết quả sau khi mã hóa
        String key2 = Key2.getText();
        String keygeneration = keyVigenere(plaintext, key2);

        KeyGeneration1.setText(keygeneration);
        for (int i = 0; i < plaintext.length() && i < keygeneration.length(); i++) { // duyệt qua từng kí tự chuỗi
            int x = (plaintext.charAt(i) - keygeneration.charAt(i) + 26) % 26; // câu lệnh dùng để đảm bảo rằng kết qủa sẽ không vượt ra
            // khỏi phạm vi của bảng chữ cái Tiếng Anh
            x += 'A';// chuyển đổi số nguyên x thành ký tự tương ứng với bảng chữ cái tiếng anh
            ciphertext += (char) (x);// Ký tự mã hóa (được biểu diễn bằng x) được thêm vào chuỗi textEncrypt.
        }
        Answer.setText(ciphertext);
    }//GEN-LAST:event_DecryptionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menucipher cs = new Menucipher();
        cs.show();
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    // Phương thức này là dùng để tạo key có độ dài bằng với văn bản text

    static String keyVigenere(String text, String key) {

        int x = text.length();// Xd độ dài của đoạn text
        for (int i = 0;; i++) {// vòng lặp vô hạn để tạo key sao cho độ dài key sẽ bằng với đồ dài text
            if (x == i) // Khi i = x (độ dài của x) thì i sẽ đặt lại bằng 0
            {
                i = 0;
            }
            if (key.length() == text.length())// Vòng lặp sẽ dừng khi độ dài của từ khóa (biến key) bằng độ dài của
            // chuỗi văn bản
            {
                break;
            }
            key += (key.charAt(i));// Trong mỗi lần lặp, ký tự tại vị trí i trong từ khóa được thêm vào từ khóa
            // (key). Điều này sẽ tạo ra một từ khóa dài dần lên
        }
        return (key); // in ra key mới

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vigenere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JButton Decryption;
    private javax.swing.JButton Encryption;
    private javax.swing.JTextField Key1;
    private javax.swing.JTextField Key2;
    private javax.swing.JTextField KeyGeneration;
    private javax.swing.JTextField KeyGeneration1;
    private javax.swing.JTextArea Plaintext;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

package aula_31_10;

public class saboresDeSorvete extends javax.swing.JFrame {

    public saboresDeSorvete() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        titulo = new javax.swing.JLabel();
        confirmacao = new javax.swing.JButton();
        tamanhos = new javax.swing.JComboBox<>();
        sabores = new javax.swing.JComboBox<>();
        precoDoSorvete = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorveteria");

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titulo.setText("Sabores e tamanhos");

        confirmacao.setBackground(new java.awt.Color(51, 153, 255));
        confirmacao.setText("CONFIRMAR");

        tamanhos.setBackground(new java.awt.Color(102, 102, 102));
        tamanhos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------", "Pequeno", "Medio", "Grande" }));
        tamanhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoSomaDePreco(evt);
            }
        });

        sabores.setBackground(new java.awt.Color(102, 102, 102));
        sabores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------", "Chocolate", "Creme", "Morango", "Flocos", "Doce de leite" }));

        precoDoSorvete.setText("Preço: R$ 00,00");

        jLabel1.setText("Tamanho:");

        jLabel2.setText("Sabor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sabores, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tamanhos, 0, 97, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(titulo)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precoDoSorvete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sabores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamanhos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(precoDoSorvete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 52, Short.MAX_VALUE)
                .addComponent(confirmacao)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tamanhoSomaDePreco(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoSomaDePreco
        // TODO add your handling code here:
        String preco = tamanhos.getItemAt(tamanhos.getSelectedIndex());

        if(preco.equals("Pequeno")){
            preco = "10,00";
        }else if(preco.equals("Medio")){
            preco = "20,00";
        }else if(preco.equals("Grande")){
            preco = "30,00";
        }else{
            preco = "00,00";
        }
        precoDoSorvete.setText("Preço: R$ "+ preco);
    }//GEN-LAST:event_tamanhoSomaDePreco

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirmacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel precoDoSorvete;
    private javax.swing.JComboBox<String> sabores;
    private javax.swing.JComboBox<String> tamanhos;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

}


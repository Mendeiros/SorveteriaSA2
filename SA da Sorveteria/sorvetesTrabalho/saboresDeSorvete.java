package sorvetesTrabalho;

import java.awt.Image;
import javax.swing.ImageIcon;

public class saboresDeSorvete extends javax.swing.JFrame {

    static String sabor = "";
    static String tamanho = "";

    public saboresDeSorvete() {
        initComponents();
    }
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
        imagemSorvete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorveteria");
        setResizable(false);

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titulo.setText("Sabores e tamanhos");

        confirmacao.setBackground(new java.awt.Color(51, 153, 255));
        confirmacao.setText("CONFIRMAR");
        confirmacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmacaoActionPerformed(evt);
            }
        });

        tamanhos.setBackground(new java.awt.Color(102, 102, 102));
        tamanhos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------", "Pequeno", "Medio", "Grande" }));
        tamanhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoSomaDePreco(evt);
            }
        });

        sabores.setBackground(new java.awt.Color(102, 102, 102));

        sabores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------", "Chocolate", "Creme", "Morango", "Flocos", "Doce de leite" }));
        sabores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saboresActionPerformed(evt);
            }
        });

        precoDoSorvete.setText("Preço: R$ 00,00");

        jLabel1.setText("Tamanho:");

        jLabel2.setText("Sabor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imagemSorvete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(142, 142, 142))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confirmacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precoDoSorvete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tamanhos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(sabores, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sabores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamanhos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(imagemSorvete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(precoDoSorvete)
                .addGap(12, 12, 12)
                .addComponent(confirmacao)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tamanhoSomaDePreco(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoSomaDePreco
        // TODO add your handling code here:
        String preco = tamanhos.getItemAt(tamanhos.getSelectedIndex());

        System.out.println(tamanho + "\n");

        if (preco.equals("Pequeno")) {
            preco = "10,00";
            tamanho = "Pequeno";
            //imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas_rosario\\Downloads\\chocolateP.png"));
        } else if (preco.equals("Medio")) {
            preco = "20,00";
            tamanho = "Medio";
        } else if (preco.equals("Grande")) {
            preco = "30,00";
            tamanho = "Grande";
        } else {
            preco = "00,00";
            
        }

        System.out.println(tamanho + "\n");
        
        System.out.println(sabor + "\n" + tamanho);
        
        if (tamanho.equals("Pequeno")) {

            if (sabor.equals("Chocolate")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\chocolateP.png"));
            } else if (sabor.equals("Creme")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\cremeP.png"));
            } else if (sabor.equals("Morango")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\morangoP.png"));
            } else if (sabor.equals("Flocos")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\flocosP.png"));
            } else if (sabor.equals("Doce de leite")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\doceDeLeiteP.png"));
            }

        } else if (tamanho.equals("Medio")) {

            if (sabor.equals("Chocolate")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\chocolateM.png"));
            } else if (sabor.equals("Creme")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\cremeM.png"));
            } else if (sabor.equals("Morango")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\morangoM.png"));
            } else if (sabor.equals("Flocos")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\flocosM.png"));
            } else if (sabor.equals("Doce de leite")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\doceDeLeiteM.png"));
            }

        } else if (tamanho.equals("Grande")) {

            if (sabor.equals("Chocolate")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\chocolateG.png"));
            } else if (sabor.equals("Creme")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\cremeG.png"));
            } else if (sabor.equals("Morango")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\morangoG.png"));
            } else if (sabor.equals("Flocos")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\flocosG.png"));
            } else if (sabor.equals("Doce de leite")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\doceDeLeiteG.png"));
            }
        }

        precoDoSorvete.setText("Preço: R$ " + preco);
    }//GEN-LAST:event_tamanhoSomaDePreco

    private void saboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saboresActionPerformed

        String saborEscolhido = sabores.getItemAt(sabores.getSelectedIndex());
        
        if (saborEscolhido.equals("Chocolate")) {
            sabor = "Chocolate";
        } else if (saborEscolhido.equals("Creme")) {
            sabor = "Creme";
        } else if (saborEscolhido.equals("Morango")) {
            sabor = "Morango";
        } else if (saborEscolhido.equals("Flocos")) {
            sabor = "Flocos";
        } else if (saborEscolhido.equals("Doce de leite")) {
            sabor = "Doce de leite";
        }
        System.out.println(saborEscolhido + "\n");
        
        System.out.println(sabor + "\n" + tamanho);
        
        if (tamanho.equals("Pequeno")) {

            if (sabor.equals("Chocolate")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\chocolateP.png"));
            } else if (sabor.equals("Creme")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\cremeP.png"));
            } else if (sabor.equals("Morango")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\morangoP.png"));
            } else if (sabor.equals("Flocos")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\flocosP.png"));
            } else if (sabor.equals("Doce de leite")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\doceDeLeiteP.png"));
            }

        } else if (tamanho.equals("Medio")) {

            if (sabor.equals("Chocolate")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\chocolateM.png"));
            } else if (sabor.equals("Creme")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\cremeM.png"));
            } else if (sabor.equals("Morango")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\morangoM.png"));
            } else if (sabor.equals("Flocos")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\flocosM.png"));
            } else if (sabor.equals("Doce de leite")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\doceDeLeiteM.png"));
            }

        } else if (tamanho.equals("Grande")) {

            if (sabor.equals("Chocolate")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\chocolateG.png"));
            } else if (sabor.equals("Creme")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\cremeG.png"));
            } else if (sabor.equals("Morango")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\morangoG.png"));
            } else if (sabor.equals("Flocos")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\flocosG.png"));
            } else if (sabor.equals("Doce de leite")) {
                imagemSorvete.setIcon(new javax.swing.ImageIcon("C:\\Documentos\\NetBeansProjects\\Aula_31_10\\src\\imagens\\doceDeLeiteG.png"));
            }
        }
    }//GEN-LAST:event_saboresActionPerformed

    private void confirmacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmacaoActionPerformed

    }//GEN-LAST:event_confirmacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirmacao;
    private javax.swing.JLabel imagemSorvete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel precoDoSorvete;
    private javax.swing.JComboBox<String> sabores;
    private javax.swing.JComboBox<String> tamanhos;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gescom;

import java.awt.Color;

/**
 *
 * @author JeffrickTenefeut
 */
public class approvisionnement extends javax.swing.JPanel {

    /**
     * Creates new form approvisionnement
     */
    public approvisionnement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantité = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        prixUnitaire = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        Annuler = new javax.swing.JButton();
        Calculer = new javax.swing.JButton();
        total = new javax.swing.JLabel();
        Enregistrer = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(807, 717));
        setMinimumSize(new java.awt.Dimension(807, 717));
        setPreferredSize(new java.awt.Dimension(807, 717));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 155, 228));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enregistrement d'un approvisionnement");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(78, 155, 228));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sable Calabraise", "Sable Carrière", "Sable Rivière", "Ciment" }));
        jComboBox1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 155, 228));
        jLabel2.setText("Element");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(78, 155, 228));
        jLabel3.setText("Quantité");

        quantité.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(78, 155, 228));
        jLabel4.setText("Prix unitaire");

        prixUnitaire.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        prixUnitaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prixUnitaireActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(78, 155, 228));
        jLabel5.setText("Date d'approvisionnement");

        jDateChooser1.setBackground(new java.awt.Color(78, 155, 228));
        jDateChooser1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jDateChooser1.setFocusable(false);
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(78, 155, 228));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(78, 155, 228));
        jLabel6.setText("Montant total");

        Annuler.setBackground(new java.awt.Color(255, 255, 255));
        Annuler.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Annuler.setForeground(new java.awt.Color(76, 155, 228));
        Annuler.setText("Valider");
        Annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnnulerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AnnulerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AnnulerMouseExited(evt);
            }
        });
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });

        Calculer.setBackground(new java.awt.Color(255, 255, 255));
        Calculer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Calculer.setForeground(new java.awt.Color(76, 155, 228));
        Calculer.setText("Annuler");
        Calculer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CalculerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CalculerMouseExited(evt);
            }
        });
        Calculer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculerActionPerformed(evt);
            }
        });

        total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        total.setForeground(new java.awt.Color(78, 155, 228));

        Enregistrer.setBackground(new java.awt.Color(255, 255, 255));
        Enregistrer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Enregistrer.setForeground(new java.awt.Color(76, 155, 228));
        Enregistrer.setText("Enregistrer");
        Enregistrer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnregistrerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EnregistrerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EnregistrerMouseExited(evt);
            }
        });
        Enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 302, Short.MAX_VALUE)
                            .addComponent(prixUnitaire, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                    .addComponent(quantité)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(Calculer, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(Enregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantité, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prixUnitaire, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calculer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(Enregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prixUnitaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixUnitaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prixUnitaireActionPerformed

    private void AnnulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnnulerMouseClicked
        // TODO add your handling code here:
        if(prixUnitaire.getText().length()<3||quantité.getText().length()<1){
            ajoutErreur ajer=new ajoutErreur();
            ajer.setVisible(true);
        }else{
            Integer unitaire=Integer.parseInt(prixUnitaire.getText());
            Integer quantite=Integer.parseInt(quantité.getText());
            Integer totale=unitaire * quantite;
            total.setText(totale+"FCFA");
        }
        
    }//GEN-LAST:event_AnnulerMouseClicked

    private void AnnulerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnnulerMouseEntered
        // TODO add your handling code here:
        Annuler.setBackground(new Color(76,155,228));
        Annuler.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_AnnulerMouseEntered

    private void AnnulerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnnulerMouseExited
        // TODO add your handling code here:
        Annuler.setForeground(new Color(76,155,228));
        Annuler.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_AnnulerMouseExited

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AnnulerActionPerformed

    private void CalculerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculerMouseEntered
        // TODO add your handling code here:
        Calculer.setBackground(new Color(76,155,228));
        Calculer.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_CalculerMouseEntered

    private void CalculerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculerMouseExited
        // TODO add your handling code here:
        Calculer.setForeground(new Color(76,155,228));
        Calculer.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CalculerMouseExited

    private void CalculerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculerActionPerformed
        // TODO add your handling code here:
        prixUnitaire.setText("");
        quantité.setText("");
        total.setText("");
    }//GEN-LAST:event_CalculerActionPerformed

    private void EnregistrerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnregistrerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EnregistrerMouseClicked

    private void EnregistrerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnregistrerMouseEntered
        // TODO add your handling code here:
        Enregistrer.setBackground(new Color(76,155,228));
        Enregistrer.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_EnregistrerMouseEntered

    private void EnregistrerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnregistrerMouseExited
        // TODO add your handling code here:
        Enregistrer.setForeground(new Color(76,155,228));
        Enregistrer.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_EnregistrerMouseExited

    private void EnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnregistrerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnregistrerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JButton Calculer;
    private javax.swing.JButton Enregistrer;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField prixUnitaire;
    private javax.swing.JTextField quantité;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}

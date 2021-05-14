package buchfuehrungDBA;
import java.util.ArrayList; // import the ArrayList class
public class StartGUI extends javax.swing.JFrame {

    private ArrayList<String> kontenListe; 
    private Buchungssatz einBuchungsatz = new Buchungssatz();
    private Konto einKonto = new Konto();
    
    public StartGUI() {
        initComponents();
    }
    
    public void aktualisiereComboboxen() {};
    public Konto findeKonto(int kontoNr){
        return null;
    };

// Create an ArrayList object
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGUIUeberschrift = new javax.swing.JLabel();
        lblKontenverwaltungUeberschrift = new javax.swing.JLabel();
        lblKontoNr = new javax.swing.JLabel();
        txtKontoNr = new javax.swing.JTextField();
        lblKontoBezeichnung = new javax.swing.JLabel();
        txtKontoBezeichnung = new javax.swing.JTextField();
        btnAlleKontenAnzeigen = new javax.swing.JButton();
        btnKontoAnlegen = new javax.swing.JButton();
        btnKontoSuchen = new javax.swing.JButton();
        btnKontoLoeschen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txbKontenverwaltungAusgabe = new javax.swing.JTextArea();
        lblBuchungenUeberschrift = new javax.swing.JLabel();
        lblKontoSoll = new javax.swing.JLabel();
        cboSollkonto = new javax.swing.JComboBox();
        cboHabenkonto = new javax.swing.JComboBox();
        txtBuchungsbetrag = new javax.swing.JTextField();
        btnBuchungDurchfuehren = new javax.swing.JButton();
        lblMeldung = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txbBuchungenMeldung = new javax.swing.JTextArea();
        lblGrundbuch = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txbBuchungenGrundbuch = new javax.swing.JTextArea();
        lblHauptbuch = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txbBuchungenHauptbuch = new javax.swing.JTextArea();
        lblKontoHaben = new javax.swing.JLabel();
        lblBuchungsbetrag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("remoTec - Finanzbuchhaltung");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGUIUeberschrift.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblGUIUeberschrift.setText("remoTec GmbH - Finanzbuchhaltung");
        getContentPane().add(lblGUIUeberschrift, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblKontenverwaltungUeberschrift.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblKontenverwaltungUeberschrift.setText("Kontenverwaltung");
        getContentPane().add(lblKontenverwaltungUeberschrift, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        lblKontoNr.setText("Kontonummer");
        getContentPane().add(lblKontoNr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));
        getContentPane().add(txtKontoNr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 80, 30));

        lblKontoBezeichnung.setText("Kontobezeichnung");
        getContentPane().add(lblKontoBezeichnung, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));
        getContentPane().add(txtKontoBezeichnung, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 180, 30));

        btnAlleKontenAnzeigen.setText("Konten anzeigen");
        btnAlleKontenAnzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlleKontenAnzeigenActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlleKontenAnzeigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 650, 30));

        btnKontoAnlegen.setText("Konto anlegen");
        btnKontoAnlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKontoAnlegenActionPerformed(evt);
            }
        });
        getContentPane().add(btnKontoAnlegen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 110, 40));

        btnKontoSuchen.setText("Konto suchen");
        btnKontoSuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKontoSuchenActionPerformed(evt);
            }
        });
        getContentPane().add(btnKontoSuchen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 110, 40));

        btnKontoLoeschen.setText("Konto löschen");
        btnKontoLoeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKontoLoeschenActionPerformed(evt);
            }
        });
        getContentPane().add(btnKontoLoeschen, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 110, 40));

        txbKontenverwaltungAusgabe.setColumns(20);
        txbKontenverwaltungAusgabe.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txbKontenverwaltungAusgabe.setRows(5);
        jScrollPane1.setViewportView(txbKontenverwaltungAusgabe);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 650, 450));

        lblBuchungenUeberschrift.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBuchungenUeberschrift.setText("Buchungen");
        getContentPane().add(lblBuchungenUeberschrift, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, -1, -1));

        lblKontoSoll.setText("Sollkonto");
        getContentPane().add(lblKontoSoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, -1, -1));

        getContentPane().add(cboSollkonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 160, 30));

        getContentPane().add(cboHabenkonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 160, 30));
        getContentPane().add(txtBuchungsbetrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 120, 80, 30));

        btnBuchungDurchfuehren.setText("Buchung durchführen");
        btnBuchungDurchfuehren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuchungDurchfuehrenActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuchungDurchfuehren, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 640, 30));

        lblMeldung.setText("Meldung");
        getContentPane().add(lblMeldung, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, -1, -1));

        txbBuchungenMeldung.setColumns(20);
        txbBuchungenMeldung.setRows(5);
        jScrollPane3.setViewportView(txbBuchungenMeldung);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 640, 50));

        lblGrundbuch.setText("GRUNDBUCH");
        getContentPane().add(lblGrundbuch, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, -1));

        txbBuchungenGrundbuch.setColumns(20);
        txbBuchungenGrundbuch.setRows(5);
        jScrollPane4.setViewportView(txbBuchungenGrundbuch);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 640, 50));

        lblHauptbuch.setText("HAUPTBUCH");
        getContentPane().add(lblHauptbuch, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, -1, -1));

        txbBuchungenHauptbuch.setColumns(20);
        txbBuchungenHauptbuch.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txbBuchungenHauptbuch.setRows(5);
        jScrollPane2.setViewportView(txbBuchungenHauptbuch);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 640, 270));

        lblKontoHaben.setText("Habenkonto");
        getContentPane().add(lblKontoHaben, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, -1, -1));

        lblBuchungsbetrag.setText("Buchungsbetrag");
        getContentPane().add(lblBuchungsbetrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuchungDurchfuehrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuchungDurchfuehrenActionPerformed

    }//GEN-LAST:event_btnBuchungDurchfuehrenActionPerformed

    private void btnKontoLoeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKontoLoeschenActionPerformed

    }//GEN-LAST:event_btnKontoLoeschenActionPerformed

    private void btnKontoSuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKontoSuchenActionPerformed

    }//GEN-LAST:event_btnKontoSuchenActionPerformed

    private void btnAlleKontenAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlleKontenAnzeigenActionPerformed

    }//GEN-LAST:event_btnAlleKontenAnzeigenActionPerformed

    private void btnKontoAnlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKontoAnlegenActionPerformed

    }//GEN-LAST:event_btnKontoAnlegenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new StartGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlleKontenAnzeigen;
    private javax.swing.JButton btnBuchungDurchfuehren;
    private javax.swing.JButton btnKontoAnlegen;
    private javax.swing.JButton btnKontoLoeschen;
    private javax.swing.JButton btnKontoSuchen;
    private javax.swing.JComboBox cboHabenkonto;
    private javax.swing.JComboBox cboSollkonto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblBuchungenUeberschrift;
    private javax.swing.JLabel lblBuchungsbetrag;
    private javax.swing.JLabel lblGUIUeberschrift;
    private javax.swing.JLabel lblGrundbuch;
    private javax.swing.JLabel lblHauptbuch;
    private javax.swing.JLabel lblKontenverwaltungUeberschrift;
    private javax.swing.JLabel lblKontoBezeichnung;
    private javax.swing.JLabel lblKontoHaben;
    private javax.swing.JLabel lblKontoNr;
    private javax.swing.JLabel lblKontoSoll;
    private javax.swing.JLabel lblMeldung;
    private javax.swing.JTextArea txbBuchungenGrundbuch;
    private javax.swing.JTextArea txbBuchungenHauptbuch;
    private javax.swing.JTextArea txbBuchungenMeldung;
    private javax.swing.JTextArea txbKontenverwaltungAusgabe;
    private javax.swing.JTextField txtBuchungsbetrag;
    private javax.swing.JTextField txtKontoBezeichnung;
    private javax.swing.JTextField txtKontoNr;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tarea2;

import java.util.StringTokenizer;

/**
 *
 * @author keila
 */
public class ProgramacionII extends javax.swing.JFrame {

    /**
     * Creates new form ProgramacionII
     */
    
    String texto = "";
    
    public ProgramacionII() {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_Manejo = new javax.swing.JLabel();
        lbl_ingrese = new javax.swing.JLabel();
        btn_procesar = new javax.swing.JButton();
        lbl_longitud = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        lbl_primer = new javax.swing.JLabel();
        lbl_RepeticionesA = new javax.swing.JLabel();
        lbl_RepeticionesE = new javax.swing.JLabel();
        lbl_RepeticionesI = new javax.swing.JLabel();
        lbl_Primera = new javax.swing.JLabel();
        lbl_ultima = new javax.swing.JLabel();
        lbl_letra = new javax.swing.JLabel();
        lbl_Palabracentral = new javax.swing.JLabel();
        lbl_ultimapalabra = new javax.swing.JLabel();
        lbl_RepeticionesO = new javax.swing.JLabel();
        lbl_RepeticionesU = new javax.swing.JLabel();
        lbl_Palabrascantidadimpar = new javax.swing.JLabel();
        lbl_Palabrascantidadpar = new javax.swing.JLabel();
        lbl_Manejo1 = new javax.swing.JLabel();
        txt_ingreso = new java.awt.TextArea();
        txt_murcielago = new java.awt.TextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Manejo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Manejo.setText("MANEJO DE CADENAS");

        lbl_ingrese.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_ingrese.setText(" Ingrese un texto o abra un archivo");

        btn_procesar.setText("Procesar");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        lbl_longitud.setText("Longitud del texto:");

        lbl_total.setText("Total de palabras: ");
        lbl_total.setToolTipText("");

        lbl_primer.setText("Primer letra del texto: ");

        lbl_RepeticionesA.setText("Repeticion de A, a, á:");

        lbl_RepeticionesE.setText("Repeticion de E, e, é:");

        lbl_RepeticionesI.setText("Repeticion de I, i, í:");

        lbl_Primera.setText("Primer palabra del texto");

        lbl_ultima.setText("Ultima letra del texto:");

        lbl_letra.setText("Letra central del texto: ");

        lbl_Palabracentral.setText("Palabra central del texto:");

        lbl_ultimapalabra.setText("Ultima palabra del texto");

        lbl_RepeticionesO.setText("Repeticion de O, o, ó:");

        lbl_RepeticionesU.setText("Repeticion de U, u, u:");

        lbl_Palabrascantidadimpar.setText("Palabras con cantidad de caracater impar");

        lbl_Palabrascantidadpar.setText("Palabras con cantidad de caracater par");

        lbl_Manejo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Manejo1.setText("Traduccion a Clave Murcielago");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(lbl_Manejo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ultimapalabra)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_longitud)
                                            .addComponent(lbl_total)
                                            .addComponent(lbl_primer)
                                            .addComponent(lbl_letra)
                                            .addComponent(lbl_Primera)))
                                    .addComponent(lbl_Palabracentral)
                                    .addComponent(lbl_ultima))
                                .addGap(254, 254, 254)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Palabrascantidadimpar)
                                    .addComponent(lbl_Palabrascantidadpar)
                                    .addComponent(lbl_RepeticionesO)
                                    .addComponent(lbl_RepeticionesE)
                                    .addComponent(lbl_RepeticionesA)
                                    .addComponent(lbl_RepeticionesI)
                                    .addComponent(lbl_RepeticionesU)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(lbl_Manejo1)))
                .addContainerGap(356, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btn_procesar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ingrese))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txt_murcielago, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Manejo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ingrese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_procesar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_longitud)
                    .addComponent(lbl_RepeticionesA))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_total)
                    .addComponent(lbl_RepeticionesE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_primer)
                    .addComponent(lbl_RepeticionesI))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_RepeticionesO)
                    .addComponent(lbl_ultima))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbl_letra)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Primera))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbl_RepeticionesU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_Palabrascantidadpar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Palabrascantidadimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Palabracentral)
                .addGap(22, 22, 22)
                .addComponent(lbl_ultimapalabra)
                .addGap(12, 12, 12)
                .addComponent(lbl_Manejo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_murcielago, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Abrir");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar como");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem5.setText("Copiar");
        jMenu2.add(jMenuItem5);

        jMenuItem7.setText("Cortar");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Pegar");
        jMenu2.add(jMenuItem8);

        jMenuItem6.setText("Buscar");
        jMenu2.add(jMenuItem6);

        jMenuItem4.setText("Reemplazar");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        texto =  txt_ingreso.getText();
        
        //Longitud del texto
        lbl_longitud.setText("Longitud del texto: " + texto.length());        
        
        //Cantidad de palabras
        StringTokenizer st = new StringTokenizer(texto);
        String[] palabras = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            palabras[i] = st.nextToken();
            i++;
        }
        lbl_total.setText("Total de palabras: " + palabras.length);
        
        
        //Primer letra
        lbl_primer.setText("Primer letra del texto: " + texto.charAt(0));
        
        //Ultimo letra
        lbl_ultima.setText("Ultima letra del texto: " + texto.charAt(texto.length() - 1));
        
        //Central letra
        lbl_letra.setText("Letra central del texto: " + texto.charAt(texto.length() / 2));
        
        //Primer Palabra
        lbl_Primera.setText("Primer palabra del texto: " + palabras[0]);
        
        //Ultimo Palabra
        lbl_ultimapalabra.setText("Ultima palabra del texto: " + palabras[palabras.length - 1]);
        
        //Central Palabra
        lbl_Palabracentral.setText("Palabra central del texto: " + palabras[palabras.length / 2]);
        
        
        //Recorre texto para buscar palabras
       int contador_a = 0; 
       int contador_e = 0; 
       int contador_i = 0; 
       int contador_o = 0; 
       int contador_u = 0; 
       
       char caracter;
        for (i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i) ;
            
            switch (Character.toLowerCase(caracter)) {
                case 'a' -> contador_a++;
                case 'e' -> contador_e++;
                case 'i' -> contador_i++;
                case 'o' -> contador_o++;
                case 'u' -> contador_u++;
                case 'á' -> contador_a++;
                case 'é' -> contador_e++;
                case 'í' -> contador_i++;
                case 'ó' -> contador_o++;
                case 'ú' -> contador_u++;
                default -> {
                }
            }
        }
        
        //A
        lbl_RepeticionesA.setText("Repeticion de A, a, á: " + contador_a);
        //B
        lbl_RepeticionesE.setText("Repeticion de E, e, é: " + contador_e);
        //C
        lbl_RepeticionesI.setText("Repeticion de I, i, í: " + contador_i);
        //D
        lbl_RepeticionesO.setText("Repeticion de O, o, ó: " + contador_o);
        //E
        lbl_RepeticionesU.setText("Repeticion de U, u, u: " + contador_u);
        
        
        //Palabras de caracatres
        String palabra_par = "";
        String palabra_impar = "";
        
        for (String palabra : palabras) {
            int longitud = palabra.length();
            
            if (longitud % 2 == 0) {
                palabra_par += palabra + ", ";
            } else {
                palabra_impar += palabra + ", ";
            }
        }
        
        //PAR
        lbl_Palabrascantidadpar.setText("Palabras con cantidad de caracater par: " + palabra_par);
        //IMPAR
        lbl_Palabrascantidadimpar.setText("Palabras con cantidad de caracater impar: " + palabra_impar);
        
        
        //TEXTO MURICIELAGO
        StringBuilder resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char nuevaLetra = (char) ((c - 'a' + 1) % 26 + 'a');
                resultado.append(nuevaLetra);
            } else {
                resultado.append(c);
            }
        }
     
        txt_murcielago.setText(resultado.toString());
    }//GEN-LAST:event_btn_procesarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ProgramacionII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramacionII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramacionII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramacionII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramacionII().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_procesar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Manejo;
    private javax.swing.JLabel lbl_Manejo1;
    private javax.swing.JLabel lbl_Palabracentral;
    private javax.swing.JLabel lbl_Palabrascantidadimpar;
    private javax.swing.JLabel lbl_Palabrascantidadpar;
    private javax.swing.JLabel lbl_Primera;
    private javax.swing.JLabel lbl_RepeticionesA;
    private javax.swing.JLabel lbl_RepeticionesE;
    private javax.swing.JLabel lbl_RepeticionesI;
    private javax.swing.JLabel lbl_RepeticionesO;
    private javax.swing.JLabel lbl_RepeticionesU;
    private javax.swing.JLabel lbl_ingrese;
    private javax.swing.JLabel lbl_letra;
    private javax.swing.JLabel lbl_longitud;
    private javax.swing.JLabel lbl_primer;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_ultima;
    private javax.swing.JLabel lbl_ultimapalabra;
    private java.awt.TextArea txt_ingreso;
    private java.awt.TextArea txt_murcielago;
    // End of variables declaration//GEN-END:variables
}

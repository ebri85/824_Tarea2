/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Codorniz;
import Clases.Descuento;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author esau_br
 */
public class Principal extends javax.swing.JFrame {
    
    public Codorniz[] codornices;
    public int polluelos, adultos, jovenes, cantH,cantSacosP,cantSacosJ,cantSacosA;
    public double costoP =0-0 ,costoA=0.0, costoJ =0.0 ,totalS=0.0,totalC=0.0, desc = 0.00 ;
    /**
     * Creates new form Principal
     * 
     * 
     * 
     */
    
    
    public Principal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        Contenedor1 = new javax.swing.JPanel();
        ContenedorInput = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_cantPolluelos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_cantJovenes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_cantAdultos = new javax.swing.JTextField();
        txt_cantHuevos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ContenedorOutput = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtML_resultado = new javax.swing.JTextArea();
        btn_calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        jLabel1.setText("CodorSoft 2.0");

        Contenedor1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ContenedorInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel2.setText("Cantidad de Codornices");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel3.setText("Polluelos: ");

        txt_cantPolluelos.setName("txt_Polluelos"); // NOI18N

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel4.setText("Jovenes: ");

        txt_cantJovenes.setName("txt_Polluelos"); // NOI18N

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel5.setText("Adultos: ");

        txt_cantAdultos.setName("txt_Polluelos"); // NOI18N

        txt_cantHuevos.setName("txt_Polluelos"); // NOI18N

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel6.setText("Huevos: ");

        javax.swing.GroupLayout ContenedorInputLayout = new javax.swing.GroupLayout(ContenedorInput);
        ContenedorInput.setLayout(ContenedorInputLayout);
        ContenedorInputLayout.setHorizontalGroup(
            ContenedorInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorInputLayout.createSequentialGroup()
                .addGroup(ContenedorInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContenedorInputLayout.createSequentialGroup()
                        .addContainerGap(53, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(ContenedorInputLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(ContenedorInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cantHuevos)
                            .addComponent(txt_cantAdultos)
                            .addComponent(txt_cantJovenes)
                            .addComponent(txt_cantPolluelos))))
                .addGap(50, 50, 50))
        );
        ContenedorInputLayout.setVerticalGroup(
            ContenedorInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorInputLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(ContenedorInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cantPolluelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_cantJovenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_cantAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(ContenedorInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cantHuevos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        ContenedorOutput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel7.setText("Resultado e Informacion");

        txtML_resultado.setBackground(new java.awt.Color(159, 184, 236));
        txtML_resultado.setColumns(20);
        txtML_resultado.setRows(5);
        txtML_resultado.setName("resultados"); // NOI18N
        jScrollPane2.setViewportView(txtML_resultado);

        javax.swing.GroupLayout ContenedorOutputLayout = new javax.swing.GroupLayout(ContenedorOutput);
        ContenedorOutput.setLayout(ContenedorOutputLayout);
        ContenedorOutputLayout.setHorizontalGroup(
            ContenedorOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorOutputLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        ContenedorOutputLayout.setVerticalGroup(
            ContenedorOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorOutputLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_calcular.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btn_calcular.setText("CALCULAR");
        btn_calcular.setToolTipText("");
        btn_calcular.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Contenedor1Layout = new javax.swing.GroupLayout(Contenedor1);
        Contenedor1.setLayout(Contenedor1Layout);
        Contenedor1Layout.setHorizontalGroup(
            Contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Contenedor1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Contenedor1Layout.createSequentialGroup()
                        .addComponent(ContenedorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ContenedorOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        Contenedor1Layout.setVerticalGroup(
            Contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Contenedor1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(Contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContenedorOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContenedorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Contenedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      public String ImprimeMensaje()
      {
        String mensaje= "";
        
        mensaje+= "Cantidad de Codornices Polluelos = " + polluelos + "\n" +
                "Cantidad de Sacos = " + cantSacosP + "\n" +
                "Costo  =  ₡" + costoP  + "\n";
       
        mensaje+= "Cantidad de Codornices Jovenes = " + jovenes + "\n" +
                "Cantidad de Sacos = " + cantSacosJ + "\n" +
                "Costo  =  ₡" + costoJ + "\n";
        
        mensaje+= "Cantidad de Codornices Adultos = " + adultos + "\n" +
                "Cantidad de Sacos = " + cantSacosA + "\n" +
                "Costo  =  ₡" + costoA + "\n";  
        
        mensaje += "Costo Total sin Descuento =  ₡" + totalS + "\n";
        mensaje += "Costo Total con Descuento =  ₡" + totalC + "\n";
        
                
        return mensaje;
      }
    
    
    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        /*Este Metodo Calcula todo segun los datos ingresados
        
        */
        Descuento descuento;
        GeneraTipoCodornices(codornices);
        
        String mensaje ="";
        
        try 
          {
            polluelos   = Integer.parseInt(txt_cantPolluelos.getText());
            jovenes     = Integer.parseInt(txt_cantJovenes.getText());
            adultos     = Integer.parseInt(txt_cantAdultos.getText());
            cantH       = Integer.parseInt(txt_cantHuevos.getText());

            descuento = new Descuento(cantH);
            desc = descuento.getDescuento();
            
            cantSacosP = CantidadSacos(polluelos);
            cantSacosJ = CantidadSacos(jovenes);
            cantSacosA = CantidadSacos(adultos);
            
            costoP = CalculaCosto(cantSacosP,1,codornices);
            costoJ = CalculaCosto(cantSacosJ, 1, codornices);
            costoA = CalculaCosto(cantSacosA, 1, codornices);
           
            totalS = costoP + costoJ + costoA;
            totalC = totalS -(totalS * desc);    
            
            
           
             txtML_resultado.setText(ImprimeMensaje());
             
            
          } catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR" , JOptionPane.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_btn_calcularActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
 
    }
    
 
    
     public static int CantidadSacos(int cantCodor)
               /*realiza el calculo de sacos, tomando en consideracion la cantidad de
               codornices */
       {
           double consumo =0.5; //consume saco c/u codornices
           
           double resultado;
           
           resultado = (cantCodor%2 ==0)? (cantCodor * consumo) : ((cantCodor*consumo)+consumo);
           
             
           return (int)resultado;
           
       }
     
     public static double CalculaCosto(int cantSacos,int pos, Codorniz[] c)
       {
         double resultado;
         double precio;
         
            switch(pos)
              {
                case 1 :
                    precio = c[0].getPrecioAlimento();
                    
                    resultado = cantSacos * precio;
                    
                    break;
                    
                case 2 :
                    precio = c[1].getPrecioAlimento();
                    
                    resultado = cantSacos * precio;
                    
                    break;
                    
                case 3 :
                    precio = c[2].getPrecioAlimento();
                    
                    resultado = cantSacos * precio;                    
       
              }
                 
         
         return 0;
       }
       
        public static void GeneraTipoCodornices(Codorniz[] c)
        {
            c[0] = new Codorniz(1, "Polluelo", "Crecimiento", 15840);
            c[1] = new Codorniz(2, "Joven", "Desarrollo", 30045);
            c[2] = new Codorniz(3, "Adulto", "Mantenimiento", 43200);
            
        }
        
        
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor1;
    private javax.swing.JPanel ContenedorInput;
    private javax.swing.JPanel ContenedorOutput;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtML_resultado;
    private javax.swing.JTextField txt_cantAdultos;
    private javax.swing.JTextField txt_cantHuevos;
    private javax.swing.JTextField txt_cantJovenes;
    private javax.swing.JTextField txt_cantPolluelos;
    // End of variables declaration//GEN-END:variables
}

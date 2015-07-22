/*
 * jdVentaFinalizada.java
 *
 * Created on 18 de mayo de 2008, 19:40
 */

package interfaz;
import persistenciaBD.Venta;
/**
 *
 * @author  genar
 */
public class jdVentaFinalizada extends javax.swing.JDialog {

    
    /** Creates new form jdVentaFinalizada */
    public jdVentaFinalizada(Venta v,java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tfVenta.setText(v.getCodVenta());
        tfCliente.setText(v.getCodCliente().getCodCliente());
        total.setText(String.valueOf(v.getTotal()));
        iva.setText(String.valueOf(v.getIva()));
        recargo.setText(String.valueOf(v.getRecargoEquivalencia()));
        importe.setText(String.valueOf(v.getImporte()));
    }

    jdVentaFinalizada(Venta v) {
        initComponents();
        tfVenta.setText(v.getCodVenta());
        tfCliente.setText(v.getCodCliente().getCodCliente());
        total.setText(String.valueOf(v.getTotal()));
        iva.setText(String.valueOf(v.getIva()));
        recargo.setText(String.valueOf(v.getRecargoEquivalencia()));
        importe.setText(String.valueOf(v.getImporte()));
        this.setVisible(true);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfVenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        recargo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        importe = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("CodVenta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("La venta se ha realizado correctamente");

        jLabel3.setText("Cliente");

        tfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setText("Total");

        total.setFont(new java.awt.Font("Tahoma", 1, 18));
        total.setForeground(new java.awt.Color(51, 255, 51));
        total.setText("0,0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel6.setText("€");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel7.setText("IVA");

        iva.setFont(new java.awt.Font("Tahoma", 1, 18));
        iva.setForeground(new java.awt.Color(51, 255, 51));
        iva.setText("0,0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel9.setText("€");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel10.setText("Recargo equivalencia");

        recargo.setFont(new java.awt.Font("Tahoma", 1, 18));
        recargo.setForeground(new java.awt.Color(51, 255, 51));
        recargo.setText("0,0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel12.setText("€");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel13.setText("Importe total:");

        importe.setFont(new java.awt.Font("Tahoma", 1, 18));
        importe.setForeground(new java.awt.Color(51, 255, 51));
        importe.setText("0,0");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel15.setText("€");

        jButton1.setText("Imprimir factura");
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfVenta))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                                    .addComponent(iva)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                                    .addComponent(total)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                                    .addComponent(recargo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel12))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                                    .addComponent(importe)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel15)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton1)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(iva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(recargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(importe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClienteActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
/**class MiPrintable implements Printable 
{
   public int print (Graphics g, PageFormat f, int pageIndex) 
   {
      if (pageIndex == 0) 
      {
         // Imprime "Hola mundo" en la primera pagina, en la posicion 100,100
         g.drawString("Hola mundo", 100,100);
         return PAGE_EXISTS;
      }
      else
         return NO_SUCH_PAGE;
   }
}
    PrinterJob job = PrinterJob.getPrinterJob();
job.setPrintable( new MiPrintable());
try 
{
   job.print();
} 
catch (PrinterException e) 
{
   e.printStackTrace();
}
// Diálogo para elegir el formato de impresión
PageFormat pageFormat = new PageFormat();
pageFormat=job.pageDialog(pageFormat);

// Diálogo para confirmar impresion.
// Devuelve true si el usuario decide imprimir.
if (job.printDialog())
   job.print();

**/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel importe;
    private javax.swing.JLabel iva;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel recargo;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfVenta;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
    
}
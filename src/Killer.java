/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Killer.java
 *
 * Created on 09.Nis.2010, 18:03:01
 */

/**
 *
 * @author Baran
 */
public class Killer extends javax.swing.JFrame {

    /** Creates new form Killer */
    public Killer() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Kill!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 40, 150, 23);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 80, 300, 180);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-338)/2, 416, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Runtime rt = Runtime.getRuntime();
        String[] killWPargs = {"TASKKILL", "/IM", "notepad.exe"};

        try {
            Process kill = rt.exec(killWPargs);
            kill.waitFor();

            jTextArea1.setText("Process exit code: " + kill.exitValue());
            jTextArea1.append("\n0 means OK!\n");
            //System.exit(0);
            }
            catch (java.io.IOException e) {
        jTextArea1.setText("IOException: " + e);
        //System.exit(1);
        }
        catch (InterruptedException e) {
        jTextArea1.setText("InterruptedException: " + e);
        //System.exit(1);
}

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Killer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}

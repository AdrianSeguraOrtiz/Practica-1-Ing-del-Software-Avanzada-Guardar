package trabajo;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import trabajo.TrabajoControladorG;
import trabajo.TrabajoVistaPanelG;

public class TrabajoPrincipalG {
	public static void main(String[] args){
		Runnable rr = new Runnable(){
				public void run ( ) {
					
					JFrame ventana = new JFrame ("Ventana");
					
					TrabajoVistaPanelG tvp = new TrabajoVistaPanelG();
					TrabajoControladorG tc = new TrabajoControladorG(tvp);
					
					tvp.getbBuscar().addActionListener(tc);
					tvp.getbGuardar().addActionListener(tc);
					
					ventana.getContentPane().add(tvp);
					
					ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ventana.pack();
					ventana.setExtendedState(Frame.MAXIMIZED_BOTH);
					ventana.setVisible(true);			
				}
		};
		SwingUtilities.invokeLater(rr);
	}
}

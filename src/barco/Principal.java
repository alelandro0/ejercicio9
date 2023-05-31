package barco;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Barco b;
      int opt = 0;
      HashMap<Integer, Barco> map= new HashMap<>();
     do {
		opt=Integer.parseInt(JOptionPane.showInputDialog("**MENU**\n\n"+"1) Listar o Salir\n"+"2) Registrar\n\n"));
         if (opt==2) {
          b = new Barco();
   	      map.put(b.getCodigo(), b);
		}

	} while (opt!=1);
  do {
	opt=Integer.parseInt(JOptionPane.showInputDialog("**MENU**\n\n"+"1) Salir\n"+"2) Listar \n\n"));
  
 if (opt!=1) {
for (Map.Entry<Integer, Barco> entry : map.entrySet()) {
	Integer key = entry.getKey();
	Barco val = entry.getValue();
	JOptionPane.showMessageDialog(null, "Codigo: "+key+"\nInformacion: "+val.toString());}}
} while (opt!=1); 
	

	}
	

}

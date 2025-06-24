/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegarhora.data;

// Importações para exibir data formatada
import java.text.SimpleDateFormat;
import java.util.Calendar;

// Importações para exibir data do sistema
import java.util.Date;

public class PegarHoraData {    
    
    public static void main(String[] args) {
        
        // Data e hora formatada
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("Data e Hora: Formatada");
        System.out.println(timeStamp);
        
        System.out.print('\n'); // Salta uma linha
        
        // Data e hora do sistema
        Date data = new Date(); // Criando um objeto 'data'
        System.out.println("Data e Hora: Sitema");
	System.out.println(data);
    }
    
}

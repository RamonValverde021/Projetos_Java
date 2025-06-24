package construtorarray;

import java.util.Random;

public class ConstrutorArray {

    public static void main(String[] args) {

        Baterias bat[] = new Baterias[100]; // Iniciando um objeto com a classe Baterias criada em outro arquivo

        bat[0] = new Baterias("Duracel", "AA", 'r', 1.5f, 2500);
        bat[1] = new Baterias("Raiovac", "AAA", 'c', 1.5f, 1200);
        bat[2] = new Baterias("Elgin", "CR2032", 'l', 3.0f, 225);
        bat[3] = new Baterias("Parasonic", "D", 'c', 1.5f, 15000);
        bat[4] = new Baterias("Energizer", "A23", 'a', 12.0f, 55);
        bat[5] = new Baterias("Sony", "PP3", 'c', 9.0f, 580);

        bat[6] = new Baterias("Duracel", "AA", 'a', 1.5f, 2500);
        bat[7] = new Baterias("Duracel", "AAA", 'a', 1.5f, 1200);
        bat[8] = new Baterias("Duracel", "CR2032", 'l', 3.0f, 225);
        bat[9] = new Baterias("Duracel", "D", 'a', 1.5f, 15000);
        bat[10] = new Baterias("Duracel", "A23", 'a', 12.0f, 55);
        bat[11] = new Baterias("Duracel", "PP3", 'a', 9.0f, 580);

        bat[12] = new Baterias("Raiovac", "AA", 'c', 1.5f, 2500);
        bat[13] = new Baterias("Raiovac", "AAA", 'c', 1.5f, 1200);
        bat[14] = new Baterias("Raiovac", "CR2032", 'l', 3.0f, 225);
        bat[15] = new Baterias("Raiovac", "D", 'c', 1.5f, 15000);
        bat[16] = new Baterias("Raiovac", "A23", 'c', 12.0f, 55);
        bat[17] = new Baterias("Raiovac", "PP3", 'c', 9.0f, 580);

        bat[18] = new Baterias("Elgin", "AA", 'c', 1.5f, 2500);
        bat[19] = new Baterias("Elgin", "AAA", 'c', 1.5f, 1200);
        bat[20] = new Baterias("Elgin", "CR2032", 'l', 3.0f, 225);
        bat[21] = new Baterias("Elgin", "D", 'c', 1.5f, 15000);
        bat[22] = new Baterias("Elgin", "A23", 'c', 12.0f, 55);
        bat[23] = new Baterias("Elgin", "PP3", 'c', 9.0f, 580);

        bat[24] = new Baterias("Sony", "AA", 'a', 1.5f, 2500);
        bat[25] = new Baterias("Sony", "AAA", 'a', 1.5f, 1200);
        bat[26] = new Baterias("Sony", "CR2032", 'l', 3.0f, 225);
        bat[27] = new Baterias("Sony", "D", 'a', 1.5f, 15000);
        bat[28] = new Baterias("Sony", "A23", 'a', 12.0f, 55);
        bat[29] = new Baterias("Sony", "PP3", 'a', 9.0f, 580);

        for (int c = 0; c < 6; c++) {
            System.out.println("Bateria: " + c);
            bat[c].status();
        }
        
        Comparacoes testes = new Comparacoes(); // Iniciando um objeto com a classe Comparacoes criada em outro arquivo
        Random aleatorio = new Random();

        for (int c = 0; c < 10; c++) {
            int b1 = aleatorio.nextInt(30);
            int b2 = aleatorio.nextInt(30);
            System.out.println("Bat 01: " + b1 + "  - Bat 02: " + b2);
            testes.modelosComparador(bat[b1], bat[b2]);
        }
        
    }

}

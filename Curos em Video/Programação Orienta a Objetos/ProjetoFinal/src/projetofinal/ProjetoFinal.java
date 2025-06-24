package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {

        Video videos[] = new Video[4]; //(titulo, avaliacao, views, curtidas, reproduzindo)
        videos[0] = new Video("Aula 01 Python", 5, 102568, 157, false);
        videos[1] = new Video("Robotica 01", 8, 1025, 12, true);
        videos[2] = new Video("Como fazer torta de maça", 2, 568, 23, false);
        videos[3] = new Video("Flow Podcast - Empreendedorismo", 6, 1578903, 569, true);
        videos[2].play();
        videos[1].pause();
        videos[3].like();

        Gafanhoto gaf[] = new Gafanhoto[4]; // (nome, idade, sexo, experiencia, login, totAssistido)
        gaf[0] = new Gafanhoto("Tony", 15, 'M', 55.5f, "Stark33", 98);
        gaf[1] = new Gafanhoto("Bruce", 14, 'M', 34.8f, "HulkEsmaga", 22);
        gaf[2] = new Gafanhoto("Maria", 16, 'F', 7.5f, "KGBePica", 100);
        gaf[3] = new Gafanhoto("Natasha", 13, 'F', 43.7f, "Shield123", 55);
        gaf[2].ganharExp(12.4f);
        gaf[1].viuMaisUm();

        Visualizacao vis[] = new Visualizacao[3]; // (Gafanhoto, Video)
        vis[0] = new Visualizacao(gaf[0], videos[3]);
        vis[1] = new Visualizacao(gaf[1], videos[2]);
        vis[2] = new Visualizacao(gaf[3], videos[1]);
        vis[0].avaliar();
        vis[1].avaliar(6);
        vis[2].avaliar(35.7f);

        for (int c = 0; c < vis.length; c++) {
            System.out.println(vis[c].toString());
            System.out.println("------------------------------------------------" + '\n');
        }

        /*
         for (int c = 0; c < videos.length; c++) {
            System.out.println(videos[c].toString());
            System.out.println("------------------------------------------------" + '\n');
        }
        
        for (int c = 0; c < gaf.length; c++) {
            System.out.println(gaf[c].toString());
            System.out.println("------------------------------------------------" + '\n');
        }
        
        for (int c = 0; c < vis.length; c++) {
            System.out.println(vis[c].toString());
            System.out.println("------------------------------------------------" + '\n');
        }
         */
    }
}

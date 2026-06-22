
package aula14;


public class Aula14 {

    
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Video de php");
        v[1] = new Video("Video de ia");
        v[2] = new Video("Video de testes");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("nicolau", 32, "masculino", "juca");
        g[1] = new Gafanhoto("tonto", 18, "muito macho", "lolly");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[1] = new Visualizacao(g[0], v[1]);
        
        
        System.out.println(vis[0].toString());
        /*System.out.println("======== VIDEOS ===========");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("=========GAFANHOTOS=========");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
        
    }
    
}

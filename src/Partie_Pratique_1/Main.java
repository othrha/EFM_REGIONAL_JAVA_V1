package Partie_Pratique_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        Article a=new Article(0,200.0);

        ArticleEnSolde s = new ArticleEnSolde(1,150.0,50);
        Magasin m=new Magasin();
        m.ajouter(a);
        System.out.println(s);
    }
}
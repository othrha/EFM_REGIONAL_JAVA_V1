package Partie_Pratique_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Magasin {
    ArrayList<Article> articlex = new ArrayList<>();


    public int indiceDe(int code){

        int indice = 0 ;
        for (Article a : articlex){
            if (a.code==code)
                return indice;
            indice++;
        }
        return -1;
    }
    public void ajouter(Article a) throws IOException {

        if (articlex.contains(a))
            throw new IOException("L'article appartient deja au magasin");
        articlex.add(a);
    }
    public boolean supprimer(int code){
        for (Article a : articlex){
            if (a.code==code) {
                articlex.remove(a);
                return true;
            }
        }
        return false;
    }
    public boolean supprimer(Article a){

        if (articlex.contains(a)) return false;
        articlex.remove(a);
        return true;
    }
    public int nombreArticlesEnSolde(){

        return articlex.size();
    }

    public void enregistrer(String chemin) throws IOException {
        FileWriter fichier = new FileWriter(chemin);
        fichier.write(articlex.toString());
        fichier.close();
    }
}

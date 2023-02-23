package Partie_Pratique_1;

public class Article {
    int code;
    Double prix;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Article(int code, Double prix) {
        this.code = code;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Article{" +
                "code=" + code +
                "; prix_origine=" + prix +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article article)) return false;
        return code == article.code ;
    }

    public Double prixArticle(){
        return prix;
    }
}

package classesauxiliares;

public class scoreClasse {
    int score;
    String nome;

    public scoreClasse(int score, String nome) {
        this.score = score;
        this.nome = nome;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

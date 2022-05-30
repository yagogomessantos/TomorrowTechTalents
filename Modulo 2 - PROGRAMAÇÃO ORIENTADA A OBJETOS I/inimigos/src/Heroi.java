public class Heroi {

    private String nome;
    private int vida;
    private boolean isDead;

    Heroi() {
        this.vida = 100;
        this.isDead = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private boolean verificaSeEstaMorto() {
        if (vida > 0) {
            this.isDead = false;
            return isDead;
        }
        this.isDead = true;
        return isDead;


    }

    public void apanhar(int dano) {
        if (!this.verificaSeEstaMorto()) {
            this.vida -= dano;
        }
        verificaSeEstaMorto();
    }
}

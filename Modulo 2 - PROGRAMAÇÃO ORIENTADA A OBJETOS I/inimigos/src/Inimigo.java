public abstract class Inimigo {

    protected int vida;

    public abstract void atacar(Heroi heroi);

    public abstract void apanhar(int dano, Ataque ataque);

    public abstract void interagir();


}

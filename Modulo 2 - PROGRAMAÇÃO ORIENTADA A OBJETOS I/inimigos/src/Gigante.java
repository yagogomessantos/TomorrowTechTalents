public class Gigante extends Inimigo {


    @Override
    public void atacar(Heroi heroi) {
        heroi.apanhar(25);
        System.out.println("Causou 25 de dano");
        System.out.println("Seu personagem está atordoado");
    }

    @Override
    public void apanhar(int dano, Ataque ataque) {
        System.out.println("Recebeu " + dano + " de dano ");
    }

    @Override
    public void interagir() {
        System.out.println("Me desculpe");
    }
}

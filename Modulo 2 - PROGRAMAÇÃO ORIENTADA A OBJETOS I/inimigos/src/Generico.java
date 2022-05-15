public class Generico extends Inimigo {


    @Override
    public void atacar() {
        System.out.println("Causou 10 de dano");
    }

    @Override
    public void apanhar(int dano) {
        System.out.println("Recebeu " + dano + " de dano");
    }

    @Override
    public void interagir() {
        System.out.println("Por que eu responderia meu inimigo???");
    }
}

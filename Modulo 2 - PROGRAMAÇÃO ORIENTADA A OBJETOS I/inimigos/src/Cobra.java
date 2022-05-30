public class Cobra extends Inimigo {


    @Override
    public void atacar(Heroi heroi) {
        System.out.println("Causou 10 de dano");
        System.out.println("Seu personagem está envenenado");
    }

    @Override
    public void apanhar(int dano,Ataque ataque) {
        System.out.println("Recebeu " + dano + " de dano");
    }

    @Override
    public void interagir() {
        System.out.println("Se você acender a chama a maldição acaba");
    }
}

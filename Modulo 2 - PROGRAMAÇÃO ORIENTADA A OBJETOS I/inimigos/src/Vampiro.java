public class Vampiro extends Inimigo {


    @Override
    public void atacar() {
        System.out.println("Causou 20 de dano");
        System.out.println("Seu personagem está sangrando");

    }

    @Override
    public void apanhar(int dano) {
        System.out.println("Recebe " + dano + " de dano");
    }

    @Override
    public void interagir() {
        System.out.println("O que é um homem?");
    }
}

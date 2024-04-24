public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para " + volume);

    }

    public void diminuirVolume() {
        volume--;
        System.out.println("abaixando o volume para " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("você mudou o canal para : " + canal);
    }

    public void ligar() {
        ligada = true;
        System.out.println("A tv está ligada. ");
    }

    public void desligar() {
        ligada = true;
    }
}

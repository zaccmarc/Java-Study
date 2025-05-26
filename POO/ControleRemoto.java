package POO;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50; // Volume inicial
        this.ligado = false; // Inicialmente desligado
        this.tocando = false; // Inicialmente não tocando
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos sobrescritos da interface Controlador

    @Override
    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("O controle remoto foi ligado.");
        } else {
            System.out.println("O controle remoto já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("O controle remoto foi desligado.");
        } else {
            System.out.println("O controle remoto já está desligado.");
        }
    }

    @Override
    public void maisVolume() {
        if (this.ligado) {
            if (this.volume < 100) {
                this.volume++;
                System.out.println("Volume aumentado para: " + this.volume);
            } else {
                System.out.println("Volume já está no máximo.");
            }
        } else {
            System.out.println("Não é possível aumentar o volume com o controle desligado.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.ligado) {
            if (this.volume > 0) {
                this.volume--;
                System.out.println("Volume diminuído para: " + this.volume);
            } else {
                System.out.println("Volume já está no mínimo.");
            }
        } else {
            System.out.println("Não é possível diminuir o volume com o controle desligado.");
        }
    }

    @Override
    public void play() {
        if (this.ligado && !this.tocando) {
            this.tocando = true;
            System.out.println("Reprodução iniciada.");
        } else if (!this.ligado) {
            System.out.println("Não é possível reproduzir com o controle desligado.");
        } else {
            System.out.println("Já está reproduzindo.");
        }
    }

    @Override
    public void pause() {
        if (this.ligado && this.tocando) {
            this.tocando = false;
            System.out.println("Reprodução pausada.");
        } else if (!this.ligado) {
            System.out.println("Não é possível pausar com o controle desligado.");
        } else {
            System.out.println("Já está pausado.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.ligado && this.volume > 0) {
            this.volume = 0;
            System.out.println("Mudo ativado.");
        } else if (!this.ligado) {
            System.out.println("Não é possível ativar o mudo com o controle desligado.");
        } else {
            System.out.println("O controle já está no mudo.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.ligado && this.volume == 0) {
            this.volume = 50; // Valor padrão ao desligar o mudo
            System.out.println("Mudo desativado. Volume restaurado para: " + this.volume);
        } else if (!this.ligado) {
            System.out.println("Não é possível desativar o mudo com o controle desligado.");
        } else {
            System.out.println("O controle não está no mudo.");
        }
    }

    @Override
    public void abrirMenu() {
        if (this.ligado) {
            System.out.println("----- MENU -----");
            System.out.println("Está ligado? " + (this.ligado ? "Sim" : "Não"));
            System.out.println("Está tocando? " + (this.tocando ? "Sim" : "Não"));
            System.out.println("Volume: " + this.volume);
            for (int i = 0; i < this.volume; i += 10) {
                System.out.print("|");
            }
            System.out.println("\n----------------");
        } else {
            System.out.println("Não é possível abrir o menu com o controle desligado.");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.ligado) {
            System.out.println("Fechando menu...");
        } else {
            System.out.println("Não é possível fechar o menu com o controle desligado.");
        }
    }
}

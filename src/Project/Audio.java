package Project;

public class Audio extends ElementoMulti implements Riproduci {
    private int durata;
    private int volume;

    public Audio(String tit, int durata, int volume) {
        super(tit);
        this.durata = durata;
        this.volume = volume;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(title + " " + "!".repeat(volume));
        }
    }
}

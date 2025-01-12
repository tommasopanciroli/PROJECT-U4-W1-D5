package Project;

public class Immagine extends ElementoMulti {
    private int luminosità;

    public Immagine(String title, int lumi) {
        super(title);
        this.luminosità = lumi;
    }

    public void aumentaLumi() {
        luminosità++;
    }

    public void diminuisciLumi() {
        if (luminosità > 0) {
            luminosità--;
        }
    }

    public void mostra() {
        System.out.println(title + " " + "*".repeat(luminosità));
    }
}

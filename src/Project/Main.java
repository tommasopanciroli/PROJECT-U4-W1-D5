package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ElementoMulti[] elementiMulti = new ElementoMulti[5];

        for (int i = 0; i < elementiMulti.length; i++) {
            System.out.println("Inserisci elemento (1.Immagine 2.Video 3.Audio)");
            int type = myScanner.nextInt();
            System.out.println("Inserisci un titolo");
            String title = myScanner.nextLine();

            switch (type) {
                case 1:
                    System.out.println("Scegli la luminosità");
                    int lumiImmagine = myScanner.nextInt();
                    elementiMulti[i] = new Immagine(title, lumiImmagine);
                    break;
                case 2:
                    System.out.println("Scegli la durata");
                    int durVideo = myScanner.nextInt();
                    System.out.println("Scegli il volume");
                    int volVideo = myScanner.nextInt();
                    System.out.println("Scegli la luminosità");
                    int lumiVideo = myScanner.nextInt();
                    elementiMulti[i] = new Video(title, durVideo, lumiVideo, volVideo);
                    break;
                case 3:
                    System.out.println("Scegli la durata");
                    int durAudio = myScanner.nextInt();
                    System.out.println("Scegli il volume");
                    int volAudio = myScanner.nextInt();
                    elementiMulti[i] = new Audio(title, durAudio, volAudio);
                    break;
            }
        }

        while (true) {
            System.out.println("Scegli l'elemento che vuoi eseguire (1-5) oppure scegli 0 per eliminare");
            int choose = myScanner.nextInt();
            if (choose == 0) {
                break;
            } else if (choose > 1 && choose <= 5) {
                ElementoMulti element = elementiMulti[choose - 1];
                if (element instanceof Immagine) {
                    ((Immagine) element).mostra();
                } else if (element instanceof Riproduci) {
                    ((Riproduci) element).play();
                }
            } else {
                System.out.println("Scelta non valida");
            }
        }
        myScanner.close();
    }
}

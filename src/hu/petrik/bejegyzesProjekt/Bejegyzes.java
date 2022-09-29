package hu.petrik.bejegyzesProjekt;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Bejegyzes {

    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom, int likeok, LocalDateTime letrejott, LocalDateTime szerkesztve) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
    }

}


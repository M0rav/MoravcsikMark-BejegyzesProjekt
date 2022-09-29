package hu.petrik.bejegyzesProjekt;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Bejegyzes {

    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom) {// ,int likeok, LocalDateTime letrejott, LocalDateTime szerkesztve
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    public int getLikeok() {
        return likeok;
    }

    public void setLikeok(int likeok) {
        this.likeok = likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public void setLetrejott(LocalDateTime letrejott) {
        this.letrejott = letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void setSzerkesztve(LocalDateTime szerkesztve) {
        this.szerkesztve = szerkesztve;
        if (szerkesztve!=letrejott){
            letrejott = szerkesztve;
        }
    }
    public void like(){
        likeok++;
    }

    @Override
    public String toString() {
        return "Bejegyzes{" +
                "szerzo='" + szerzo + '\'' +
                ", likeok=" + likeok +
                ", letrejott=" + letrejott +


                ", szerkesztve=" + szerkesztve +
                ", tartalom='" + tartalom + '\'' +

                '}';
    }
}


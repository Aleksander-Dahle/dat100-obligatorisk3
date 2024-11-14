package no.hvl.dat100.oppgave3;

import no.hvl.dat100.oppgave1.*;

public class Blogg {

    private Innlegg[] inleggtabell;
    private int nesteledig;

    public Blogg() {
        this.inleggtabell = new Innlegg[20];
        this.nesteledig = 0;
    }

    public Blogg(int lengde) {
        this.inleggtabell = new Innlegg[lengde];
        this.nesteledig = 0;
    }

    public int getAntall() {
        return nesteledig;
    }

    public Innlegg[] getSamling() {
        return inleggtabell;
    }

    public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteledig; i++) {
            if (inleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
    }

    public boolean finnes(Innlegg innlegg) {
        return finnInnlegg(innlegg) >= 0;
    }

    public boolean ledigPlass() {
        return nesteledig < inleggtabell.length;
    }

    public boolean leggTil(Innlegg innlegg) {
        if (finnes(innlegg)) {
            return false;
        }
        if (ledigPlass()) {
            inleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nesteledig).append("\n");
        for (int i = 0; i < nesteledig; i++) {
            sb.append(inleggtabell[i].toString()).append("\n");
        }
        return sb.toString().trim();
    }

  
}

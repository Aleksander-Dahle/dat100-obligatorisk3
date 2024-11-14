package no.hvl.dat100.oppgave1;


	 
public class Innlegg {
    private int id;
    private String bruker;
    private String dato;
    private int likes;

   
    public Innlegg(int id, String bruker, String dato, int likes) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
    }

   
    public Innlegg(int id, String bruker, String dato) {
        this(id, bruker, dato, 0); 
    }

  
    public int getId() {
        return id;
    }

    public String getBruker() {
        return bruker;
    }

    public String getDato() {
        return dato;
    }

    public int getLikes() {
        return likes;
    }

   
    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void doLike() {
        this.likes++;
    }
    
    public boolean erLik(Innlegg innlegg) {
        return this.id == innlegg.getId();
    }

    
    public String toString() {
        return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
    }
}
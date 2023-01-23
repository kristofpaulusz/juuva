package main;

public class Ember {
    private String nev, cim;
    private int kor;
    
    public Ember(String nev, String cim, int kor) {
        this(nev+"&"+cim+"&"+kor);
    }
    public Ember(String sor) {
        this(sor, "&");
    }
    public Ember(String sor, String sep) {
    String[] s = sor.split(sep);
        this.nev = s[0];
        this.cim = s[1];
        this.kor = Integer.parseInt(s[2]);
    
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    public int getKor() {
        return kor;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }
    
}

package dinmeret;

import java.text.DateFormat;
import java.util.Date;
//import java.util.List;

public class Fuvar {
    private int taxi_id, idotartam;
    private String indulas;
    private double viteldij, tavolsag, borravalo;
    private String fizetes_modja;

    public Fuvar(int taxi_id, int idotartam, String indulas, double viteldij, double tavolsag, double borravalo, String fizetes_modja) {
        this.taxi_id = taxi_id;
        this.idotartam = idotartam;
        this.indulas = indulas;
        this.viteldij = viteldij;
        this.tavolsag = tavolsag;
        this.borravalo = borravalo;
        this.fizetes_modja = fizetes_modja;
    }
    public Fuvar(String sor) {
        String[] s = sor.split(";");
        this.taxi_id = Integer.parseInt(s[0]);
        this.indulas = s[1];
        this.idotartam = Integer.parseInt(s[2]);
                        
        this.viteldij = Double.parseDouble(s[3]);
        this.tavolsag = Double.parseDouble(s[4]);
        this.borravalo = Double.parseDouble(s[5]);
        this.fizetes_modja = s[6];
    }

    public String getFizetes_modja() {
        return fizetes_modja;
    }

    @Override
    public String toString() {
        return "Fuvar{" + "taxi_id=" + taxi_id + ", indulas=" + indulas +", idotartam=" + idotartam +  ", viteldij=" + viteldij + ", tavolsag=" + tavolsag + ", borravalo=" + borravalo + ", fizetes_modja=" + fizetes_modja + '}';
    }

}

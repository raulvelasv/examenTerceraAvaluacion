package examenTerceraAvaluacion;
import java.util.*;
public class Pantalan {
    private String id;
    private ArrayList<Amarre> listAmarre;
    private String tipo;
    
    public Pantalan() {
    }

    public Pantalan(String id, ArrayList<Amarre> listAmarre, String tipo) {
        this.id = id;
        this.listAmarre = listAmarre;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Amarre> getListAmarre() {
        return listAmarre;
    }

    public void setListAmarre(ArrayList<Amarre> listAmarre) {
        this.listAmarre = listAmarre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pantalan [id=" + id + ", listAmarre=" + listAmarre + ", tipo=" + tipo + "]";
    }
    
    
    
}

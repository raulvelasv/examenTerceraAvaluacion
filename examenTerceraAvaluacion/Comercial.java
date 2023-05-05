package examenTerceraAvaluacion;


public class Comercial extends Barco {
    private String carga;

    public Comercial() {
        
    }
    public Comercial(String matricula, String nombre, float tamaño, String carga) {
        super(matricula, nombre, tamaño);
        this.carga = carga;
    }
    public String getCarga() {
        return carga;
    }
    public void setCarga(String carga) {
        this.carga = carga;
    }
    @Override
    public String toString() {
        return "Comercial [carga=" + carga + "]";
    }
    public boolean encajaTipo(Pantalan pantalan){
        return pantalan.getTipo().equals("COmercial");
    }
    
}

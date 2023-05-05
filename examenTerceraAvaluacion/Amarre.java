package examenTerceraAvaluacion;
public class Amarre {
    private int id;
    private static int contador=0;  
    private float tamaño;
    private boolean ocupado;
    private Barco barco;
    public Amarre(int id, float tamaño, boolean ocupado, Barco barco) {
        this.id = id;
        this.tamaño = tamaño;
        this.ocupado = ocupado;
        this.barco = barco;
        contador++;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = contador;
    }
    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        Amarre.contador = contador;
    }
    public float getTamaño() {
        return tamaño;
    }
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    public Barco getBarco() {
        return barco;
    }
    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    @Override
    public String toString() {
        return "Amarre [id=" + id + ", tamaño=" + tamaño + ", ocupado=" + ocupado + ", barco=" + barco + "]";
    }
    
    

}

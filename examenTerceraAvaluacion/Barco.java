package examenTerceraAvaluacion;
import java.util.*;
public abstract class Barco {
    private String matricula;
    private String nombre;
    private float tamaño;

    public Barco() {
    }

    public Barco(String matricula, String nombre, float tamaño) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.tamaño = tamaño;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getTamaño() {
        return tamaño;
    }
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    @Override
    public String toString() {
        return "Barco [matricula=" + matricula + ", nombre=" + nombre + ", tamaño=" + tamaño + "]";
    }
    
    public static void mayorTamaño(ArrayList<Barco>barcosEntrantes){
        float mayorTamaño=-1;
        int indice =0;
        for(int i = 0;i<barcosEntrantes.size();i++){
            if(barcosEntrantes.get(i).getTamaño()>mayorTamaño){
                mayorTamaño=barcosEntrantes.get(i).getTamaño();
                indice=i;
            }
        }
        System.out.println("El barco de mayor tamaño es "+barcosEntrantes.get(indice));
    }

    public abstract boolean encajaTipo(Pantalan pantalan);
    public float encajaTamaño(Amarre amarre){
        return amarre.getTamaño()-tamaño;
    };

    public static void cargarBarcosEntrantes(ArrayList<Barco>barcosEntrantes){
        Comercial comercial = new Comercial("1234", "Poseidón", 80, "Carga textil");
        Recreo recreo = new Recreo("2345", "Tritón", 6, "Permiso recreativo");
        barcosEntrantes.add(recreo);
        barcosEntrantes.add(comercial);
    
    }
}


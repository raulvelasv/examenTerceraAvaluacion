package examenTerceraAvaluacion;

public class Recreo extends Barco{
    private String permiso;

    public Recreo() {
        
    }
    public Recreo(String matricula, String nombre, float tamaño, String permiso) {
        super(matricula, nombre, tamaño);
        this.permiso = permiso;
    }


    public String getpermiso() {
        return permiso;
    }


    public void setpermiso(String permiso) {
        this.permiso = permiso;
    }
    

    @Override
    public String toString() {
        return "Recreo [permiso=" + permiso + "]";
    }
    public boolean encajaTipo( Pantalan pantalan){
        return pantalan.getTipo().equals("Recreo");
    }
}

package examenTerceraAvaluacion;
import java.util.*;

public class Puerto {
    private ArrayList<Barco>barcosEntrantes;
    private ArrayList<Pantalan> listPantalan;
    public Puerto(){}
    
    public Puerto(ArrayList<Barco> barcosEntrantes, ArrayList<Pantalan> listPantalan) {
        this.barcosEntrantes = barcosEntrantes;
        this.listPantalan = listPantalan;
    }
    public  ArrayList<Barco> getBarcosEntrantes() {
        return barcosEntrantes;
    }
    public ArrayList<Pantalan> getListPantalan() {
        return listPantalan;
    }

    @Override
    public String toString() {
        return "Puerto [barcosEntrantes=" + barcosEntrantes + ", listPantalan=" + listPantalan + "]";
    }
    public static void verAmarre(ArrayList<Pantalan>listPantalan){
        for(int i =0; i<listPantalan.size();i++){
            System.out.println(listPantalan.get(i).toString());
        }
    }
    public static void buscarAmarre(ArrayList<Barco>barcosEntrantes,ArrayList<Pantalan>listPantalan){

    }
    public static void simular(ArrayList<Pantalan>listPantalan){

        
    }

    
}

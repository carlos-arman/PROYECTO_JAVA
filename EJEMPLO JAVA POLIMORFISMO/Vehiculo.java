public class Vehiculo {
    protected String marca;
    protected String color;
    protected int anio;
    protected int nLLantas;
    //CONSTRUCTOR
    public Vehiculo(String marca, String color, int anio, int nLLantas){
        this.marca = marca;
        this.color = color;
        this.anio = anio;
        this.nLLantas = nLLantas;

    }

    public String getmarca(){
        return marca;
    }
    public String getcolor(){
        return color;
    }
    public int getanio(){
        return anio;
    }
    public int getnLLantas(){
        return nLLantas;
    }
 
    public  String mostrarDatos(){
        return "Marca: "+marca +"\nColor: "+color +"\nAño: "+ anio +"\nnumero LLantas: "+nLLantas;
        
    }
    
}

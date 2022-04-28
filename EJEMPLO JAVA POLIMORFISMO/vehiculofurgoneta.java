public class vehiculofurgoneta extends Vehiculo{
    private int nPersonas;

    public vehiculofurgoneta(String marca, String color, int anio, int nLLantas) {
        super(marca, color, anio, nLLantas);
    }

    public int getnPersonas() {
        return nPersonas;
    }

    public void setnPersonas(int nPersonas) {
        this.nPersonas = nPersonas;
    }
    public String mostraDatos(){
        return "Marca: "+marca +"\nColor: "+color +"\nAño: "+ anio +"\nNumero de persona a transportar: "+nPersonas;
    }
    

}

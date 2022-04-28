public class vehiculoElectrico extends Vehiculo{
    private int HCargar;
    
    public vehiculoElectrico(String marca, String color, int anio, int nLLantas) {
        super(marca, color, anio, nLLantas);
    }

    public int getHCargar() {
        return HCargar;
    }

    public void setHCargar(int hCargar) {
        this.HCargar = hCargar;
    }

    @Override
    public String mostrarDatos() {
        // TODO Auto-generated method stub

        return "Marca: "+marca +"\nColor: "+color +"\nAño: "+ anio +"\nnumero LLantas: "+nLLantas +
        "\nHoras de carga: " +HCargar;
    }
    
    
}

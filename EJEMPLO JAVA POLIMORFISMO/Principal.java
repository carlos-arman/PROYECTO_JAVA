public class Principal{
    public static void main(String[] args) {
        Vehiculo tiposVehiculos[] = new Vehiculo[4];
        tiposVehiculos[0] = new Vehiculo("Nissan", "amarillo", 2002, 4);

        //POLIMORFISMOS
        tiposVehiculos[1] = new vehiculofurgoneta("Disel", "Negro", 2020, 4);
        tiposVehiculos[2] = new vehiculoCamioneta("4x4", "Azul", 2021, 6);
        tiposVehiculos[3] = new vehiculoElectrico("nova", "Blanco", 2022, 4);

        for(Vehiculo vehiculos: tiposVehiculos){
            System.out.println(vehiculos.mostrarDatos());
        }
    }
}
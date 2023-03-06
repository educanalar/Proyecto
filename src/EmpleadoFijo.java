public class EmpleadoFijo extends Empleado {
    boolean guarderia, seguro;

    public EmpleadoFijo() {
    }

    public EmpleadoFijo(int diasLaborados, String rfc, String curp, String claveIne, String id, String nombre, float horasTrabajadas, float precioHora, float porcentajeImpuesto, boolean guarderia, boolean seguro) {
        super(diasLaborados, rfc, curp, claveIne, id, nombre, horasTrabajadas, precioHora, porcentajeImpuesto);
        this.guarderia = guarderia;
        this.seguro = seguro;
    }

    public boolean isGuarderia() {
        return guarderia;
    }

    public void setGuarderia(boolean guarderia) {
        this.guarderia = guarderia;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }
    public void Datos(){
        System.out.println("\nNombre: "+ getNombre() +
                "\nID: " + getId() +
                "\nHoras Laboradas: "+ getHorasTrabajadas() +
                "\nPrecio por hora: "+ getPrecioHora() +
                "\nISR: "+ getPorcentajeImpuesto() +
                "\nCuenta con seguro: " + isSeguro() +
                "\nCuenta con guarderia: " + isGuarderia() );


    }

}

public class EmpleadoForaneo extends Empleado {
    String numeroTelefono;
    boolean apoyoTransporte;

    public EmpleadoForaneo() {
    }

    public EmpleadoForaneo(int diasLaborados, String numeroTelefono, boolean apoyoTransporte, String rfc, String curp, String claveIne, String id, String nombre, float horasTrabajadas, float precioHora, float porcentajeImpuesto) {
        super(diasLaborados, rfc, curp, claveIne, id, nombre, horasTrabajadas, precioHora, porcentajeImpuesto);
        this.numeroTelefono = numeroTelefono;
        this.apoyoTransporte = apoyoTransporte;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public boolean isApoyoTransporte() {
        return apoyoTransporte;
    }

    public void setApoyoTransporte(boolean apoyoTransporte) {
        this.apoyoTransporte = apoyoTransporte;
    }
}

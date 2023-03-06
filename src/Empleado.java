public class Empleado {
    String id, nombre, rfc, curp,claveIne;//crear nueva clase departamento, agregar variable dias laborados, rfc, curp, id ine,
    float horasTrabajadas, precioHora, porcentajeImpuesto;
    int diasLaborados;

    public Empleado() {
    }

    public Empleado(int diasLaborados, String rfc, String curp, String claveIne, String id, String nombre, float horasTrabajadas, float precioHora, float porcentajeImpuesto) {
        this.id = id;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
        this.porcentajeImpuesto = porcentajeImpuesto;
        this.rfc = rfc;
        this.curp = curp;
        this.claveIne = claveIne;
        this.diasLaborados = diasLaborados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getClaveIne() {
        return claveIne;
    }

    public void setClaveIne(String claveIne) {
        this.claveIne = claveIne;
    }

    public int getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(int diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    public float getPorcentajeImpuesto() {
        return porcentajeImpuesto;
    }

    public void setPorcentajeImpuesto(float porcentajeImpuesto) {
        this.porcentajeImpuesto = porcentajeImpuesto;
    }
    public float calcularSalario() {
        return this.horasTrabajadas * this.precioHora;
    }

    public float salarioImpuesto() {
        return (this.horasTrabajadas * this.precioHora) * porcentajeImpuesto;
    }

    public float salarioTotal() {
        return (this.horasTrabajadas * this.precioHora) * this.porcentajeImpuesto;
    }


}



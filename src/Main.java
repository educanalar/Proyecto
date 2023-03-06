import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empleado obj = new Empleado(4, "37SD6TFYG", "CAADW2435243Y5U46", "QWERQTEH", "LAOA23", "LALO", 12.4F,10.5F, .10F);
        System.out.println(obj);
        System.out.println(
                "EMPLEADO ID: " + obj.id +
                "\n NOMBRE: " + obj.nombre +
                        "\n HORAS LABORADAS: " + obj.horasTrabajadas +
                        "\n PRECIO POR HORA: " + obj.precioHora +
                        "\n DIAS LABORADOS : " + obj.diasLaborados +
                        "\n RFC: " + obj.rfc +
                        "\n CURP: " + obj.curp +
                        "\n CLAVE DEL INEA: " + obj.claveIne +
                        "\n ISR (10 %): " + obj.porcentajeImpuesto +
                        "\n SU SALARIO ES: " + obj.salarioTotal()


        );


    }
}
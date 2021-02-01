public class Corredor {

    int metros;
    int tiempo;
    String nombre;
    int edad;


    public static void main(String[] args) {
        Corredor corredor = new Corredor();
        System.out.println(corredor.accionCorrer("Juan",30));
    }

    /**
     * Este metodo sirve para saber la distancia que corre en X segundos
     * @param nombre: Nombre del corredor
     * @param edad: Edad del corredor
     * @return Devuelve los metros que ha hecho en X segundos
     *
     */
    public String accionCorrer(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

        String resultado;

        metros = (int) (Math.random() * 10) +1;
        tiempo = (int) (Math.random() * 10) +1;

        resultado = "El corredor "+nombre+" de "+edad+" años ha hecho "+metros+" metros en "+tiempo+"s";

        return resultado;
    }

}

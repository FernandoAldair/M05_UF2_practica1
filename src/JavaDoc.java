public class JavaDoc {

    public static void main(String[] args) {

        Persona persona1 = new Persona("juan",23) ;
        Persona persona2 = new Persona("Carlos", 58);


        /**
         * @param persona: Es nuestro sujeto que nos confirmaran si esan caminando o corriendo
         * Print.
         * 1-Mira el numero generado aleatoriamente
         * 2-Comprueba si es menor(caminando) o mayor(corriendo) que 5
         * 3-Nos dice si la persona esta caminando o corriendo
         */

        if (persona1.getNumeroAleatorio() > 5){
            System.out.println("juan esta corriendo");
        }else {
            System.out.println("Juan esta caminando");
        }

        if (persona2.getNumeroAleatorio() > 5){
            System.out.println("Carlos esta corriendo");
        }else {
            System.out.println("Carlos esta caminando");
        }

    }

    public static class Persona{

        String nombre;
        int edad;
        int numeroAleatorio = (int) (Math.random()*10+1);

        /**
         *
         * Getter.
         * @return Numero generado aleatoriamente
         *
         */
        public int getNumeroAleatorio() {
            return numeroAleatorio;
        }
        /**
         *
         * @param nombre: Nombre de la Persona.
         * @param edad: Edad de la Persona
         *
         */
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }

}
public class PruebaReloj {

    public static void main(String[] args) {
        Temporizador temporizador = new Temporizador();

        RelojAnalogo relojAnalogo = new RelojAnalogo();
        RelojDigital relojDigital = new RelojDigital();

        temporizador.agregarObservador(relojAnalogo);
        temporizador.agregarObservador(relojDigital);

        // Simulación de pulso de reloj avanzando segundo a segundo
        while (true) {
            temporizador.pulsoDeReloj();

            try {
                Thread.sleep(1000); // Espera 1 segundo entre pulsos de reloj
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

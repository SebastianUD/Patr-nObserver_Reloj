// Clase RelojDigital
public class RelojDigital implements Observador {
    private int hora;
    private int minuto;
    private int segundo;

    @Override
    public void actualizar() {
        segundo++;

        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0; // Reiniciar a medianoche
                }
            }
        }

        Salida.mostrarMensaje("Reloj Digital: " + String.format("%02d:%02d:%02d", hora, minuto, segundo));
    }
}
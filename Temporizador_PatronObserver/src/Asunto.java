import java.util.ArrayList;
import java.util.List;

public abstract class Asunto {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }
    
    public void notificar() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }
}


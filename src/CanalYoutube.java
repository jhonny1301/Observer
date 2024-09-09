import java.util.ArrayList;
import java.util.List;

class CanalYoutube {
    private List<Observador> suscriptores = new ArrayList<>();
    private String nombre;

    public CanalYoutube(String nombre) {
        this.nombre = nombre;
    }

    public void suscribirse(Observador suscriptor) {
        suscriptores.add(suscriptor);
    }

    public void subirVideo(String titulo) {
        System.out.println(nombre + " ha subido un nuevo video: " + titulo);
        notificarSuscriptores("Nuevo video: " + titulo);
    }

    private void notificarSuscriptores(String mensaje) {
        for (Observador suscriptor : suscriptores) {
            suscriptor.actualizar(mensaje);
        }
    }
}
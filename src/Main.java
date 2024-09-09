public class Main {
    public static void main(String[] args) {
        CanalYoutube canal = new CanalYoutube("TechChannel");
        Usuario usuario1 = new Usuario("Carlos");
        Usuario usuario2 = new Usuario("Ana");

        canal.suscribirse(usuario1);
        canal.suscribirse(usuario2);

        canal.subirVideo("Nuevo tutorial de programación");
    }
}
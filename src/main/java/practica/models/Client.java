package practica.models;

public class Client {
    private String nombre;
    private String usuario;
    private String contrasenia;
    private String imagen;
    private String frase;

    public String getNombre() {
        return nombre;
    }
    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return usuario;
    }
    public void setUser(String user) {
        this.usuario = user;
    }

    public String getPassword() {
        return contrasenia;
    }
    public void setPassword(String password) {
        this.contrasenia = password;
    }

    public String getImage() {
        return imagen;
    }
    public void setImage(String password) {
        this.imagen = password;
    }

    public String getPhrase() {
        return frase;
    }
    public void setPhrase(String password) {
        this.frase = password;
    }
}

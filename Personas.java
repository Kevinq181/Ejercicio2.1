package clase03_proavanzada;

public class Personas {
    private String strIdentificacion;
    private String strNombres;
    private String strEmail;

    public Personas(String strIdentificacion, String strNombres, String strEmail) {
        this.strIdentificacion = strIdentificacion;
        this.strNombres = strNombres;
        this.strEmail = strEmail;
    }

    public String getStrIdentificacion() {
        return strIdentificacion;
    }

    public void setStrIdentificacion(String strIdentificacion) {
        this.strIdentificacion = strIdentificacion;
    }

    public String getStrNombres() {
        return strNombres;
    }

    public void setStrNombres(String strNombres) {
        this.strNombres = strNombres;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    @Override
    public String toString() {
        return "\nIdentificacion: " + strIdentificacion + "\nNombres: " + strNombres + "\nEmail: " + strEmail + "\n";
    }
    
}
package clase03_proavanzada;
public class Docente extends Personas {
    private String strIdDocente;
    private String strEspecializacion;
    private String strTipo;
    public Docente(String strIdentificacion, String strNombres, String strEmail) {
        super(strIdentificacion, strNombres, strEmail);
    }

    public Docente(String strIdDocente, String strEspecializacion, String strTipo, String strIdentificacion, String strNombres, String strEmail) {
        super(strIdentificacion, strNombres, strEmail);
        this.strIdDocente = strIdDocente;
        this.strEspecializacion = strEspecializacion;
        this.strTipo = strTipo;
    }

    @Override
    public String toString() {
        return "----- Docente ----" + super.toString() + "Id Docente:" + strIdDocente + "\nEspecializacion: " + strEspecializacion + "\nTipo: " + strTipo + "\n";
    }

    
}
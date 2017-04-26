package clase03_proavanzada;

public class DocenteTitular extends Docente {

    private String strHorarioClase;

    public DocenteTitular(String strIdentificacion, String strNombres, String strEmail) {
        super(strIdentificacion, strNombres, strEmail);
    }

    public DocenteTitular(String strIdentificacion, String strNombres, String strEmail, String strHorarioClase, String strIdDocente, String strEspecializacion, String strTipo) {
        super(strIdDocente, strEspecializacion, strTipo, strIdentificacion, strNombres, strEmail);
        this.strHorarioClase = strHorarioClase;
    }

    @Override
    public String toString() {
        return super.toString() + "Horario de Clases: " + strHorarioClase + '\n';
    }

}

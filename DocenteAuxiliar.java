package clase03_proavanzada;
public class DocenteAuxiliar extends Docente{
    private String strHorarioTutoria;
    
    public DocenteAuxiliar(String strIdentificacion, String strNombres, String strEmail) {
        super(strIdentificacion, strNombres, strEmail);
    }

    public DocenteAuxiliar( String strIdentificacion, String strNombres, String strEmail, String strHorarioTutoria, String strIdDocente, String strEspecializacion, String strTipo) {
        super(strIdDocente, strEspecializacion, strTipo, strIdentificacion, strNombres, strEmail);
        this.strHorarioTutoria = strHorarioTutoria;
    }

    @Override
    public String toString() {
        return super.toString() + "Horario de Tutoria: " + strHorarioTutoria + "\n";
    }
    
}

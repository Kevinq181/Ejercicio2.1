package clase03_proavanzada;
class Alumno extends Personas{
    private String strIdAlumno;
    public Alumno(String strIdentificacion, String strNombres, String strEmail) {
        super(strIdentificacion, strNombres, strEmail);
    }

    public Alumno(String strIdentificacion, String strNombres, String strEmail, String strIdAlumno) {
        super(strIdentificacion, strNombres, strEmail);
        this.strIdAlumno = strIdAlumno;
    }

    @Override

    public String toString() {
        return "----- Alumno -----" + super.toString() + "Id Alumno: " + strIdAlumno + '\n';
    }
    
    
}

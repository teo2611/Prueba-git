public abstract class Estudiante {
    private String Nombre;
    private int Edad; 
    private int Identidad;
    private String Horario;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int identidad, String horario) {
        Nombre = nombre;
        Edad = edad;
        Identidad = identidad;
        Horario = horario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getIdentidad() {
        return Identidad;
    }

    public void setIdentidad(int identidad) {
        Identidad = identidad;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public abstract double calcularDesempeño();

    

    
    
}

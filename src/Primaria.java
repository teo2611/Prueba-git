import java.util.Scanner;

public class Primaria extends Estudiante {
    
    private String Nom_acudiente;
    private int Grado;
    private int contacto;


 
    
    public Primaria(String nom_acudiente, int grado, int contacto) {
        Nom_acudiente = nom_acudiente;
        Grado = grado;
        this.contacto = contacto;

    }

    public Primaria(String nombre, int edad, int identidad, String horario, String nom_acudiente, int grado,
            int contacto) {
        super(nombre, edad, identidad, horario);
        Nom_acudiente = nom_acudiente;
        Grado = grado;
        this.contacto = contacto;
    }

    public String getNom_acudiente() {
        return Nom_acudiente;
    }

    public void setNom_acudiente(String nom_acudiente) {
        Nom_acudiente = nom_acudiente;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int grado) {
        Grado = grado;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Primaria [Nombre =" + getNombre()  + ", Edad =" + getEdad() + ", Grado =" + Grado + 
                ", Identidad =" + getIdentidad() + ", Horario =" + getHorario() + 
                ", contacto =" + contacto + " Nombre Acudiente =" + Nom_acudiente + "]";
    }
    
    @Override
    public double calcularDesempeño() {
        //El desempeño en primaria se calcula basado en la cantidad de faltas y notas
        double cantidadFaltas = obtenerCantidadFaltas();
        double promedioNotas = obtenerPromedioNotas();

        // Calculamos el desempeño 
        double desempeño = (100 - (cantidadFaltas * 2)) * promedioNotas / 10;
 
        return desempeño;
        
    }

    // Métodos para obtener cantidad de faltas y promedio de notas
    Scanner scanner = new Scanner(System.in);
    private double obtenerCantidadFaltas() {
        System.out.println("Digite la cantidad de faltas que tuviste en el periodo:");
        double Faltas = scanner.nextDouble();
        scanner.nextLine();
        return Faltas; 

    }
    

    private double obtenerPromedioNotas() {
        // Implementación para obtener el promedio de notas
        System.out.println("(Separadas por comas) Ingrese las notas del periodo: ");
        String notasStr = scanner.nextLine();
        String[] notasArray = notasStr.split(",");//split(","). Esto divide la cadena en cada coma encontrada.
        double sumaNotas = 0;

        for (String notaStr : notasArray) {
            double nota = Double.parseDouble(notaStr.trim());//trim() se usa para eliminar cualquier espacio en blanco
            sumaNotas += nota;                               // adicional alrededor del string antes de convertirlo a double.
        }

        return sumaNotas / notasArray.length;
    }
}

   

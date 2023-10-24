public class MainPruebas {
    public static void main(String[] args) {
        Alumnos[] listAlumnos = new Alumnos[2];
        String[] materias = { "Programación", "Español", "Inglés" };
        Alumnos registro = new Alumnos("Carlos", "Martnez", materias);
        listAlumnos[0] = registro;
        registro = new Alumnos("Alexis", "Noriega", materias);
        listAlumnos[1] = registro;

        // Consultas
        listAlumnos[0].getCalificaciones()[0] = 8;


        //Iteración
        for (Alumnos alumno : listAlumnos) {
            System.out.println("El elumno " + alumno.getNombre() + "tiene las calificaciones");
            for (int i = 0; i < alumno.getMaterias().length; i++) {
                System.out.println("La materia " + alumno.getMaterias()[i] +
                        " " + "con calif. " + alumno.getCalificaciones()[i]);
            }
        }
    }
}
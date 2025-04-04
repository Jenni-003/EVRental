import java.util.*;
// Clase Vehiculo
class Vehicle {
    private String id;
    private String tipoVehiculo;
    private String descripcion;
    private String localizacion;
    private boolean[] disponibilidad; // Disponibilidad por horas, por ejemplo.

    // Constructor
    public Vehicle(String id, String tipoVehiculo, String descripcion, String localizacion) {
        this.id = id;
        this.tipoVehiculo = tipoVehiculo;
        this.descripcion = descripcion;
        this.localizacion = localizacion;
        this.disponibilidad = new boolean[11]; //11 horas
 
    }

    // Métodos


    // Getters
    public String getId() {
        return id;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLocalizacion() {
        return localizacion;
    }
}

// interface Usuario 
interface Usuario {
        
    String getNombre();
    int getNumeroEstudiante();
    String getEmailUpr();
    int getTelefono();
    
}

// Clase Cliente
class Cliente implements Usuario {
    private String nombre;
    private int numeroEstudiante;
    private String emailUpr;
    private int telefono;

    public Cliente(String nombre, int numeroEstudiante, String emailUpr, int telefono) {
        this.nombre = nombre;
        this.numeroEstudiante = numeroEstudiante;
        this.emailUpr = emailUpr;
        this.telefono = telefono;
    }

    // Métodos

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public String getEmailUpr() {
        return emailUpr;
    }

    public int getTelefono() {
        return telefono;
    }
}
//Clase Vendedor
class DuenoDeVehiculo implements Usuario {
    private String nombre;
    private int numeroEstudiante;
    private String emailUpr;
    private int telefono;
    private Set<Vehicle> vehiculos; // Vehículos propiedad del dueño
     // Getters
    public String getNombre() {
            return nombre;
    }
    
    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }
    
    public String getEmailUpr() {
        return emailUpr;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public Set<Vehicle> getVehiculos() {
        return vehiculos;
    }
}
//Clase DuenoyCliente implements usuario..

// Clase Estacion
class Estacion {
    private String nombre;
    private int capacidad;
    private Set<Vehicle> vehiculosDisponibles;

    // Constructor
    public Estacion(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.vehiculosDisponibles = new HashSet<>();
    }

    // Métodos

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Set<Vehicle> getVehiculosDisponibles() {
        return vehiculosDisponibles;
    }
}


public class Main {
    public static void main(String[] args) {
        // scanner,etc..
    }
}

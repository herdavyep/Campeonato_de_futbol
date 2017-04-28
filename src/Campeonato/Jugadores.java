package Campeonato;

/**
 * Created by heriberto on 28/04/17.
 */
public class Jugadores extends Equipos{

    private int id_jugadores;
    private int id_equipo;
    private String nombreJugador;
    private String posicion;
    private String nacionalidad;
    private int numeroCamiseta;
    private String pieDominante;
    private int goles;

    public Jugadores(int id_jugadores, int id_equipo, String nombreJugador, String posicion, String nacionalidad, int numeroCamiseta, String pieDominante, int goles) {
        super();
        this.id_jugadores = id_jugadores;
        this.id_equipo = id_equipo;
        this.nombreJugador = nombreJugador;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
        this.numeroCamiseta = numeroCamiseta;
        this.pieDominante = pieDominante;
        this.goles = goles;
    }

    public int getId_jugadores() {
        return id_jugadores;
    }

    public void setId_jugadores(int id_jugadores) {
        this.id_jugadores = id_jugadores;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPieDominante() {
        return pieDominante;
    }

    public void setPieDominante(String pieDominante) {
        this.pieDominante = pieDominante;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}

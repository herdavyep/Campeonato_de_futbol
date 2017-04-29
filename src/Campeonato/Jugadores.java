package Campeonato;

import crud.Crud;

/**
 * Created by heriberto on 28/04/17.
 */
public class Jugadores implements Crud{

    private int id_jugadores;
    private int id_equipo;
    private String nombreJugador;
    private String posicion;
    private String nacionalidad;
    private int numeroCamiseta;
    private String pieDominante;
    private int goles;

    public Jugadores(int id_jugadores, int id_equipo, String nombreJugador, String posicion, String nacionalidad, int numeroCamiseta, String pieDominante, int goles) {
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

    @Override
    public void crear(Crud objeto) {

        //insertar=mysql( "INSERT INTO Jugadores( id_equipo, nombreJugador, posicion, nacionalidad, numeroCamiseta, pieDominante, goles) VALUES ('id_equipo', 'nombreJugador+, 'posicion', 'nacionalidad', 'numeroCamiseta', 'pieDominante', 'goles')");


    }

    @Override
    public void actualizar(Crud objeto) {

        // editar =  mysql (" UPDATE Jugadores SET id_equipo = 'id_equipo', nombreJugador = 'nombreJugador', posicion = 'posicion', nacionalidad = 'nacionalidad',  numeroCamiseta = 'numeroCamiseta', pieDominante = 'pieDominante', goles = 'goles'  WHERE id_jugadores = 'id_jugadores' ");


    }

    @Override
    public void eliminar(Crud objeto) {

        // eliminar = mysql( "DELETE FROM Jugadores WHERE id_jugadores = 'id_jugadores' ");


    }

    @Override
    public void ver(Crud objeto) {

        //consulta = mysql ("SELECT * FROM Jugadores");


    }
}

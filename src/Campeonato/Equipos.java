package Campeonato;

import crud.Crud;

/**
 * Created by heriberto on 28/04/17.
 */
public class Equipos implements Crud{

    private int id_equipo;
    private String jugadores [];
    private String nombreEquipo;
    private int uniformes;
    private String entrenador;
    private String medico;
    private int partidosJugados;

    public Equipos(int id_equipo, String[] jugadores, String nombreEquipo, int uniformes, String entrenador, String medico, int partidosJugados) {
        this.id_equipo = id_equipo;
        this.jugadores = jugadores;
        this.nombreEquipo = nombreEquipo;
        this.uniformes = uniformes;
        this.entrenador = entrenador;
        this.medico = medico;
        this.partidosJugados = partidosJugados;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(String[] jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getUniformes() {
        return uniformes;
    }

    public void setUniformes(int uniformes) {
        this.uniformes = uniformes;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    @Override
    public void crear(Crud objeto) {

        //insertar=mysql( "INSERT INTO Equipos( jugadores, nombreEquipo, uniformes, entrenador, medico, partidosJugados) VALUES ('nombreEquipo','jugadores','uniformes','entrenador','medico','partidosJugados')");


    }

    @Override
    public void actualizar(Crud objeto) {

        // editar =  mysql (" UPDATE Equipos SET nombreEquipo = 'nombreEquipo', jugadores = 'jugadores', uniformes = 'uniformes', entrenador = 'entrenador',  medico = 'medico', partidosJugados = 'partidosJugados'  WHERE id_equipo = 'id_equipo' ");


    }

    @Override
    public void eliminar(Crud objeto) {

        // eliminar = mysql( "DELETE FROM Equipos WHERE id_equipo = 'id_equipo'");


    }

    @Override
    public void ver(Crud objeto) {

        //consulta = mysql ("SELECT * FROM Equipos");


    }
}

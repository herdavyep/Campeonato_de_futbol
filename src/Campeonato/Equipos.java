package Campeonato;

import crud.Crear;

/**
 * Created by heriberto on 28/04/17.
 */
public class Equipos extends Crear{

    private int id_equipo;
    private String jugadores [];
    private String nombreEquipo;
    private int uniformes;
    private String entrenador;
    private String medico;
    private int partidosJugados;

    public Equipos() {
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

}

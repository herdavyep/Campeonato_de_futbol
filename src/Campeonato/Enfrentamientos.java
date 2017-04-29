package Campeonato;

import crud.Crud;

/**
 * Created by heriberto on 28/04/17.
 */
public class Enfrentamientos  implements Crud{

    private int id_enfrentamiento;
    private String equipoLocal;
    private String equipoVisitante;
    private String ganador;
    private String estadio;
    private int id_golesLocal;
    private int id_golesVisitante;


    public Enfrentamientos(int id_enfrentamiento, String equipoLocal, String equipoVisitante, String ganador, String estadio, int id_golesLocal, int id_golesVisitante) {
        this.id_enfrentamiento = id_enfrentamiento;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.ganador = ganador;
        this.estadio = estadio;
        this.id_golesLocal = id_golesLocal;
        this.id_golesVisitante = id_golesVisitante;
    }

    public int getId_enfrentamiento() {
        return id_enfrentamiento;
    }

    public void setId_enfrentamiento(int id_enfrentamiento) {
        this.id_enfrentamiento = id_enfrentamiento;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getId_golesLocal() {
        return id_golesLocal;
    }

    public void setId_golesLocal(int id_golesLocal) {
        this.id_golesLocal = id_golesLocal;
    }

    public int getId_golesVisitante() {
        return id_golesVisitante;
    }

    public void setId_golesVisitante(int id_golesVisitante) {
        id_golesVisitante = id_golesVisitante;
    }

    @Override
    public void crear(Crud objeto) {

        //insertar=mysql( "INSERT INTO Jugadores( equipoLocal, equipoVisitante, ganador, estadio, id_golesLocal, id_golesVisitante) VALUES ('equipoLocal', 'equipoVisitante', 'ganador', 'estadio', 'id_golesLocal', 'id_golesVisitante')");


    }

    @Override
    public void actualizar(Crud objeto) {

        // editar =  mysql (" UPDATE Enfrentamientos SET equipoLocal = 'equipoLocal', equipoVisitante = 'equipoVisitante', ganador = 'ganador', estadio = 'estadio',  id_golesLocal = 'id_golesLocal', id_golesVisitante = 'id_golesVisitante'  WHERE id_enfrentamientos = 'id_enfrentamientos' ");


    }

    @Override
    public void eliminar(Crud objeto) {

        // eliminar = mysql( "DELETE FROM Enfrentamientos WHERE id_enfrentamientos = 'id_enfrentamientos' ");


    }

    @Override
    public void ver(Crud objeto) {

        //consulta = mysql ("SELECT * FROM Enfrentamientos");


    }


}

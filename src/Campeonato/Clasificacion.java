package Campeonato;

import crud.Crud;

/**
 * Created by heriberto on 28/04/17.
 */
public class Clasificacion implements Crud{

    private int id_clasificacion;
    private int puntos;
    private int posicion;
    private int id_equipo;
    private int id_partidosJugados;
    private int id_goles;

    public Clasificacion(int id_clasificacion, int puntos, int posicion, int id_equipo, int id_partidosJugados, int id_goles) {
        this.id_clasificacion = id_clasificacion;
        this.puntos = puntos;
        this.posicion = posicion;
        this.id_equipo = id_equipo;
        this.id_partidosJugados = id_partidosJugados;
        this.id_goles = id_goles;
    }

    public int getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getId_partidosJugados() {
        return id_partidosJugados;
    }

    public void setId_partidosJugados(int id_partidosJugados) {
        this.id_partidosJugados = id_partidosJugados;
    }

    public int getId_goles() {
        return id_goles;
    }

    public void setId_goles(int id_goles) {
        this.id_goles = id_goles;
    }


    @Override
    public void crear(Crud objeto) {

        //insertar=mysql( "INSERT INTO Clasificacion( puntos, posicion, id_equipo, id_partidosJugados, id_goles ) VALUES ('puntos', 'posicion', 'id_equipo', 'id_partidosJugados', 'id_goles')");


    }

    @Override
    public void actualizar(Crud objeto) {

        // editar =  mysql (" UPDATE Clasificacion SET puntos = 'puntos', posicion = 'posicion', id_equipo = 'id_equipo', id_partidosJugados = 'id_partidosJugados',  id_goles = 'id_goles'  WHERE id_clasificacion = 'id_clasificacion' ");


    }

    @Override
    public void eliminar(Crud objeto) {

        // eliminar = mysql( "DELETE FROM Clasificacion WHERE id_clasificacion = 'id_clasificacion' ");


    }

    @Override
    public void ver(Crud objeto) {

        //consulta = mysql ("SELECT * FROM Clasificacion");


    }

}

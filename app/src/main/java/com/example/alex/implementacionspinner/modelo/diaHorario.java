package com.example.alex.implementacionspinner.modelo;

public class diaHorario {
    private String asignatura;
    private String dia;

    public diaHorario(String asignatura, String dia) {
        this.asignatura = asignatura;
        this.dia = dia;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}

package pe.edu.idat.ec3_torresmateo;

import java.util.Date;

public class Bus {

    private int id;

    private int image;

    private String paradero;

    private Date horario;

    private int pasajeros;

    public Bus() {
    }

    public Bus(int id, int image, String paradero, Date horario, int pasajeros) {
        this.id = id;
        this.image = image;
        this.paradero = paradero;
        this.horario = horario;
        this.pasajeros = pasajeros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getParadero() {
        return paradero;
    }

    public void setParadero(String paradero) {
        this.paradero = paradero;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
}

package com.example.cav.saleoffhunter.Entity;

/**
 * Created by Asus on 19-02-2018.
 */

public class User {

    int usrId,tpUserId,tSexId,ciuId,usrEstado;
    String usrNombre,usrUsername,usrPassword,usrEmail,usrDireccion;

    public User(int usrId, int tpUserId, int tSexId, int ciuId, int usrEstado, String usrNombre, String usrUsername, String usrPassword, String usrEmail, String usrDireccion) {
        this.usrId = usrId;
        this.tpUserId = tpUserId;
        this.tSexId = tSexId;
        this.ciuId = ciuId;
        this.usrEstado = usrEstado;
        this.usrNombre = usrNombre;
        this.usrUsername = usrUsername;
        this.usrPassword = usrPassword;
        this.usrEmail = usrEmail;
        this.usrDireccion = usrDireccion;
    }

    public int getUsrId() {
        return usrId;
    }

    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }

    public int getTpUserId() {
        return tpUserId;
    }

    public void setTpUserId(int tpUserId) {
        this.tpUserId = tpUserId;
    }

    public int gettSexId() {
        return tSexId;
    }

    public void settSexId(int tSexId) {
        this.tSexId = tSexId;
    }

    public int getCiuId() {
        return ciuId;
    }

    public void setCiuId(int ciuId) {
        this.ciuId = ciuId;
    }

    public int getUsrEstado() {
        return usrEstado;
    }

    public void setUsrEstado(int usrEstado) {
        this.usrEstado = usrEstado;
    }

    public String getUsrNombre() {
        return usrNombre;
    }

    public void setUsrNombre(String usrNombre) {
        this.usrNombre = usrNombre;
    }

    public String getUsrUsername() {
        return usrUsername;
    }

    public void setUsrUsername(String usrUsername) {
        this.usrUsername = usrUsername;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getUsrDireccion() {
        return usrDireccion;
    }

    public void setUsrDireccion(String usrDireccion) {
        this.usrDireccion = usrDireccion;
    }
}

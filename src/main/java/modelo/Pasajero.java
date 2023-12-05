/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author harryjosecastrorodriguez
 */
public class Pasajero {
    
    String idPasajero, name, lastName, birthday, cellphone, sex, mail;
    Documento doc;

    public Pasajero(String idPasajero, String name, String lastName, String birthday, String cellphone, String sex, String mail, Documento doc) {
        this.idPasajero = idPasajero;
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.cellphone = cellphone;
        this.sex = sex;
        this.mail = mail;
        this.doc = doc;
    }

    public String getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(String idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Documento getDoc() {
        return doc;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }
    
}

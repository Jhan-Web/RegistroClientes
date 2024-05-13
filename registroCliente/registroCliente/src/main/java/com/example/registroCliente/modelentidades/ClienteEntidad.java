package com.example.registroCliente.modelentidades;

public class ClienteEntidad {

    private Long id;
    private String codigo_postal;
    private String primer_nombre;
    private String segundo_nombre;
    private String apelledio_paterno;
    private String apellido_materno;
    private String ciudad;
    private String estado_civil;
    private String sueldo;

    public ClienteEntidad() {
    }

    public ClienteEntidad(Long id, String codigo_postal, String primer_nombre, String segundo_nombre, String apelledio_paterno, String apellido_materno, String ciudad, String estado_civil, String sueldo) {
        this.id = id;
        this.codigo_postal = codigo_postal;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.apelledio_paterno = apelledio_paterno;
        this.apellido_materno = apellido_materno;
        this.ciudad = ciudad;
        this.estado_civil = estado_civil;
        this.sueldo = sueldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getApelledio_paterno() {
        return apelledio_paterno;
    }

    public void setApelledio_paterno(String apelledio_paterno) {
        this.apelledio_paterno = apelledio_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
}

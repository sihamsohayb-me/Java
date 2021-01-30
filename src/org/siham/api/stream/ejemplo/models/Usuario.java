package org.siham.api.stream.ejemplo.models;

public class Usuario {


    private Integer id;

    private static int ultimoId;
    private String name;

    private String apellido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Usuario(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
        this.id = ++ultimoId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}

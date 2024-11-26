package org.ies.library.model;

import java.util.Objects;

public class Autor {
    private int NIF;
    private String name;
    private String surName;

    public Autor(int NIF, String name, String surName) {
        this.NIF = NIF;
        this.name = name;
        this.surName = surName;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return NIF == autor.NIF && Objects.equals(name, autor.name) && Objects.equals(surName, autor.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NIF, name, surName);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "NIF=" + NIF +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}

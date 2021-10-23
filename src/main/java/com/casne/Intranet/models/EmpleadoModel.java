package com.casne.Intranet.models;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name = "empleado")
public class EmpleadoModel{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idEmpleado;
    
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private String genero;
    private String pais;
    private String calle;
    private Integer cp;
    private Integer telefono;
    private String email;
    private Integer porcentaje;
    private String puesto;
    private Long idDepartamento;
    private Long idDepartamento2;
    private String login;


    public Long getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getNacimiento() {
        return this.nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCalle() {
        return this.calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getCp() {
        return this.cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public Integer getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPorcentaje() {
        return this.porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Long getIdDepartamento() {
        return this.idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Long getIdDepartamento2() {
        return this.idDepartamento2;
    }

    public void setIdDepartamento2(Long idDepartamento2) {
        this.idDepartamento2 = idDepartamento2;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


}

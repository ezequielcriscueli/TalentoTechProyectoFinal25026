package com.proyecto.talento.carrito.model;
import jakarta.persistence.*;
// Indica que esta clase es una entidad JPA
@Entity
@Table(name = "pedidos")
public class Pedido {
    // Atributos de la clase Pedido
    @Id // Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremental
    private Long id;
    private String mailCliente;
    private String dniCliente;
    private String fechaPedido;
    private String fechaEntrega;
    private String estado;
    //una lista de articulos
    private Articulo[] articulos;
    private Double cantidad;

    // Constructor por defecto
    public Pedido() {}
    // Constructor con parámetros
    public Pedido(Long id, String mailCliente, String dniCliente, String fechaPedido, String fechaEntrega, String estado, Articulo[] articulos, Double cantidad) {
        this.id = id;
        this.mailCliente = mailCliente;
        this.dniCliente = dniCliente;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.articulos = articulos;
        this.cantidad = cantidad;
    }
    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMailCliente() { return mailCliente; }
    public void setMailCliente(String mailCliente) { this.mailCliente = mailCliente; }
    public String getDniCliente() { return dniCliente; }
    public void setDniCliente(String dniCliente) { this.dniCliente = dniCliente; }
    public String getFechaPedido() { return fechaPedido; }
    public void setFechaPedido(String fechaPedido) { this.fechaPedido = fechaPedido; }
    public String getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(String fechaEntrega) { this.fechaEntrega = fechaEntrega; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public Articulo[] getArticulos() { return articulos; }
    public void setArticulos(Articulo[] articulos) { this.articulos = articulos; }
    public Double getCantidad() { return cantidad; }
    public void setCantidad(Double cantidad) { this.cantidad = cantidad;}   


}

package com.tienda.ropa.entities;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {
    
    private static final long serialVersionUID =7L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private String descripcion;
    private String descripcion_corta;
    @ManyToOne
    private Material material_producto;
    @ManyToOne
    private Modelos modelo_producto;
    @ManyToOne
    private Estados estado_producto;
    @ManyToOne
    private Marcas marca_producto;
    @ManyToOne
    private Generos genero_producto;
    
    
    //private Colores color_producto; //preguntar si va o no
    private Boolean destacado;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hitss.almacen.controller.producto;

import com.hitss.almacen.model.dao.ProductoDAO;
import com.hitss.almacen.model.facade.Producto;

/**
 *
 * @author ext_hmorag
 */
public class producto {
 
    public void Crear (ProductoDAO productoDao) {
        
        Producto productoFacade = new Producto();
        
        productoFacade.setIdProducto(productoDao.getIdProducto());
        productoFacade.setNombre(productoDao.getNombre());
        
        
    
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;

import CapaDatos.Conexionbd;
import ClasesPojo.Usuario;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PROFESORES
 */
public class GestionUsuario implements IGestion {
    String consulta;
    
        private Usuario usuario;

    public GestionUsuario() {
        
        usuario=new Usuario(0,"","","");
        Conexionbd.setUsuario("root");
        Conexionbd.setClave("");
        Conexionbd.setCadenaConexion("jdbc:mysql://localhost/usuariodb");
    }
        
        

    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Set the value of usuario
     *
     * @param usuario new value of usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void Nuevo() {
        usuario.setId(0);
        usuario.setNombre(null);
        usuario.setApellido(null);
        usuario.setCedula(null);
    }

    @Override
    public void Insertar() throws SQLException {
        
        try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into usuario (Id,Nombre,Apellido,Cedula) values ("+usuario.getId()+",'"+usuario.getNombre()+"','"+usuario.getApellido()+"','"+usuario.getCedula()+"')");
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
        
    }

    @Override
    public void Consultar() throws SQLException {
        try
        {
         Conexionbd.getInstancia().conectar();
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT Id,Nombre,Apellido,Cedula FROM usuario WHERE Id = '"+usuario.getId()+"';");
           while(rs.next()){
               usuario.setId(rs.getInt(1));
               usuario.setNombre(rs.getString(2));
               usuario.setApellido(rs.getString(3));
               usuario.setCedula(rs.getString(4));
        }
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
    }
    @Override
    public void Modificar() throws SQLException {        
        try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("UPDATE usuario SET Nombre = '"+usuario.getNombre()+"', Apellido = '"+usuario.getApellido()+"', Cedula = '"+usuario.getCedula()+"' WHERE Id = "+usuario.getId());
             
        }
       catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
    }

    @Override
    public void Eliminar() throws SQLException {
         try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("DELETE FROM usuario WHERE Id = "+usuario.getId());
               
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
    }
    
    
}
    


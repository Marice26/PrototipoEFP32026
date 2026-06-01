/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Marice
 */
public class usuarioDAO {
    private static final String SQL_SELECT = "SELECT Usunid, Usucodigofacultad, Usunombre, Usutelefono, Usudireccion, Usucorreo, Usuestado FROM Usuario";
    private static final String SQL_INSERT = "INSERT INTO Usuario(Usunid, Usucodigofacultad, Usunombre, Usutelefono, Usudireccion, Usucorreo, Usuestado) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE Vendedores SET Emcodigo=?, Vennombre=?, Ventelefono=?, Vendireccion=?, Vencorreo=?, Vencomisiones=? WHERE Venid=?";
    private static final String SQL_DELETE = "DELETE FROM Vendedores WHERE Venid=?";
    private static final String SQL_QUERY = "SELECT Venid, Emcodigo, Vennombre, Ventelefono, Vendireccion, Vencorreo, Vencomisiones FROM Vendedores WHERE Venid=?";

}

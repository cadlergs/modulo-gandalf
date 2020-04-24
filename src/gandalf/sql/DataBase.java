package gandalf.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import gandalf.models.*;

public class DataBase {

    private Connection conexaoDB;
    private String URL_DB = "jdbc:derby://localhost:1527/gandalf";

    public DataBase() {
        try {
            conexaoDB = DriverManager.getConnection(URL_DB, "root", "senha");
            System.out.println("Successful connection");
        } catch (SQLException sqle) {
            System.out.println("Connection fail: " + sqle);
        }
    }

    public void insertItem(MagicItem magicItem) {
        try {
            Statement connection = conexaoDB.createStatement();
            String query = "INSERT INTO GANDALF.MAGICITEM (NAME, WEAPON, ELEMENT, POWER, DAMAGE, ATKSPEED) "
                    + "VALUES ('" + magicItem.getName() + "','" + magicItem.getWeapon() + "','" + magicItem.getElement()
                    + "','" + magicItem.getPower() + "'," + magicItem.getDamage() + "," + magicItem.getAtkSpeed() + ")";
            connection.executeUpdate(query);
            connection.close();
        } catch (SQLException sqle) {
            System.out.println("Fail to insert " + sqle);
        }
    }

    public void listItems(ArrayList<MagicItem> magicItemList) {
        try {
            Statement comandoSQL = conexaoDB.createStatement();
            String sqlLista = "SELECT NAME, WEAPON, ELEMENT, POWER, DAMAGE, ATKSPEED FROM GANDALF.MAGICITEM";
            ResultSet resultado = comandoSQL.executeQuery(sqlLista);
            while (resultado.next()) {
                String name = resultado.getString("NAME");
                String weapon = resultado.getString("WEAPON");
                String element = resultado.getString("ELEMENT");
                String power = resultado.getString("POWER");
                int damage = resultado.getInt("DAMAGE");
                int atkSpeed = resultado.getInt("ATKSPEED");
                MagicItem magicItem = new MagicItem(name, weapon, element, power, damage, atkSpeed);
                magicItemList.add(magicItem);
            }
        } catch (SQLException sqle) {
            System.out.println("Erro de leitura " + sqle);
        }
    }

}

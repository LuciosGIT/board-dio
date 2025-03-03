package org.example;

import org.example.persistence.migration.MigrationStrategy;
import org.example.persistence.MainMenu;

import java.sql.SQLException;

import static org.example.persistence.config.ConnectionConfig.getConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException{

            try(var connection = getConnection()){
                new MigrationStrategy(connection).executeMigration();
            }
        }
}
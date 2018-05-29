package org.jax.database;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoadObservationTest {
    @Test
    public void load() throws Exception {
        String hushSqlite = "jdbc:sqlite:/Users/zhangx/Documents/HUSH+_UNC_JAX/HUSH+_UNC_JAX.sqlite";
        SQLiteJDBCDriverConnection connection = new SQLiteJDBCDriverConnection(hushSqlite);
        final String filePath = "/Users/zhangx/Documents/HUSH+_UNC_JAX/Hush+UNC_JAX/HUSH+/OBSERVATION_FACT.txt";
        TableImporter loader = new LoadObservation(connection.connect(), filePath);
        loader.load();

        connection.close();
    }

}
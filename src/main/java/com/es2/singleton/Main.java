package com.es2.singleton;

public class Main {

    public static void main(String[] args) {

        Registry registry = Registry.getInstance();

        registry.setPath("/tmp/files");
        registry.setConnectionString("jdbc:mysql://localhost:3306/db");

        System.out.println("Path: " + registry.getPath());
        System.out.println("Connection: " + registry.getConnectionString());
    }
}

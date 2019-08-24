package com.example.ormlitedemo.Classes;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class DatabaseConfigUtil extends OrmLiteConfigUtil { //extend the class to extends OrmLiteConfigUtil

    // if cannot create config_txt restart the Android studio then run again

    //create method for the container for many class
    private static final Class<?>[] classes = new Class[]{
            Note.class// you can add class here with "Note.class,NameOfClass.class"
    };

    //create or generate stub
//    public static void main(String[] args) throws Exception {
//        writeConfigFile("ormlite_config.txt", classes);
//    }
    public static void main(String[] args) throws Exception {//only method to create a config file
//        writeConfigFile("res/raw/ormlite_config.txt");
        writeConfigFile(new File("res/raw/ormlite_config.txt"),classes);
    }
//create or generate stub
//    public static void main(String[] args) throws IOException, SQLException {//only method to create a config file
//        writeConfigFile("ormlite_config.txt", classes);
//    }
}

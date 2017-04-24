package com.example.simpleloginform.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Armen on 4/23/2017.
 */

public class User {
    private Integer id;
    private String username = "a";
    private String password = "b";
    private String fullName;
    private Map<String,String> mapOfLogPass = new HashMap<>();
    public Integer getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public void generateMap(){
        mapOfLogPass.put("login1", "pass1");
        mapOfLogPass.put("login2", "pass2");
        mapOfLogPass.put("Armen", "nemra");
        mapOfLogPass.put("123", "123");
        mapOfLogPass.put("Username", "a");
    }

    public Map<String, String> getMapOfLogPass() {
        return mapOfLogPass;
    }

    public void setMapOfLogPass(Map<String, String> mapOfLogPass) {
        this.mapOfLogPass = mapOfLogPass;
    }
}

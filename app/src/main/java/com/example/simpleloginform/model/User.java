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
    private Map<String,String> loginPass = new HashMap<>();
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
        loginPass.put("login1", "pass1");
        loginPass.put("login2", "pass2");
        loginPass.put("Armen", "nemra");
        loginPass.put("123", "123");
        loginPass.put("Username", "a");
    }

    public Map<String, String> getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(Map<String, String> loginPass) {
        this.loginPass = loginPass;
    }
}

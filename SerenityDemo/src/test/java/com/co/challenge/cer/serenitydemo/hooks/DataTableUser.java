package com.co.challenge.cer.serenitydemo.hooks;

import com.co.challenge.cer.serenitydemo.models.User;
import io.cucumber.java.DataTableType;
import java.util.Map;

public class DataTableUser {

    @DataTableType
    public User TransformToUser(Map<String, String> data){
        return new User(data.get("userName"), data.get("password"));
    }
}

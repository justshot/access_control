package com.jiasl.access;

public class MyController {

    AccessControlManager manager;
    public String handleRequest(User user) {
        String result = "";
        if(manager.hasPrivilege(user, Privilege.change_status)) {
            result.concat("data");
        }

        if(manager.hasPrivilege(user, Privilege.edit_case)) {
            result.concat("data");
        }
        return result;
    }
}

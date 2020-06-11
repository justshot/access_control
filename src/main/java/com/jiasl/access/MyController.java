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


    public String handleRequest2(User user) {
        String result = "";
        result.concat(changeStatus());
        result.concat(editCase());
        return result;
    }

    @Secured({"Stuff"})
    private String changeStatus() {
        return null;
    }

    @Secured({"Admin"})
    private String editCase() {
        return null;
    }
}

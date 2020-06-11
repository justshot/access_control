package com.jiasl.access;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessControlManagerImpl implements AccessControlManager {
    Map<Role, List<Privilege>> rolePrivilege = new HashMap<Role, List<Privilege>>();
    public boolean hasPrivilege(User user, Privilege previlege){
        List<Role> roles = user.getRoles();
        for(Role role : roles) {
            if(rolePrivilege.get(role).contains(previlege)) {
                return true;
            }
        }
        return false;
    }
}

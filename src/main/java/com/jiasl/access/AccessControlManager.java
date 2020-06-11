package com.jiasl.access;

import java.util.List;

interface AccessControlManager {
    boolean hasPrivilege(User user, Privilege previlege);
}

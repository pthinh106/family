package com.pthinh.family.Enum;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Permission {
    ADMIN_READ("ADMIN_READ"),
    ADMIN_UPDATE("ADMIN_UPDATE"),
    ADMIN_CREATE("ADMIN_CREATE"),
    ADMIN_DELETE("ADMIN_DELETE"),
    USER_READ("MANAGER_READ"),
    USER_UPDATE("MANAGER_UPDATE"),
    USER_CREATE("MANAGER_CREATE"),
    USER_DELETE("MANAGER_DELETE");

    private final String permission;
}

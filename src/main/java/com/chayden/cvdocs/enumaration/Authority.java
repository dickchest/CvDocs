package com.chayden.cvdocs.enumaration;

import lombok.Getter;

import static com.chayden.cvdocs.constant.Constans.*;

@Getter
public enum Authority {
    USER(USER_AUTHORITIES),
    ADMIN(ADMIN_AUTHORITIES),
    SUPER_ADMIN(SUPER_ADMIN_AUTHORITIES),
    MANAGER(MANAGER_AUTHORITIES);

    private final String value;

    Authority(String value) {
        this.value = value;
    }

}

package com.chayden.cvdocs.constant;

public class Constans {
    public static final String ROLE_PREFIX = "ROLE_";
    public static final String AUTHORITY_DELIMITER = ",";
    public static final String USER_AUTHORITIES = "document:crate,document:read,document:update,document:delete";
    public static final String ADMIN_AUTHORITIES = "user:crate,user:read,user:update,user:delete";
    public static final String SUPER_ADMIN_AUTHORITIES = "user:crate,user:read,user:update,user:delete,document:crate,document:read,document:update,document:delete";
    public static final String MANAGER_AUTHORITIES = "document:crate,document:read,document:update,document:delete";
}

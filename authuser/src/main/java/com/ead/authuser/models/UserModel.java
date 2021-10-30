package com.ead.authuser.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TB_USERS")
public class UserModel implements Serializable {
    public static final long serialVersionUID = 1L;

    private UUID userId;
    private String 
}

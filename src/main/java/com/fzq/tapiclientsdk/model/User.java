package com.fzq.tapiinterface.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -4737574641314605857L;
    private String userName;
}

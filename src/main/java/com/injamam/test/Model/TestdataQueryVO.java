package com.injamam.test.Model;


import lombok.Data;

import java.io.Serializable;

@Data
public class TestdataQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String firstName;

    private String lastName;

}

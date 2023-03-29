package com.kapok;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.util.Date;

@Entity
public class User {
    @Id
    private Integer id;
    private String name;
    private Date createDate;
}

package com.example.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MESSAGEOFDAY")
public class MessageOfDay {

    @Id
    private Long id;
    private String message;

public Long getId() {
    return id;
}
public String getMessage() {
    return message;
}
public void setId(Long id) {
    this.id = id;
}

public void setMessage(String message) {
    this.message = message;
}

}
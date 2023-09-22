package com.test.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
    @Id
	private int id;
    @Column
	private String name;
    @Column
	 private double price;
}

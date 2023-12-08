package com.rafida.SeeHear.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "items")
public class Item {
    @Id
    private String itemId;
    private String itemName;
    private LocalDateTime detectionDateTime;

    // Constructors, getters, setters
}

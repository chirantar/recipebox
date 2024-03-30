package com.core.recipebox.model.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
public class Recipe {
    @Id
    String id;
    String name;
    String description;
    List<String> imageUrl;
}

package com.core.recipebox.model.dtos;

import lombok.Data;

import java.util.List;

@Data
public class RecipeRequest {
    String name;
    String description;
    List<String> imageUrl;
}

package com.core.recipebox.controller;

import com.core.recipebox.model.dtos.RecipeRequest;
import com.core.recipebox.model.entities.Recipe;
import com.core.recipebox.service.RecipeService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/recipe")
public class RecipeController {
    private final RecipeService recipeService;
    public RecipeController(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @GetMapping
    public ResponseEntity<List<Recipe>> getAllRecipe(){
        return ResponseEntity.ok(recipeService.getAllRecipe());
    }

    @PostMapping
    public ResponseEntity<Recipe> createRecipe(@RequestBody RecipeRequest request){
        return ResponseEntity.ok(recipeService.createRecipe(request));
    }

}

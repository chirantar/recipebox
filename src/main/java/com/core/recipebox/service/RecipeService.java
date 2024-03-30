package com.core.recipebox.service;

import com.core.recipebox.model.dtos.RecipeRequest;
import com.core.recipebox.model.entities.Recipe;
import com.core.recipebox.repository.RecipeRepository;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipe(){
        return recipeRepository.findAll();
    }

    public Recipe createRecipe(RecipeRequest recipeRequest){
        Recipe recipe = new Recipe();
        BeanUtils.copyProperties(recipeRequest, recipe);
        return recipeRepository.save(recipe);
    }
}

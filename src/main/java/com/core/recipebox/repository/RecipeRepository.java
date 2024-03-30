package com.core.recipebox.repository;

import com.core.recipebox.model.entities.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String> {
}

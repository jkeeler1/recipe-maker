package io.github.jkeeler1.recipemaker.recipe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    Recipe findById(Long id);
    List<Recip> findAll();
}
package com.dg.cardapio_backend.repositories;


import com.dg.cardapio_backend.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}

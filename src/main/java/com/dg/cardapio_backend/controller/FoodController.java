package com.dg.cardapio_backend.controller;

import com.dg.cardapio_backend.model.Food;
import com.dg.cardapio_backend.repositories.FoodRepository;
import com.dg.cardapio_backend.dto.FoodRequestDTO;
import com.dg.cardapio_backend.dto.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {

        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

    @GetMapping
    public List<FoodResponseDTO> getAll() {

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}

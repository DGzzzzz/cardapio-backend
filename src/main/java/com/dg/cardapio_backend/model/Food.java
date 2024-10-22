package com.dg.cardapio_backend.model;

import com.dg.cardapio_backend.dto.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "image")
    private String image;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    public Food(FoodRequestDTO data) {
        this.image = data.image();
        this.price = BigDecimal.valueOf(data.price());
        this.title = data.title();
    }
}

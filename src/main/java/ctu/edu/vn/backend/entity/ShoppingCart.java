package ctu.edu.vn.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "shopping_cart")
public class ShoppingCart {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "total_items")
    private Double totalItems;

    @Column(name = "total_price")
    private Double totalPrice;

    @OneToMany(mappedBy = "shoppingCart", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Item> items = new LinkedHashSet<>();

}
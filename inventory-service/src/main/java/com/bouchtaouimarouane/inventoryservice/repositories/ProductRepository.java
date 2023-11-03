package com.bouchtaouimarouane.inventoryservice.repositories;

import com.bouchtaouimarouane.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

package com.bouchtaouimarouane.billingservice.repositories;

import com.bouchtaouimarouane.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}

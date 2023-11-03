package com.bouchtaouimarouane.billingservice.repositories;

import com.bouchtaouimarouane.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}

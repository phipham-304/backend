package com.pap.carbon_credit.repo;

import com.pap.carbon_credit.model.Credit_Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepo extends JpaRepository<Credit_Item, Long> {
    
}

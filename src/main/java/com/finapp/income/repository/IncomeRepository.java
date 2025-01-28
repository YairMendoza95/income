package com.finapp.income.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finapp.income.model.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {

}

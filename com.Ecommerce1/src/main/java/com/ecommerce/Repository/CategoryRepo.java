package com.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.Category;

public interface CategoryRepo  extends JpaRepository<Category, Long> {

}

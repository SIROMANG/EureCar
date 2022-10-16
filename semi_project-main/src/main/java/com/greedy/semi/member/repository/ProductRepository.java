package com.greedy.semi.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greedy.semi.member.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {


	Product findCodeByProductPrice(int payAmt);
	




	

}

package com.fullproject.demo.fullproject.service;

import java.util.List;

import com.fullproject.demo.fullproject.blueprint.Zomato;

public interface ZomatoService {
		Zomato saveRestaurents(Zomato obj);
		List<Zomato> fetchAllRestaurents();
		Zomato fetchById(int restaurantId) throws Exception;
		Zomato updateRestaurents(int restaurantId, Zomato newVal);
		void deleteRestaurents(int id);
		
	}


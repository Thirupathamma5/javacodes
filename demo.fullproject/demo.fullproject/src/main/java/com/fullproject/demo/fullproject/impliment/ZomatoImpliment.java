package com.fullproject.demo.fullproject.impliment;

import java.util.List;

import com.fullproject.demo.fullproject.blueprint.Zomato;
import com.fullproject.demo.fullproject.repository.ZomatoInterface;
import com.fullproject.demo.fullproject.service.ZomatoService;

import org.springframework.stereotype.Service;

@Service
	public class ZomatoImpliment implements ZomatoService{
		private ZomatoInterface zomatoInt;

		public ZomatoImpliment(ZomatoInterface zomatoInt) {
			this.zomatoInt = zomatoInt;
		}
		

		@Override
		public Zomato saveRestaurents(Zomato obj) {
			return zomatoInt.save(obj);
		}

		@Override
		public List<Zomato> fetchAllRestaurents() {
			return zomatoInt.findAll();
		}

		@Override
		public Zomato fetchById(int restaurantId) throws Exception {
			// TODO Auto-generated method stub
			return  zomatoInt.findById(restaurantId).get(); 
		}

		@Override
		public Zomato updateRestaurents(int restaurantId, Zomato newVal) {
			// TODO Auto-generated method stub
			return zomatoInt.findById(restaurantId).get() ;
		}

		@Override
		public void deleteRestaurents(int id) {
			zomatoInt.deleteById(id);
				
			}

			}


package com.ss.vue.service;

import com.ss.vue.entity.Food;

import java.util.List;

public interface FoodService {
    List<Food> getList();

    Food getFoodById(Long fid);
}

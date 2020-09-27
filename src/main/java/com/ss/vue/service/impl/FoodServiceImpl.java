package com.ss.vue.service.impl;

import com.ss.vue.entity.Food;
import com.ss.vue.mapper.FoodMapper;
import com.ss.vue.service.FoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {


    @Resource
    private FoodMapper foodMapper;

    @Override
    public List<Food> getList() {
        return foodMapper.selectFoods();
    }
}

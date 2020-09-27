package com.ss.vue.mapper;


import com.ss.vue.entity.Food;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface FoodMapper {

    int deleteById(Long id);

    int insert(Food food);

    int updateById(Long id);

    List<Food> selectFoods();
}

package com.ss.vue.controller;

import com.ss.vue.entity.Food;
import com.ss.vue.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ss
 */
@Controller
@RequestMapping("/product")
public class FoodController {
    @Resource
    private FoodService foodService;

    @GetMapping("/list")
    @ResponseBody
    public List<Food> getList() {
        return foodService.getList();
    }

    @GetMapping("getProductById")
    @ResponseBody
    public Food getFoodById(Long fid) {
        return foodService.getFoodById(fid);
    }


}

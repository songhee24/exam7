package com.exam.exam7.service.ServiceImpl;

import com.exam.exam7.models.Restaurant;
import com.exam.exam7.factory.StructureService;
import com.exam.exam7.service.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    private static Map<Long,Restaurant> restaurants = new HashMap<>();

    @Override
    public List<Restaurant> getAll() {
        return new ArrayList<>(restaurants.values());
    }

    @Override
    public void deleteById(Long id) {
        restaurants.remove(id);
    }

    @Override
    public Restaurant getById(Long id) {
        return restaurants.get(id);
    }

    @Override
    public Restaurant save(Restaurant item) {
        return restaurants.put(item.getId(),item);
    }
}

package com.rafida.SeeHear.repository;

import com.rafida.SeeHear.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {
    // You can add custom queries or methods if needed
}

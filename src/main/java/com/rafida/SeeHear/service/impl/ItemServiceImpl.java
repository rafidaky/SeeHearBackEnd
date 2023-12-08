package com.rafida.SeeHear.service.impl;

import com.rafida.SeeHear.model.Item;
import com.rafida.SeeHear.repository.ItemRepository;
import com.rafida.SeeHear.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item saveItem(Item item) {
        // Implement any business logic if needed
        // For now, let's just save the item
        return itemRepository.save(item);
    }
}

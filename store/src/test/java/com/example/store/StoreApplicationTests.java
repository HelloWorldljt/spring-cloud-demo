package com.example.store;

import com.example.store.model.Storage;
import com.example.store.service.StorageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StoreApplicationTests {

    @Autowired
    private StorageService storageservice;

    @Test
    void contextLoads() {
        Storage storage = storageservice.selectByPrimaryKey(1L);
        System.out.println(storage);
    }

}

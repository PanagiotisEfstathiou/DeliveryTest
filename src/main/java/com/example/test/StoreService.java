package com.example.test;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StoreService extends BaseService<Store> {

    Store findByStoreName(String StoreName);
    List<Store> mostFamousStores();
    List<Store> mostFamousStoresPerCategory();



}

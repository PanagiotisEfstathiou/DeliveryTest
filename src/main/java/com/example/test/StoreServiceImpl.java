package com.example.test;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class StoreServiceImpl extends BaseServiceImpl<Store> implements StoreService {
    private final StoreRepository storeRepository;

    @Override
    public JpaRepository<Store, Long> getRepository() {
        return storeRepository;
    }

    public Store findByStoreName(final String storeName) {

        return storeRepository.findByStoreName(storeName);
    }


    @Override
    public List<Store> mostFamousStores() {
        return storeRepository.mostFamousStores();
    }

    @Override
    public List<Store> mostFamousStoresPerCategory() {
        return storeRepository.mostFamousStoresPerCategory();


    }
}
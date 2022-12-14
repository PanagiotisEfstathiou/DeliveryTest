package com.example.test;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("generate")
@AllArgsConstructor
public class SampleContent extends BaseComponent implements CommandLineRunner {

    private final AccountService accountService;
    private final ProductService productService;

    private final StoreService storeService;


    @Override
    public void run(String... args) throws Exception {

        List<Account> accounts = accountService.createAll(
                Account.builder().address("AAAA").
                        firstName("HI").
                        lastName("BYE").
                        mobilePhone("4").
                        email("7").
                        password("123")
                        .build()
        );

        logger.info("Accounts created: {}.", accounts);

        List<Product> products = productService.createAll(
                Product.builder().name("TEST").price(16).serial("s dfsdfsds").build()
        );

        List<Store> stores = storeService.createAll(
                Store.builder().catalog(products).storeName("gahg").storeRegion("saghxjgsa").storeCategory(StoreCategory.CHINESE).build()
        );
    }
}

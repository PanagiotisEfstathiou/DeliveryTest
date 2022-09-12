package com.example.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


//@Profile("print")
public class Whatever implements CommandLineRunner {
    public void run(String...args) throws Exception{
        Logger logger = LoggerFactory.getLogger(getClass());
        System.out.println("BBBBBBBBBBBBBBBBB");

        logger.info("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

        logger.warn("sdasdadadada,ambkjbfhbsjvbdhjbshfbhbsfhkcvhkbrvhbrdhgbhjebgvbekjjkgved");

        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZ");
    }

}

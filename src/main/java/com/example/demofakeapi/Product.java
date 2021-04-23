package com.example.demofakeapi;


import lombok.Data;

@Data
public class Product {
    int page;
    int total;
    com.example.demofakeapi.Data data[];
}

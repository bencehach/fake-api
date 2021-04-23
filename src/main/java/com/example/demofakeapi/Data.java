package com.example.demofakeapi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Data {
    String id;
    String name;
    String year;
    String color;
    String pantone_value;
}

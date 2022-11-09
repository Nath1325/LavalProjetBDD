package com.laval.projet.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TransformedData {
    private HashMap<String,Integer> restaurants;
    private float longueurCyclable;
}

package com.laval.projet.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Geometry {
    public String type;
    public ArrayList<ArrayList<Object>> coordinates;
}

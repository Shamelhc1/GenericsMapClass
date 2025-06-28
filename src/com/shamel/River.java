package com.shamel;

import java.util.ArrayList;

public class River extends Line{

    private String name;
    private String type;


    public River(String name, String type, ArrayList<Coordinates> coordinatesList) {
        super(coordinatesList);
        this.name = name;
        this.type = type;
    }

    @Override
    public String render() {
        return "%-15s \t %-15s \t %8s".formatted(name, type, super.getCoordinates());
    }

}

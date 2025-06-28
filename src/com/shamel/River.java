package com.shamel;

import java.util.ArrayList;

public class River extends Line{

    private String name;
    private String type;

    public River(ArrayList<Coordinates> coordinatesList) {
        super(coordinatesList);
    }

    @Override
    public String render() {
        return "%8s \t %8s \t %8s".formatted(name, type, super.getCoordinates());
    }

}

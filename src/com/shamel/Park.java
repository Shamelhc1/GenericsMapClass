package com.shamel;

public class Park extends Point{

    private String name;
    private String type;

    public Park(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public String render() {
        return "%8s \t %8s \t %8s".formatted(name, type, super.getCoordinates());
    }
}

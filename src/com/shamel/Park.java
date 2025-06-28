package com.shamel;

public class Park extends Point{

    private String name;
    private String type;

    public Park(String name, String type, Coordinates coordinates) {
        super(coordinates);
        this.name = name;
        this.type = type;
    }

    @Override
    public String render() {
        return "%8s \t %8s \t %8s".formatted(name, type, super.getCoordinates());
    }
}

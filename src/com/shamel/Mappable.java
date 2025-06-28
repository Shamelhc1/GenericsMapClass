package com.shamel;

import java.util.ArrayList;

record Coordinates(double latitude, double longitude){
    @Override
    public String toString() {
        return "{%.4f,%.4f}".formatted(latitude,longitude);
    }
}

public interface Mappable {

    String render();

}

abstract class Point implements Mappable{
    private Coordinates coordinates;

    public Point(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getCoordinates() {
        return coordinates.toString();
    }
}

abstract class Line implements Mappable{
    private ArrayList<Coordinates> coordinatesList;

    public Line(ArrayList<Coordinates> coordinatesList) {
        this.coordinatesList = coordinatesList;
    }

    public String getCoordinates() {
        return coordinatesList.toString();
    }
}


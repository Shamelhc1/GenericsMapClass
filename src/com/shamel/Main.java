package com.shamel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Park yellowstone = new Park("Yellowstone", "National Park", new Coordinates(44.4882, -110.5916));
        Park grandCanyon = new Park("Grand Canyon", "National Park", new Coordinates(36.0636, -112.1079));
        Park yosemite = new Park("Yosemite", "National Park", new Coordinates(37.8855, -119.5360));

        ArrayList<Coordinates> mississippiCoords = new ArrayList<>(Arrays.asList(
                new Coordinates(47.2160, -95.2348),
                new Coordinates(35.1556, -90.0659),
                new Coordinates(29.1566, -89.2495)));

        River mississippi = new River("Mississippi", "River", mississippiCoords);


        ArrayList<Coordinates> missouriCoords = new ArrayList<>(Arrays.asList(
                new Coordinates(45.9239, -111.4983),
                new Coordinates(38.8146, -90.1218)
        ));

        River missouri = new River("Missouri", "River", missouriCoords);

        ArrayList<Coordinates> coloradoCoords = new ArrayList<>(Arrays.asList(
                new Coordinates(40.4708, -105.8286),
                new Coordinates(36.1015, -112.0892),
                new Coordinates(34.2964, -114.1148),
                new Coordinates(31.7811, -114.7724)
        ));
        River colorado = new River("Colorado", "River", coloradoCoords);

        ArrayList<Coordinates> delawareCoords = new ArrayList<>(Arrays.asList(
                new Coordinates(42.2026, -75.00836),
                new Coordinates(39.4955, -75.5592)
        ));
        River delaware = new River("Delaware", "River", delawareCoords);

        List<Mappable> MappableElement = new ArrayList<>(List.of(yellowstone,
                grandCanyon,yosemite,mississippi , missouri, colorado, delaware));


       new Layer<>(MappableElement).renderLayer();
    }



}
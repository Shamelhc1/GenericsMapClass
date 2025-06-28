package com.shamel;

import java.util.List;

public class Layer <T extends Mappable>{

    private List<T> elements;

    public Layer(List<T> elements) {
        this.elements = elements;
    }

    public void addElements(T... t) {
        elements.addAll(List.of(t));
    }

    public void renderLayer(){
        for(var element : this.elements){
            System.out.println(element.render());
        }
    }

}

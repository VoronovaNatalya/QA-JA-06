package com.academy.telesens;

import com.academy.telesens.model.Button;
import com.academy.telesens.model.Component;
import com.academy.telesens.model.Label;

public class HomeTask {
    public static void main(String[] args) {
        VisualComponent [] vComponents = new VisualComponent[] {
                new Button(),
                new Label(),
                new Component(),
                new VisualComponent() {
                    @Override
                    public void draw() {
                        System.out.println("Anonymous component");
                    }
                },
                () -> System.out.println("Lambda component")
        };

        for (VisualComponent element : vComponents)
            element.draw();
    }
}

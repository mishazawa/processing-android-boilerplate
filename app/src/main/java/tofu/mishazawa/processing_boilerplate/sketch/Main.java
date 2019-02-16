package tofu.mishazawa.processing_boilerplate.sketch;

import processing.core.PApplet;

public class Main extends PApplet {

  public void settings() {
    size(600, 600);
  }

  public void setup() {

  }

  public void draw() {
    background(255);
    if (mousePressed) {
      ellipse(mouseX, mouseY, 50, 50);
    }
  }
}

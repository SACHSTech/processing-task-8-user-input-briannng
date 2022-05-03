import processing.core.PApplet;

public class Sketch extends PApplet {
	
	boolean upPressed;
  boolean downPressed;
  boolean leftPressed;
  boolean rightPressed;

  float rainX = 20;
  float rainY = 20;


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(32);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    if(keyPressed) {	
    // purple background   
    if (key == 'p') {
      background(102, 0, 153);
    } 
    // blue background
    else if (key == 'b') {
      background(51, 153, 255);
    } 
    // orange background
    else if (key == 'o') {
      background(255, 153, 0);
    }
  } 
    else {
    background(32);  
  }
    if (mousePressed){
    fill(255, 255, 255);
    cloud(90, 30, 130, 40);
    cloud(190, 30, 130, 40);
    cloud(290, 30, 130, 40);
    cloud(390, 30, 130, 40);
    } else {
    fill(204, 204, 204);
    cloud(90, 30, 130, 40);
    cloud(190, 30, 130, 40);
    cloud(290, 30, 130, 40);
    cloud(390, 30, 130, 40);
}
  }
    // Drawing Snow
  public void mouseClicked(){
    fill (255, 255, 255);
    ellipse(mouseX, mouseY, 15, 15);
    }
    // Raindrops
  public void keyPressed() {   
    if (keyCode == UP) {
      rainY--;
    } 
    else if (keyCode == DOWN) {
      rainY++;
    } 
    else if(keyCode == LEFT){
      rainX--;
    }
    else if(keyCode == RIGHT){
     rainX++; 
    }
    fill(51,204,255);
    ellipse(mouseX, mouseY, 20, 20);
    }
  public void mouseReleased(){
    // House
    fill(255, 255, 153);
    rect(100, 155, 200, 200);

    // Window
    fill(255, 255, 255);
    rect(110, 280, 50, 50);

    // Window
    fill(255, 255, 255);
    rect(238, 280, 50, 50);

    // Window Roof
    fill(51, 0, 0);
    rect(233, 280, 60, 5);

    // Window
    fill(255, 255, 255);
    rect(112, 200, 75, 50);

    // Window Roof
    fill(51, 0, 0);
    rect(107, 200, 85, 5);

    // Window
    fill(255, 255, 255);
    rect(213, 200, 75, 50);

    // Window Roof
    fill(51, 0, 0);
    rect(208, 200, 85, 5);

    // House Roof
    fill(255, 153, 0);
    triangle(200, 75, 325, 175, 75, 175);
    }
public void mouseDragged(){
    // Tree Leaves
    fill(0, 255, 51);
    ellipse(65, 220, 100, 100);

    // Tree Trunk
    fill(102, 51, 0);
    rect(55, 270, 20, 100);
  
}
   /**
 * Method for the clouds
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the clouds
 */
 public void cloud(float X1, float Y1, float X2, float Y2){
    ellipse(X1, Y1, X2, Y2);
  }
}

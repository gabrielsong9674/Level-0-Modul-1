void setup() {
  size(500, 500);
}
void draw() {
  background(250, 250, 250);
  noStroke();
  fill(229, 28, 28);
  ellipse(150, 200, 150, 150);
  fill(229, 28, 28);
  ellipse(212, 200, 150, 150);
  fill(16, 131, 36);
  rect(176, 103, 12, 32);
  
  if(mousePressed) {
  fill( 250, 250, 250);
  ellipse(75, 200, 30, 35);
  
  }
}


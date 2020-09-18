void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
  
  fill(242, 141, 215);
  ellipse(200, 150, 175, 100);
  
  fill(70, 55, 30);
  rect(200, 300, 200, 200);

  fill(242, 141, 215);
  ellipse(150, 60, 10, 100);
  ellipse(250, 60, 10, 100);

  fill(137, 245, 241);
  ellipse(165, 135, 20, 10);
  ellipse(235, 135, 20, 10);

  fill(142, 191, 189);
  ellipse(200, 155, 80, 20);

  fill(0);
  rect(200, 178, 90, 15);
}
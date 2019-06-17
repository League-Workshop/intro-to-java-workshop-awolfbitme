int x =198;
int y =185;
PImage catPic;

void setup(){
  size(600,400);
  catPic = loadImage("cat .jpg");
  catPic.resize(width, height);
  background(catPic);
}
 void draw(){
   noStroke();
   ellipse(x, y, 60, 60);
   fill(256,0,0);
 
  if(mousePressed){
 
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
} void  keyPressed() {
     x-=10;
     y-=10;
   }

  PImage mustache;
    PImage face;
    void setup(){
      face =loadImage("face.jpg");
  size(800, 600);
  face.resize(width,height);
  mustache = loadImage ("mustache.png");
  mustache.resize(300,100);
}


void draw(){
  background(face);
  image(mustache, mouseX-152, mouseY-50);
if (mouseButton == RIGHT) { 
}
}

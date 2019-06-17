void setup(){size(600,400);
}
void draw(){
  if(mousePressed){
    fill(255,10,0);}
    else{
      fill(random(10),0,200);}
  background(0,255,0);
  rect(150,30,300,300);
ellipse(200,200,50,50);
ellipse(400,200,50,50);
ellipse(300,250,80,50);
ellipse(mouseX,mouseY,20,20);
rect(150,120,300,20);
}

//Global Variables
Boolean nightMode=false;
//
void setup()
{
  size(700, 500);
}//End setup
//
void draw()
{
  if (nightMode == true) println("I am nocturnal");
  if (nightMode == false) println("");
}//End draw
//
void keyPressed() {}//End keyPressed
//
void mousePressed()
{
  if (mouseButton == LEFT) nightMode = true;
  if (mouseButton == RIGHT) nightMode = false;
}//End mousePressed

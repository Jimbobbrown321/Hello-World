import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class HelloWorld extends PApplet {

//Global Variables
char z;
char y;
String d;
String e;
String f;
String g;
String ten;
String h;
String one;
int two;
int skipCount=2;
//
public void setup()
{
  String secondSentence = "Mr. Mercer counts to 10, by 1."; //Local Variables
  //println(secondSentence);
  //Populations, Declaration, Valuing
  z = '.';
  y = ',';
  d = "Mr";
  e = "Mercer";
  f = "counts";
  g = "to";
  ten = "100";
  h = "by";
  one = "1";
  two = 1;
  println(d+z, e, f, g, ten+y, h, str(two)+z); //Casting, making an INTEGER into a STRING 
  println("One plus two is", PApplet.parseInt(one)+two); //Casting is int(one), to change STRING to INTEGER
}//End setup
//
public void draw()
{
  two+=1; // two+1, two++, two+=1
  println(d+z, e, f, g, ten+y, h, str(two)+z);
}//End draw
//
public void keyPressed() {
}//End keyPressed
//
public void mousePressed() {
}//End mousePressed
//
// What we will copy and paste from the Static Program
 // Concatenation
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "HelloWorld" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

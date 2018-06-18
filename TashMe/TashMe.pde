PImage mustache;
PImage friend;
void setup(){
  friend=loadImage("friend.png");
  size(800,600);
  friend.resize(width, height);
mustache=loadImage("Mustache.png");}
void draw(){
  background(friend);
if (mousePressed){
image(mustache,90,300);
}}
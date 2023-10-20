

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

for(int i = 0; i < 6; i++) {
  plane.startingAngle(90);
    plane.isTrail=true;
    plane.trailWidth = 10;
    plane.setColor(200,0,0);
    plane.move(100);
    plane.turn(120);
        plane.isTrail=true;
        plane.trailWidth = 10;
        plane.setColor(200,0,0);
        plane.move(100);
        plane.turn(120);
        plane.isTrail=true;
        plane.trailWidth = 10;
        plane.setColor(200,0,0);
        plane.move(100);
        plane.turn(120);
        plane.turn(60);
        plane.isTrail = false;
        plane.move(150);
}
            plane.startingAngle(90);
            plane.isTrail = true;
            plane.trailWidth = 10;
            plane.setColor(200, 0, 0);
            plane.move(100);
            plane.turn(90);
            plane.setColor(0, 200, 0);
            plane.move(100);
            plane.turn(90);
            plane.setColor(0, 0, 200);
            plane.move(100);
            plane.turn(90);
            plane.setColor(200, 0, 200);
            plane.move(100);
            plane.turn(-120);
            plane.setColor(100, 100, 0);
            plane.move(100);
            plane.turn(-120);
            plane.setColor(0, 200, 200);
            plane.move(100);
        plane.teleport(400,250);
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(100);
        plane.turn(90);
        plane.setColor(200, 0, 200);
        plane.move(100);
        plane.turn(-120);
        plane.setColor(100, 100, 0);
        plane.move(100);
        plane.turn(-120);
        plane.setColor(0, 200, 200);
        plane.move(100);




    }
//variables: plane.isTrail, plane.trailWidth
    //methods: plane.startingAngle, plane.setColor, plane.move, plane.turn

}

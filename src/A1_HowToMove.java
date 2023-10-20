public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.pausetime = 1;
        initials();


    }
        public void initials(){
        plane.isTrail = true;
        plane.move(100);
        plane.turn(180);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(50);
        plane.turn(180);
        plane.move(50);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);


        }
    }
//        plane.pausetime = 1;
//        plane.teleport(500, 100);
//        for (int i = 0; i < 6; i++) {
//            plane.isTrail = true;
//            shape(100, 300, 6);
//            plane.isTrail = false;
//            plane.move(120);
//        }
//
//
//    }
//
//    public void shape(int length, int angle, int sides) {
//        for (int i = 0; i < sides; i++) {
//            plane.move(length);
//            plane.turn(angle);
//        }
//    }
//}

//        System.out.println("This message will be printed to the window below.");
//        System.out.println("That window is called the dos window");
//        plane.pausetime = 2;
//        plane.startingAngle(0);
//        plane.isTrail = true;
//        plane.move(200);
//        plane.isTrail = false;
//        plane.startingAngle(45);
//        plane.move(100);
//        plane.isTrail = true;
//        plane.move(200);
//        //Data types:
//        //int -- integers: 1, 2, 3
//        //char -- characters: "A", "B"
//        //string -- word/sentence; "Hello"
//        //booleans -- True/False





/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/
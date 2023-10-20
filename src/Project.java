public class Project extends World {

    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("Dory.png");          //*** new method to load a diffrent JPG
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        plane.isTrail = true;
        plane.pausetime = 1;
        plane.setColor(255, 215, 0);
        plane.trailWidth = 20;
        plane.turn(90);
        plane.move(300);
        plane.turn(-90);
        plane.move(375);
        plane.turn(-90);
        plane.move(300);
        plane.turn(-90);
        plane.move(375);


        for (int row = 1; row < plane.getBackGroundHeight(); row++)    //*** this is using new getBackground
        {
            for (int col = 1; col < plane.getBackGroundWidth(); col++)    //*** this is using new getBackgroun
            {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();


                if ((red > 0 && green > 70 && blue > 150) && (red < 115 && green < 200 && blue < 255)) {
                    plane.setPixelColor(255, 165, 0);
                }

                if ((red > 140 && green > 20 && blue > 25) && (red < 255 && green < 50 && blue < 50)) {
                    plane.setPixelColor(0, 0, 255);
                }

            }
        }
       plane.trailWidth = 1;
        plane.pausetime=1;
        multipleRows();

    }

    public void drawSquare() {
        for (int i = 1; i <= 4; i = i + 1) {
            plane.isTrail = true;
            plane.turn(90);
            plane.move(20);
        }

    }

    public void multipleRows() {
        for (int i = 1; i < 17; i++) {
            for (int j = 1; j < 20; j++) {
                plane.teleport(i * 20, j * 20);
                plane.setColor(i * 10, 0, 0);
                drawSquare();
            }
        }
    }
}
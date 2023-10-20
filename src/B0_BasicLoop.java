public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go()  {
plane.pausetime = 0;
//    rowOfSquares();
        multipleRows();
}

//        for (int i = 1; i <=5; i = i + 1) {
//            for (int j = 1; j <= i; j = j + 1){
//
//                System.out.print("*");
//            }
//            System.out.println("");
//            //   plane.square(100);




    public void rowOfSquares(){
        for(int i = 1; i<=4; i=i+1) {
            plane.teleport(i*10, 100);
            drawSquare();
        }

    }

    public void drawSquare() {
        for (int i = 1; i <= 4; i = i + 1) {
            plane.isTrail = true;
            plane.turn(90);
            plane.move(10);
        }

    }

    public void multipleRows(){
        for(int i = 1 ; i < 100; i++){
            for(int j = 1; j < 100; j++){
                plane.teleport(i* 10, j*10);
                plane.setColor(i*2,0,0);
                drawSquare();
                //1: i = 1, j=1
                //2: i = 1, j=2
                //3: i = 1, j=3
                //4: i = 2, j=1
                //5: i = 2, j=2
                //6: i = 2, j=3
                //7: i = 3, j=1
                //8: i = 3, j=2
                //9: i = 3, j=3

            }
        }
    }


    public void CountDown(){
           for (int i = 7; i>=1; i = i - 1)

           {
               System.out.println(i);
           }
       }

}

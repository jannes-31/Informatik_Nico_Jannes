import sas.*;
import java.awt.Color;
class World {
    public static void main(String[] args) {
        new World();
    }

    View fenster;
    Rectangle boden, gras;
    Baum baum1, baum2;
    Wolke wolke1, wolke2;
    Haus haus;
    RauchWolke rauchWolke;
    Sonne sonne;
    FensterLichtAn lichtAn;
    FensterLichtAus lichtAus;



    Color braun = new Color(139, 90, 43);
    Color grasGruen = new Color(50, 205, 50);
    Color himmelBlau = new Color(0, 191, 255);
    Color himmelNacht = new Color(16, 78, 139);


    World()
    {
        fenster = new View(1200, 800);

        sonne = new Sonne();

        lichtAn = new FensterLichtAn();
        lichtAus = new FensterLichtAus();


        boden = new Rectangle(0, 725, 1200, 75);
        boden.setColor(braun);

        gras = new Rectangle(0, 700, 1200, 25);
        gras.setColor(grasGruen);

        baum1 = new Baum(150);
        baum2 = new Baum(900);


        wolke1 = new Wolke(200, 200);
        wolke2 = new Wolke(800, 150);


        rauchWolke = new RauchWolke(580, 350);



        haus = new Haus();


        while (true)
        {
            wolke1.moveCloud(1);
            wolke2.moveCloud(2);
            rauchWolke.moveRauchwolke(1);
            sonne.move();

            if (wolke1.x > 1200) wolke1.moveCloud(-1500);
            if (wolke2.x > 1200) wolke2.moveCloud(-1500);
            if (rauchWolke.y < -30) rauchWolke.moveRauchwolke(-380);

            if (sonne.x > 1250 || sonne.x < -50) fenster.setBackgroundColor(himmelNacht);
                else fenster.setBackgroundColor(himmelBlau);

            if (sonne.x > 1250 || sonne.x < -50 ) lichtAn = new FensterLichtAn();
            else lichtAus = new FensterLichtAus();



            try
            {
                Thread.sleep(30);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }


    }

}

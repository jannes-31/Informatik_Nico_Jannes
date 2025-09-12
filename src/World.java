import sas.*;

import javax.swing.*;
import java.awt.Color;
class World {
    public static void main(String[] args) {
        new World();
    }

    View fenster;
    Rectangle boden, gras, lichtAn, lichtAus;
    Baum baum1, baum2;
    Wolke wolke1, wolke2;
    Haus haus;
    RauchWolke rauchWolke;
    Sonne sonne;
    FensterRahmen rahmen = new FensterRahmen();


    Color braun = new Color(139, 90, 43);
    Color grasGruen = new Color(50, 205, 50);
    Color himmelBlau = new Color(0, 191, 255);
    Color himmelNacht = new Color(16, 78, 139);
    Color fensterlichtaus = new Color(92,69,53);


    World()
    {
        fenster = new View(1200, 800);

        sonne = new Sonne();

        haus = new Haus();

        lichtAus = new Rectangle(550,580,120,80);
        lichtAus.setColor(fensterlichtaus);
        lichtAn = new Rectangle(550,580,120,80);
        lichtAn.setColor(Color.yellow);

        boden = new Rectangle(0, 725, 1200, 75);
        boden.setColor(braun);

        gras = new Rectangle(0, 700, 1200, 25);
        gras.setColor(grasGruen);

        baum1 = new Baum(150);
        baum2 = new Baum(900);

        wolke1 = new Wolke(200, 200);
        wolke2 = new Wolke(800, 150);

        rauchWolke = new RauchWolke(580, 350);

        rahmen = new FensterRahmen();

        new Thread(() ->
        {
            while (true)
            {
                wolke1.moveCloud(1);
                wolke2.moveCloud(2);
                rauchWolke.moveRauchwolke(1);
                sonne.move();

                if (wolke1.x > 1200) wolke1.moveCloud(-1500);
                if (wolke2.x > 1200) wolke2.moveCloud(-1500);
                if (rauchWolke.y < -30) rauchWolke.moveRauchwolke(-380);

                if (sonne.x > 1275 || sonne.x < -50) fenster.setBackgroundColor(himmelNacht);
                else fenster.setBackgroundColor(himmelBlau);

                if (sonne.x > 1275 || sonne.x < -50) lichtAn.setHidden(false);
                else lichtAn.setHidden(true);

                try
                {
                    Thread.sleep(30);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

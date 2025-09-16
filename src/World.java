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

    // Die Objekte des Bildes werden deklariert, sodass man sie innerhalb des Codes aufrufen kannst

    Color braun = new Color(139, 90, 43);
    Color grasGruen = new Color(50, 205, 50);
    Color himmelBlau = new Color(0, 191, 255);
    Color himmelNacht = new Color(16, 78, 139);
    Color fensterlichtaus = new Color(92,69,53);

    // Deklarierung der Farben, die in den Objekten der Welt genutzt werden, die java.awt.Color nicht vorweisen kann

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

        //Erstellung der einzelnen Objekte aus denen die Welt besteht

        new Thread(() ->
        {
            while (true)
            {
                wolke1.moveCloud(1);
                wolke2.moveCloud(2);
                rauchWolke.moveRauchwolke(1);
                sonne.move();

                //Methode zur Bewegung der Wolke, sowie die der Rauchwolke

                if (wolke1.x > 1200) wolke1.moveCloud(-1500);
                if (wolke2.x > 1200) wolke2.moveCloud(-1500);
                if (rauchWolke.y < -30) rauchWolke.moveRauchwolke(-380);

                //Methode zur Zurückbewegung der Wolke, sowie der Rauchwolke, sobald sie den Bildschirm verlassen

                if (sonne.x > 1275 || sonne.x < -50) fenster.setBackgroundColor(himmelNacht);
                else fenster.setBackgroundColor(himmelBlau);

                //if-else Verzweigung der Schleife welche die Farbe des Hintergrundes ändert in Tag und Nacht, je nachdem ob
                //die Sonne auf dem Bildschirm ist oder nicht

                if (sonne.x > 1275 || sonne.x < -50) lichtAn.setHidden(false);
                else lichtAn.setHidden(true);

                //if-else Verzweigung der Schleife welche das Fensterlicht sichtbar macht, sobald die Sonne den Bildschirm verlässt

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

import sas.*;
import java.awt.Color;
class World
{
    public static void main(String[] args) {
        new World();
    }

    View        fenster;
    Rectangle   boden, gras;
    Baum        baum1, baum2;
    Wolke       wolke1, wolke2;
    Haus        haus;


    Color braun             = new Color(139,90,43);
    Color grasGruen         = new Color(50,205,50);
    Color himmelBlau        = new Color(0,191,255);


    World()
    {
        fenster = new View(1200,800);
        fenster.setBackgroundColor(himmelBlau);

        boden = new Rectangle(0,725,1200,75);
        boden.setColor(braun);

        gras = new Rectangle(0,700,1200,25);
        gras.setColor(grasGruen);

        baum1 = new Baum(150);
        baum2 = new Baum(900);


        wolke1 = new Wolke(200,200);
        wolke2 = new Wolke(800,150);

        haus = new Haus();

        while (true)
        {
            wolke1.moveCloud(1);
            wolke2.moveCloud(2);

            if (wolke1.x > 1200) wolke1.moveCloud(-1500);
            if (wolke2.x > 1200) wolke2.moveCloud(-1500);

            try
            {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

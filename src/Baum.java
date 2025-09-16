import sas.*;
import java.awt.Color;
class Baum
{
    Rectangle   baumstamm;

    Circle      baumKrone1;
    Circle      baumKrone2;
    Circle      baumKrone3;

    Ellipse     zitrone1;
    Ellipse     zitrone2;
    Ellipse     zitrone3;

    Color baumstammBraun  =  new Color(139,69,19);
    Color blattGruen       =  new Color(34,139,34);

    //Deklarierung der Objekte und Farben aus denen Baum und Zitronen bestehen

    Baum(int x)
    {
        baumstamm = new Rectangle(x,500,50,200);
        baumstamm.setColor(baumstammBraun);


        baumKrone1 = new Circle(x-70,450,50);
        baumKrone1.setColor(blattGruen);

        baumKrone2 = new Circle(x+10,457,50);
        baumKrone2.setColor(blattGruen);

        baumKrone3 = new Circle(x-30,390,50);
        baumKrone3.setColor(blattGruen);


        zitrone1 = new Ellipse(x-35,495,15,10);
        zitrone1.setColor(Color.yellow);
        zitrone1.turn(10);

        zitrone2 = new Ellipse(x+10,440,15,10);
        zitrone2.setColor(Color.yellow);
        zitrone2.turn(-5);

        zitrone3 = new Ellipse(x+60,510,15,10);
        zitrone3.setColor(Color.yellow);
        zitrone3.turn(3);

    }

    //Erstellung von Baum und Zitronen

}

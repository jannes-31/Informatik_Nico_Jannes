import sas.*;
import java.awt.Color;
class Haus
{

    Polygon dach;
    Rectangle wand, door, schornstein, fensterRahmen1, fensterRahmen2, fensterRahmen3, fensterRahmen4, fensterKreuz1, fensterKreuz2, fensterLicht;
    Circle doorKnob;

    //Deklarierung der verschiedenen Objekte aus welchen das Haus besteht

    Color wandGrau      = new Color(121, 85, 60);
    Color dachRot       = new Color(205,51,51);
    Color tuerGrau      = new Color(139, 69, 19);
    Color doorknobGold  = new Color(255,185,15);
    Color schornsteinBraun  = new Color (139, 26, 26);

    //Deklarierung der einzelnen Farben in welche das Haus gefärbt wird

    Haus()
    {
        wand = new Rectangle(400,500,300,200);
        wand.setColor(wandGrau);


        schornstein = new Rectangle(600,380,30,85);
            schornstein.setColor(schornsteinBraun);


        dach = new Polygon(550,400);
            dach.add(-150,+100);
            dach.add(+150,+100);
            dach.setColor(dachRot);


        door = new Rectangle(440,580,60,120);
            door.setColor(tuerGrau);
        doorKnob = new Circle(480,635,5);
            doorKnob.setColor(doorknobGold);
    }

    //Erstellung des Hauses

}
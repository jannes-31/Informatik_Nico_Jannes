import sas.*;
import java.awt.Color;
class Haus
{

    Polygon dach;
    Rectangle wand, door, schornstein, fensterRahmen1, fensterRahmen2, fensterRahmen3, fensterRahmen4, fensterKreuz1, fensterKreuz2, fensterLicht;
    Circle doorKnob;


    Color wandGrau      = new Color(140,140,140);
    Color dachRot       = new Color(205,51,51);
    Color tuerGrau      = new Color(51,51,51);
    Color doorknobGold  = new Color(255,185,15);
    Color fensterGrau   = new Color(179,179,179);
    Color schornsteinBraun  = new Color (139,26,26);


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

        fensterLicht = new Rectangle(550,580,120,80);
            fensterLicht.setColor(Color.yellow);


        fensterRahmen1 = new Rectangle(550,580,120,5);
            fensterRahmen1.setColor(fensterGrau);
        fensterRahmen2 = new Rectangle(550,580,5,80);
            fensterRahmen2.setColor(fensterGrau);
        fensterRahmen3 = new Rectangle(665,580,5,80);
            fensterRahmen3.setColor(fensterGrau);
        fensterRahmen4 = new Rectangle(550,655,120,5);
            fensterRahmen4.setColor(fensterGrau);


        fensterKreuz1 = new Rectangle(607,580,5,80);
            fensterKreuz1.setColor(fensterGrau);
        fensterKreuz2 = new Rectangle(550,618,120,5);
            fensterKreuz2.setColor(fensterGrau);


    }

}
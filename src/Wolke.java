import sas.*;
import java.awt.Color;
class Wolke
{
    Ellipse wolke1, wolke2, wolke3, wolke4, wolke5, wolke6;

    int x, y;

    //Deklarierung der Teile der Wolke und int x und y als Koordinaten

    Wolke(int startX, int startY) {
        x = startX;
        y = startY;
        createCloud();
    }

    //Erstellung der Wolke an den Koordinaten startX und startY

    void createCloud()
    {
        wolke1 = new Ellipse(x,y,70,70);
        wolke1.setColor(Color.white);

        wolke2 = new Ellipse(x+30,y-35,95,95);
        wolke2.setColor(Color.white);

        wolke3 = new Ellipse(x+90,y-50,120,120);
        wolke3.setColor(Color.white);

        wolke4 = new Ellipse(x+30,y+10,120,80);
        wolke4.setColor(Color.white);

        wolke5 = new Ellipse(x+100,y+35,90,60);
        wolke5.setColor(Color.white);

        wolke6 = new Ellipse(x+150,y-10,90,90);
        wolke6.setColor(Color.white);

    }

    //Konstruktor zur Erstellung der einzelnen Objekte der Wolke

    void moveCloud(int dx)
    {
     x += dx;
     wolke1.moveTo(x, y);
     wolke2.moveTo(x + 30, y - 35);
     wolke3.moveTo(x + 90, y - 50);
     wolke4.moveTo(x + 30, y + 10);
     wolke5.moveTo(x + 100, y + 35);
     wolke6.moveTo(x + 150, y - 10);
    }

    //Festlegung der Startkoordinaten der einzelnen Objekte der Wolke

}
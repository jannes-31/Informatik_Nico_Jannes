import sas.*;
import java.awt.Color;
class RauchWolke
{
    Ellipse rauch1,rauch2,rauch3,rauch4,rauch5;

    Color rauchGrau = new Color(115,115,115);

    int x, y;

    RauchWolke(int startX, int startY)
    {
        x = startX;
        y = startY;
        createRauchwolke();
    }
    void createRauchwolke()
    {
        rauch1 = new Ellipse(x+30,y+5,30,20);
        rauch1.setColor(rauchGrau);
        rauch1.turn(180);

        rauch2 = new Ellipse(x+10,y,40,20);
        rauch2.setColor(rauchGrau);
        rauch2.turn(180);

        rauch3 = new Ellipse(x+35,y+10,30,20);
        rauch3.setColor(rauchGrau);
        rauch3.turn(180);

        rauch4 = new Ellipse(x+15,y+15,40,20);
        rauch4.setColor(rauchGrau);
        rauch4.turn(180);

        rauch5 = new Ellipse(x,y+10,30,20);
        rauch5.setColor(rauchGrau);
        rauch5.turn(180);
    }
    void moveRauchwolke(int dy)
    {
        y -= dy;
        rauch1.moveTo(x+30, y+5);
        rauch2.moveTo(x + 10, y);
        rauch3.moveTo(x + 35, y +10);
        rauch4.moveTo(x + 15, y + 15);
        rauch5.moveTo(x, y + 10);
    }
}

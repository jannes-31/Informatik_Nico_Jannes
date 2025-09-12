import sas.*;
import java.awt.*;
import java.awt.event.*;
class Sonne
{
    Circle sonne;
    int baseY = 600;
    int amplitude = -600;
    double frequency = 0.003;
    int x = 0;
    int y = 0;

    Sonne()
    {
        sonne = new Circle(400,300,75);
        sonne.setColor(Color.yellow);
    }

    void move()
    {
        int y = (int)(baseY + amplitude * Math.sin(frequency*x));
        sonne.moveTo(x,y);

        x +=2;


        if (x > 2000)
        {
            x = -200;
        }

    }


}

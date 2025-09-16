import sas.*;
import java.awt.*;
import java.awt.event.*;
class Sonne
{
    Circle sonne;

    //Deklarierung des circles der später zur Sonne wird

    int baseY = 600;
    int amplitude = -600;
    double frequency = 0.003;
    int x = 0;

    //Deklarierung der Sinus-Funktion zur Bewegung der Sonne

    Sonne()
    {
        sonne = new Circle(400,300,75);
        sonne.setColor(Color.yellow);
    }

    //Erstellung der Sonne

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

    //Methode zur Bewegung der Sonne mit der vorher deklarierten Sinus-Funktion


}

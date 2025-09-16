import sas.*;
import java.awt.Color;
class FensterRahmen
{
    Rectangle fensterRahmen1, fensterRahmen2, fensterRahmen3, fensterRahmen4, fensterKreuz1, fensterKreuz2;
    Color fensterGrau   = new Color(139, 69, 19);

    //Deklarierung der Objekte und Farben aus welchen der Fensterrahmen besteht

    FensterRahmen()
    {
        fensterRahmen1 = new Rectangle(550,580,120,5);
        fensterRahmen1.setColor(fensterGrau);
        fensterRahmen2 = new Rectangle(550,580,5,80);
        fensterRahmen2.setColor(fensterGrau);
        fensterRahmen3 = new Rectangle(665,580,5,80);
        fensterRahmen3.setColor(fensterGrau);
        fensterRahmen4 = new Rectangle(550,655,120,5);
        fensterRahmen4.setColor(fensterGrau);

        //Erstellung des äußeren Rahmens des Fensterrahmens

        fensterKreuz1 = new Rectangle(607,580,5,80);
        fensterKreuz1.setColor(fensterGrau);
        fensterKreuz2 = new Rectangle(550,618,120,5);
        fensterKreuz2.setColor(fensterGrau);

        //Erstellung des mittleren Kreuzes des Fensterrahmens

    }
}

import java.awt.*;
import java.applet.*;


public class H62Rkn extends Applet {
    int min, uur, dag;
    double totaal;


    public void init() {
        min = 60;
        uur = (60*60);
        dag = ((60*60)*24);
        totaal = min + uur + dag;
    }

    public void paint(Graphics g) {

        g.drawString("Het totaal van alles bij elkaar is: " + totaal, 20, 80);
        g.drawString("Seconden", 245, 80);
        g.drawString("Een min duurt:" + min , 20, 20);
        g.drawString("Seconden", 120, 20);
        g.drawString("Een uur duurt:" + uur , 20, 40);
        g.drawString("Seconden", 130, 40);
        g.drawString("Een dag duurt:" + dag , 20, 60);
        g.drawString("Seconden", 140, 60);
    }
}
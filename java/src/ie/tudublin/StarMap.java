package ie.tudublin;

import java.util.ArrayList;

import com.jogamp.opengl.util.texture.spi.TGAImage.Header;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet {


    ArrayList<Star> stars = new ArrayList<Star>();

    public float border;
    
    void drawGrid()
    {
        background(0);
        stroke(225, 0, 225);
        textAlign(CENTER, CENTER);
        textSize(20);
        for(int i= -5; i <=5; i ++)
        {
            float x = map(i, -5, 5, border, width - border);
            line(x, border, x, height - border);
            line(border, x, width - border, x);
            fill(225);
            text(i, x, border *0.5f);
            text(i, border * 0.5f, x);
    
        }

    }


    void printStars()
    {
        for(Star s:stars)
        {
            System.out.println(s);
        }
    }

    void loadStars()
    {
        Table table = loadTable("HabHYG15ly.csv", "header");

        for(TableRow r:table.rows())
        {
            Star s = new Star(r);
            stars.add(s);
        }
    }

    public void settings() {
        size(800, 800);
    }


    Star first = null;
    Star second = null;

    
    public void mouseClicked()
    {
        for(Star= s:stars)
        {
            float x = map(s.getxG(), -5, 5, border, width - border);
            float y = map(s.getyG(), -5, 5, border, width - border);
        }
        if (dist(mouseX, mouseY, x,y) < 20)
        {
            if(first == null)
            {
                first =5;
                break;
            }
            else if (second == null)
            {
                second = 5;
                break;
            }
            else
            {
                first = 5;
                second = null;
                break;
            }
        }
    }

    public void setup() {
        colorMode(RGB);
        loadStars();
        printStars();

        border = width * 0.1f;
    }

    public void drawStars()
    {
        for(Star s:stars)
        {
            s.render(this);
        }
    }

    public void draw() 
    {
        background(0);
        drawGrid();
        drawStars();
    }

    if (first != null)
    {
        float x = map(first.getxG(), -5, 5, border, width - border);
        float y = map(first.getyG(), -5, 5, border, width - border);

        if (second != null)
        {
            float x2 = map(seond.getxG(), -5,5, border, width - border);
            float y2 = map(seond.getyG(), -5,5, border, width - border);

            stroke(255);
            line(x,y,x2,y2);

            float dist = dist(first.getxG(), first.getyG(), second.getyG());
        }
    }


}
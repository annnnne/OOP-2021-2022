package ie.tudublin;

import processing.core.PApplet;

public class YASC extends PApplet
{
    float x, y;
    float w;
    float halfW;


    void drawPlayer(float x, float y, float w)
    {
        float halfW = w /2;
        stroke(255);
        line( x - halfW, y + halfW, x,y, - halfW);
        line( x, y - halfW, y + halfW, y, - halfW);
        line( x + halfW, y + halfW, x,y);
        line(x,y,x - halfW, y + halfW);
    }



    public void setup()
    {
        x = width / 2;
        y = height / 2;
        w = 100;
    }

    public void settings()
    {
        size(500,500);
    }
 
    public void draw()
    {
        background(0);
        p.update();
        p1.render();

        drawPlayer(x, y, w);
    }  
    
    public void update()
    {
        if (yasc.keyPresent)
        {
            if(yasc.key =='w')
            {
                y --i;

            }
            if
        }
    }
}

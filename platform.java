import java.awt.Graphics;
import java.awt.Color;

public class platform
{
    private int x = (int)(Math.random()*898+1), y, velocity = (int)(Math.random()*7+4), length, width;
    private Color col;
   
    public platform(int yCoor, int l, int w, Color c)
    {
        y = yCoor;
        length = l;
        width = w;
        col = c;
    }
    public int getWidth()
    {
        return width;
    }
    public int getLength()
    {
        return length;
    }
   
    public boolean left()
    {
        boolean output = false;
        if(x>900)
            output = true;
        return output;
    }
   
    public boolean right()
    {
        boolean output = false;
        if(x<0)
            output = true;
        return output;
    }
   
    public void act()
    {        
        if(left())
            velocity*=-1;
        if(right())
            velocity*=-1;
        x+=velocity;      
    }
   
    public void drawSelf(Graphics g)    
    {
        g.setColor(col);
        g.fillRect(x, y, length, width);      
    }
   
    public int getVelocity()
    {
        return velocity;
    }
   
    public int getX()
    {
        return x;
    }
   
    public int getY()
    {
        return y;
    }
   
    public void setY(int newY)
    {
        y = newY;
    }
}
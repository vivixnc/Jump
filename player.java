import java.awt.Graphics;
import java.awt.Color;

public class player
{
    private int diam = 50, x = 450, y = 450, vx = 0, vy, hp = 100;
    private Color col = Color.yellow;
   
    public player(int v)
    {
        vx = v;
    }
   
    public void drawSelf(Graphics g)
    {
        g.setColor(col);
        g.fillOval(x, y, diam, diam);
    }
   
    public void act()
    {        
        x+=vx;      
    }
   
    public int getDiam()
    {
        return diam;
    }
    public int getY()
    {
        return y;
    }
   
    public int getX()
    {
        return x;
    }
   
    public int getVx()
    {
        return vx;
    }
   
    public void setY(int newY)
    {
        y = newY;
    }
   
    public void setX(int newX)
    {
        x = newX;
    }
   
    public void setVx(int v)
    {
        vx = v;
    }
   
}
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Font;
public class Jump extends JComponent implements KeyListener, MouseListener, MouseMotionListener
{
    
    public static void main(String[] args)
    {
        Jump gui = new Jump();
        gui.start(60);
    }
    
    //instance vars
    private int width, height;
    private player p = new player(0);
    private platform p5 = new platform(0, 100, 20, Color.blue);
    private platform p4 = new platform(100, 100, 20, Color.blue);
    private platform p3 = new platform(200, 100, 20, Color.blue);
    private platform p2 = new platform(300, 100, 20, Color.blue);
    private platform p1 = new platform(400, 100, 20, Color.blue);
    private platform p6 = new platform(-100, 80, 20, Color.GREEN);
    private platform p7 = new platform(-200, 80, 20, Color.GREEN);
    private platform p8 = new platform(-300, 80, 20, Color.GREEN);
    private platform p9 = new platform(-400, 80, 20, Color.GREEN);
    private platform p10 = new platform(-500, 80, 20, Color.GREEN);
    private platform p11 = new platform(-600, 70, 20, Color.CYAN);
    private platform p12 = new platform(-700, 70, 20, Color.CYAN);
    private platform p13 = new platform(-800, 70, 20, Color.CYAN);
    private platform p14 = new platform(-900, 70, 20, Color.CYAN);
    private platform p15 = new platform(-1000, 70, 20, Color.CYAN);
    private platform p16 = new platform(-1100, 50, 20, Color.WHITE);
    private platform p17 = new platform(-1200, 50, 20, Color.WHITE);
    private platform p18 = new platform(-1300, 50, 20, Color.WHITE);
    private platform p19 = new platform(-1400, 50, 20, Color.WHITE);
    private platform p20 = new platform(-1500, 50, 20, Color.WHITE);
    private int platformNumber, leftOfPlat, rightOfPlat, points = 0;  
    private boolean jump = true;
    public Jump()
    {               
        width = 1000;
        height = 500;
        platformNumber = 0;
        JFrame gui = new JFrame();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Jump");
        gui.setPreferredSize(new Dimension(width + 5, height + 30));
        gui.setResizable(false);
        gui.getContentPane().add(this);
        gui.pack();
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.addKeyListener(this);
        gui.addMouseListener(this);
        gui.addMouseMotionListener(this);
    }
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        if(key==38)
        {
            if(jump)
            {
                if(platformNumber == 0)
                {
                    leftOfPlat = p1.getX()-25;
                    rightOfPlat = p1.getX() +p1.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 1;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                else
                    jump = false;
                }
                else if(platformNumber == 1)
                {
                    leftOfPlat = p2.getX()-25;
                    rightOfPlat = p2.getX() +p2.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 2;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 2)
                {
                    leftOfPlat = p3.getX()-25;
                    rightOfPlat = p3.getX() +p3.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 3;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 3)
                {
                    leftOfPlat = p4.getX()-25;
                    rightOfPlat = p4.getX() +p4.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 4;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 4)
                {
                    leftOfPlat = p5.getX()-25;
                    rightOfPlat = p5.getX() +p5.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 5;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 5)
                {
                    leftOfPlat = p6.getX()-25;
                    rightOfPlat = p6.getX() +p6.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 6;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 6)
                {
                    leftOfPlat = p7.getX()-25;
                    rightOfPlat = p7.getX() +p7.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 7;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 7)
                {
                    leftOfPlat = p8.getX()-25;
                    rightOfPlat = p8.getX() +p8.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 8;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 8)
                {
                    leftOfPlat = p9.getX()-25;
                    rightOfPlat = p9.getX() +p9.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 9;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 9)
                {
                    leftOfPlat = p10.getX()-25;
                    rightOfPlat = p10.getX() +p10.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 10;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 10)
                {
                    leftOfPlat = p11.getX()-25;
                    rightOfPlat = p11.getX() +p11.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 11;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 11)
                {
                    leftOfPlat = p12.getX()-25;
                    rightOfPlat = p12.getX() +p12.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 12;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 12)
                {
                    leftOfPlat = p13.getX()-25;
                    rightOfPlat = p13.getX() +p13.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 13;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 13)
                {
                    leftOfPlat = p14.getX()-25;
                    rightOfPlat = p14.getX() +p14.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 14;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 14)
                {
                    leftOfPlat = p15.getX()-25;
                    rightOfPlat = p15.getX() +p15.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 15;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 15)
                {
                    leftOfPlat = p16.getX()-25;
                    rightOfPlat = p16.getX() +p16.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 16;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 15)
                {
                    leftOfPlat = p16.getX()-25;
                    rightOfPlat = p16.getX() +p16.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 16;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 16)
                {
                    leftOfPlat = p17.getX()-25;
                    rightOfPlat = p17.getX() +p17.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 17;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 17)
                {
                    leftOfPlat = p18.getX()-25;
                    rightOfPlat = p18.getX() +p18.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 18;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 18)
                {
                    leftOfPlat = p19.getX()-25;
                    rightOfPlat = p19.getX() +p19.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 19;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
                else if(platformNumber == 19)
                {
                    leftOfPlat = p20.getX()-25;
                    rightOfPlat = p20.getX() +p20.getLength()+25;
                    if(p.getX() >= leftOfPlat && p.getX() + p.getDiam() <=rightOfPlat)
                    {
                        points++;
                        platformNumber = 20;
                        p.setY(p.getY()-100);
                        p1.setY(p1.getY()+80);
                        p2.setY(p2.getY()+80);
                        p3.setY(p3.getY()+80);
                        p4.setY(p4.getY()+80);
                        p5.setY(p5.getY()+80);
                        p6.setY(p6.getY()+80);
                        p7.setY(p7.getY()+80);
                        p8.setY(p8.getY()+80);
                        p9.setY(p9.getY()+80);
                        p10.setY(p10.getY()+80);
                        p11.setY(p11.getY()+80);
                        p12.setY(p12.getY()+80);
                        p13.setY(p13.getY()+80);
                        p14.setY(p14.getY()+80);
                        p15.setY(p15.getY()+80);
                        p16.setY(p16.getY()+80);
                        p17.setY(p17.getY()+80);
                        p18.setY(p18.getY()+80);
                        p19.setY(p19.getY()+80);
                        p20.setY(p20.getY()+80);
                        p.setY(p.getY()+80);
                    }
                    else
                        jump = false;
                }
            }       
        }
    }
    
    public void paintComponent(Graphics g)
    {
        //setting background color
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1000, 500);
        //adding platforms
        p5.drawSelf(g);
        p4.drawSelf(g);
        p3.drawSelf(g);
        p2.drawSelf(g);
        p1.drawSelf(g);
        p6.drawSelf(g);
        p7.drawSelf(g);
        p8.drawSelf(g);
        p9.drawSelf(g);
        p10.drawSelf(g);
        p11.drawSelf(g);
        p12.drawSelf(g);
        p13.drawSelf(g);
        p14.drawSelf(g);
        p15.drawSelf(g);
        p16.drawSelf(g);
        p17.drawSelf(g);
        p18.drawSelf(g);
        p19.drawSelf(g);
        p20.drawSelf(g);
        //adding circle/player, bosses, and bullets
        p.drawSelf(g);
        //adding point counter
        Font a = new Font("Arial", Font.BOLD, 20);
        g.setColor(Color.MAGENTA);
        g.setFont(a);
        g.drawString("points: "+points, 900, 30);
        //instructions
        if (platformNumber == 0)
        {
            Font f = new Font("Arial",Font.BOLD, 25);
            g.setFont(f);
            g.setColor(Color.GRAY);
            g.drawString("PRESS UP ARROW TO JUMP",340, 255);
        }

        //displays when the player does not successfully jump
        if(!jump)
        {
            //player comes off screen
            p.setY(700);
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 1000, 500);
            
            //game over
            Font f = new Font("Arial", Font.BOLD, 40);
            g.setFont(f);
            g.setColor(Color.red);
            g.drawString("GAME OVER", 390, 255);
            
            //exit and open to replay
            Font f2 = new Font("Arial", Font.BOLD, 25);
            g.setFont(f2);
            g.setColor(Color.DARK_GRAY);
            g.drawString("exit and reopen to replay", 360, 310);
            
            //score
            Font f3 = new Font("Arial", Font.BOLD, 30);
            g.setColor(Color.MAGENTA);
            g.setFont(f3);
            g.drawString("your score: "+points, 410, 283);
        }
        
        //displays when the player reaches the last platform
        if(platformNumber == 20)
        {
            Font f = new Font("Arial",Font.BOLD,40);
            g.setFont(f);
            g.setColor(Color.RED);
            g.drawString("YOU WON", 400, 255);
            Font f2 = new Font("Arial",Font.BOLD,25);
            g.setFont(f2);
            g.setColor(Color.DARK_GRAY);
            g.drawString("exit and reopen to replay", 360, 310);
            Font f3 = new Font("Arial", Font.BOLD, 30);
            g.setColor(Color.MAGENTA);
            g.setFont(f3);
            g.drawString("your score: "+points, 410, 283);
            
        }  
    }

        public void loop()
        {                                           
            p1.act();
            p2.act();
            p3.act();
            p4.act();
            p5.act(); 
            p6.act();
            p7.act();
            p8.act();
            p9.act();
            p10.act();
            p11.act();
            p12.act();
            p13.act();
            p14.act();
            p15.act();
            p16.act();
            p17.act();
            p18.act();
            p19.act();
            p20.act();
            
            if(platformNumber == 1) 
                p.setVx(p1.getVelocity());
            else if(platformNumber == 2)
                p.setVx(p2.getVelocity());
            else if(platformNumber == 3)
                p.setVx(p3.getVelocity());
            else if(platformNumber == 4)
                p.setVx(p4.getVelocity());
            else if(platformNumber == 5)
                p.setVx(p5.getVelocity());
            else if(platformNumber == 6)
                p.setVx(p6.getVelocity());
            else if(platformNumber == 7)
                p.setVx(p7.getVelocity());
            else if(platformNumber == 8)
                p.setVx(p8.getVelocity());
            else if(platformNumber == 9)
                p.setVx(p9.getVelocity());
            else if(platformNumber == 10)
                p.setVx(p10.getVelocity());
            else if(platformNumber == 11)
                p.setVx(p11.getVelocity());
            else if(platformNumber == 12)
                p.setVx(p12.getVelocity());
            else if(platformNumber == 13)
                p.setVx(p13.getVelocity());
            else if(platformNumber == 14)
                p.setVx(p14.getVelocity());
            else if(platformNumber == 15)
                p.setVx(p15.getVelocity());
             else if (platformNumber == 16)
                p.setVx(p16.getVelocity());
            else if (platformNumber == 17)
                p.setVx(p17.getVelocity());
            else if (platformNumber == 18)
                p.setVx(p18.getVelocity());
            else if (platformNumber == 19)
                p.setVx(p19.getVelocity());
            else if (platformNumber == 20)
                p.setVx(p20.getVelocity());
            p.act();
            repaint();
        }
        public void keyTyped(KeyEvent e) 
        {
        }
        public void keyReleased(KeyEvent e) 
        {
        }
        public void mousePressed(MouseEvent e)
        {
        }
        public void mouseReleased(MouseEvent e)
        {
        }
        public void mouseClicked(MouseEvent e)
        {
        }
        public void mouseEntered(MouseEvent e)
        {
        }
        public void mouseExited(MouseEvent e)
        {
        }
        public void mouseMoved(MouseEvent e)
        {
        }
        public void mouseDragged(MouseEvent e)
        {
        }
        public void start(final int ticks){
        Thread gameThread = new Thread(){
            public void run(){
                while(true){
                    loop();
                    try{
                        Thread.sleep(1000 / ticks);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };	
        gameThread.start();
        }

    
}
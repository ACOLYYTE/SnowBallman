package swing;
import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class SwingTest {
    public static JFrame getJFrame(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(700,600);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setLocation(dimension.width/2-370,dimension.height/2-250);
        return frame;
    }
}
class MyComponent extends JComponent{
    public static Polygon poly1;
    public static Polygon poly2;
    public static Polygon HandPoly1;
    public static Polygon HandPoly2;
    public static Polygon HandPoly3;
    public static Polygon HandPoly4;
    public static Polygon HandPoly5;
    public static Polygon HandPoly6;
    public static Polygon HandPoly7;
    public static Polygon HandPoly8;


    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        Ellipse2D elipse1 = new Ellipse2D.Double(270,307,190,170);
        Ellipse2D elipse1White = new Ellipse2D.Double(274,309,185,165);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setStroke(new BasicStroke(3));
        int[] Hand1 = new int[4];
        int[] Hand2 = new int[4];
        Hand1[0]=425;Hand1[1]=500;Hand1[2]=502;Hand1[3]=427;
        Hand2[0]=240;Hand2[1]=220;Hand2[2]=230;Hand2[3]=250;
        HandPoly1 = new Polygon(Hand1,Hand2,4);
        g2.setColor(Color.white);
        g2.fill(HandPoly1);
        g2.setColor(Color.black);
        g2.draw(HandPoly1);
        Hand1[0]=500;Hand1[1]=510;Hand1[2]=515;Hand1[3]=510;
        Hand2[0]=220;Hand2[1]=187;Hand2[2]=190;Hand2[3]=217;
        HandPoly2 = new Polygon(Hand1,Hand2,4);
        g2.setColor(Color.white);
        g2.fill(HandPoly2);
        g2.setColor(Color.black);
        g2.draw(HandPoly2);
        Hand1[0]=510;Hand1[1]=540;Hand1[2]=541;Hand1[3]=512;
        Hand2[0]=217;Hand2[1]=211;Hand2[2]=220;Hand2[3]=226;
        HandPoly3 = new Polygon(Hand1,Hand2,4);
        g2.setColor(Color.white);
        g2.fill(HandPoly3);
        g2.setColor(Color.black);
        g2.draw(HandPoly3);
        Hand1[0]=512;Hand1[1]=528;Hand1[2]=526;Hand1[3]=502;
        Hand2[0]=226;Hand2[1]=243;Hand2[2]=249;Hand2[3]=230;
        HandPoly4 = new Polygon(Hand1,Hand2,4);
        g2.setColor(Color.white);
        g2.fill(HandPoly4);
        g2.setColor(Color.black);
        g2.draw(HandPoly4);




        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.draw(elipse1);
        g2.setColor(Color.white);
        g2.fill(elipse1White);
        g2.setColor(Color.black);
        Ellipse2D elipse2 = new Ellipse2D.Double(292,200,140,130);
        Ellipse2D elipse2White = new Ellipse2D.Double(295,204,135,125);
        g2.draw(elipse2);
        g2.setColor(Color.white);
        g2.fill(elipse2White);
        g2.setColor(Color.black);
        Ellipse2D elipse3 = new Ellipse2D.Double(310,107,105,100);
        Ellipse2D elipse3White = new Ellipse2D.Double(312,110,99,96);

        g2.draw(elipse3);
        g2.setColor(Color.white);
        g2.fill(elipse3White);
        Ellipse2D SmallElipse = new Ellipse2D.Double(350,140,10,10);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(2));
        g2.draw(SmallElipse);
        Ellipse2D SmallElipse2 = new Ellipse2D.Double(380,140,10,10);
        g2.draw(SmallElipse2);
        Ellipse2D SmallElipse3 = new Ellipse2D.Double(372,185,8,8);
        g2.draw(SmallElipse3);
        Ellipse2D SmallElipse4 = new Ellipse2D.Double(387,179,8,8);
        g2.draw(SmallElipse4);
        Ellipse2D SmallElipse5 = new Ellipse2D.Double(357,184,8,8);
        g2.draw(SmallElipse5);
        Ellipse2D SmallElipse6 = new Ellipse2D.Double(344,180,8,8);
        g2.draw(SmallElipse6);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        arr1[0]=370;
        arr1[1]=372;
        arr1[2]=435;
        arr2[0]=160;
        arr2[1]=173;
        arr2[2]=162;
        poly1 = new Polygon(arr1,arr2,3);

        arr1[0]=370;
        arr1[1]=372;
        arr1[2]=435;
        arr2[0]=160;
        arr2[1]=173;
        arr2[2]=162;
        g2.setColor(Color.white);
         poly2 = new Polygon(arr1,arr2,3);
        g2.fill(poly2);
        g2.setColor(Color.black);
        g2.draw(poly1);



        Ellipse2D SmallElipse7 = new Ellipse2D.Double(367,235,8,8);
        g2.draw(SmallElipse7);
        Ellipse2D SmallElipse8 = new Ellipse2D.Double(367,255,8,8);
        g2.draw(SmallElipse8);
        Ellipse2D SmallElipse9 = new Ellipse2D.Double(367,275,8,8);
        g2.draw(SmallElipse9);




        g2.setStroke(new BasicStroke(3));
        Hand1[0]=235;Hand1[1]=310;Hand1[2]=310;Hand1[3]=237;
        Hand2[0]=220;Hand2[1]=240;Hand2[2]=250;Hand2[3]=230;
        HandPoly5 = new Polygon(Hand1,Hand2,4);
        g2.setColor(Color.white);
        g2.fill(HandPoly5);
        g2.setColor(Color.black);
        g2.draw(HandPoly5);
        Hand1[0]=205;Hand1[1]=240;Hand1[2]=240;Hand1[3]=205;
        Hand2[0]=220;Hand2[1]=230;Hand2[2]=220;Hand2[3]=210;
        HandPoly6 = new Polygon(Hand1,Hand2,4);
        g2.setColor(Color.white);
        g2.fill(HandPoly6);
        g2.setColor(Color.black);
        g2.draw(HandPoly6);
        Hand1[0]=240;Hand1[1]=215;Hand1[2]=215;Hand1[3]=240;
        Hand2[0]=220;Hand2[1]=240;Hand2[2]=250;Hand2[3]=230;
        HandPoly7 = new Polygon(Hand1,Hand2,4);
        g2.setColor(Color.white);
        g2.fill(HandPoly7);
        g2.setColor(Color.black);
        g2.draw(HandPoly7);
        Hand1[0]=240;Hand1[1]=220;Hand1[2]=220;Hand1[3]=240;
        Hand2[0]=220;Hand2[1]=195;Hand2[2]=205;Hand2[3]=230;
        HandPoly8 = new Polygon(Hand1,Hand2,4);
        g2.setColor(Color.white);
        g2.fill(HandPoly8);
        g2.setColor(Color.black);
        g2.draw(HandPoly8);
        g2.setColor(Color.white);
        Ellipse2D el1 = new Ellipse2D.Double(232,220,12,11);
        g2.fill(el1);
        Ellipse2D el2 = new Ellipse2D.Double(499,217,15,14);
        g2.fill(el2);
        g2.setColor(Color.white);
        g2.fillOval(311,100,100,20);
        g2.setColor(Color.black);
        g2.drawOval(311,100,100,20);

        RoundRectangle2D rectR = new RoundRectangle2D.Double(331,57,63,50,23,23);
        g2.setColor(Color.white);
        g2.fill(rectR);
        g2.setColor(Color.black);
        g2.draw(rectR);
        g2.drawLine(331,93,393,93);

    }
}

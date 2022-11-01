import java.awt.*;

public class Paddle {
    //Fields (Class variables)
   int x;
   int y;
   int width = 20;
   int length = 300;

    //Constructors
    Paddle(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
		g.fillRect(this.x,this.y, this.width, this.length);
    }

}

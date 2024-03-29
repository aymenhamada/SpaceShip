import java.awt.Image;
import javax.swing.ImageIcon;
import java.net.URL;
public  class Sprite{

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;

    public Sprite(int x, int y){
        this.x = x;
        this.y = y;
        visible = true;
    }

    protected void loadImage(String imageName){
        URL url = getClass().getResource(imageName);
        ImageIcon ii = new ImageIcon(url);
        image = ii.getImage();
    }

    protected void getImageDimensions(){
        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    public Image getImage(){
        return image;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean isVisible(){
        return visible;
    }

    public void setVisible(Boolean visible){
        this.visible = visible;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
}
import java.awt.*;
import java.awt.geom.Arc2D;

public class CustomArc
{
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Cria um novo arco e estabelece sua posição e cor iniciais.
     */
    public CustomArc()
    {
        height = 170;
        width = 60;
        xPosition = 150;
        yPosition = 40;
        color = "magenta";
        isVisible = false;
    }

    /**
     * Torna a forma visível, se ela não estava.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
    /**
     * Torna a forma invisível, se ela não estava.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /**
     * Move a forma à direita por alguns pixels.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move a forma à esquerda por alguns pixels.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move a forma para cima por alguns pixels.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move a forma para baixo por alguns pixels.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move a forma à horizontalmente pelo número de pixels determinado por distance.
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move a forma à verticalmente pelo número de pixels determinado por distance.
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Muda o tamanho para um novo tamanho em pixels.
     */
    public void changeSize(int newHeight, int newWidth)
    {
        erase();
        height = newHeight;
        width = newWidth;
        draw();
    }

    /**
     * Muda a cor. Cores válidas são: "red", "yellow", "blue", "green",
     * "magenta" e "black".
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /**
     * Desenha a forma.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            
            canvas.draw(this, color, new Arc2D.Double(xPosition, yPosition, 
                         width,
                         height,
                         130, 200,
                         Arc2D.OPEN));
            canvas.wait(10);
        }
    }
        
    /**
     * Redesenha a forma
     */
    public void turn()
    {
        int temp = width;
        width = height;
        height = temp;
        color = "black";
        erase();
        draw();
    }
    
    /**
     * Copia uma outra forma e redesenha esta, redimensionada pelo multiplicador definido em resize.
     */
    public void copyAndResize(CustomArc customShape, int resize)
    {
        this.height = customShape.height*resize;
        this.width = customShape.width*resize;
        this.xPosition = customShape.xPosition*resize;
        this.yPosition = customShape.yPosition*resize;
        this.color = customShape.color;
        this.erase();
        this.draw();
    }
    
    /**
     * Apaga a forma na tela.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
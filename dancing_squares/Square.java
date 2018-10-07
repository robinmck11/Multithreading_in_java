public class Square
{
  private int width, height;

  private int posX, posY;

  public Square(){

  }

  public Square(int posX, int posY, int width, int height)
  {
    this.width = width;
    this.height = height;

    this.posX = posX;
    this.posY = posY;
  }

  public int getposX()
  {
    return posX;
  }

  public int getposY()
  {
    return posY;
  }

  public int getWidth(){
    return width;
  }

  public int getHeight(){
    return height;
  }

  public void setposX(int posX)
  {
      this.posX = posX;
  }

  public void setposY(int posY)
  {
      this.posY = posY;
  }

  public int getxRight(){
    int xRight = this.getposX() + this.getWidth();
    return xRight;
  }

  public int getxLeft(){
    int xLeft = this.getposX();
    return xLeft;
  }

  public int getyTop(){
    int yTop = this.getposY();
    return yTop;
  }

  public int getyBottom(){
    int yBottom = this.getposY() + this.getHeight();
    return yBottom;
  }

  public void setWidth(int width){
    this.width = width;
  }

  public void setHeight(int height){
    this.height = height;
  }

}

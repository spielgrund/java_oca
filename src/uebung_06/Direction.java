package uebung_06;

public class Direction
{
    private int direction = 0;

    public void turnLeft(){
        direction =  (--direction+4)%4;
    }

    public void turnRight(){
        direction = ++direction%4;
    }

    public int getDirection()
    {
        return direction;
    }

    public void setDirection(int direction)
    {
        if (0 <= direction)
        {
            direction = direction % 4;
        }
        else
        {
            while (direction < 0)
            {
                direction = direction+4;
            }
            direction = direction%4;
        }
        this.direction = direction;
    }

    @Override
    public String toString()
    {
        return "" + direction;
    }
}
